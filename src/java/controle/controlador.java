package controle;

import dao.UsuarioDao;
import dto.UsuarioDto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import principal.Capitulos;
import util.Util;

@WebServlet(name = "controlador", urlPatterns = {"/controlador"})
public class controlador extends HttpServlet {

    private RequestDispatcher rd = null;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String op = request.getParameter("op");
            HttpSession ses = request.getSession(true);

            UsuarioDao uDao = new UsuarioDao();

            switch (op) {
                case "fazlogin": {
                    String nome = request.getParameter("user").toLowerCase();
                    String senha = request.getParameter("senha").toLowerCase();
                    int verifica = uDao.verificaUsuario(nome);
                    switch (verifica) {
                        case 1:
                            UsuarioDto uDto = uDao.retornaUsuario(nome);
                            if (uDto != null) {
                                if (uDto.getSenha().equals(senha)) {
                                    ses.setAttribute("logado", nome);
                                    ses.setAttribute("erroLogin", "");
                                } else {
                                    ses.setAttribute("erroLogin", "Login: Senha incorreta!");
                                }
                            } else {
                                //erro com o BD
                                ses.setAttribute("mensagem", "Erro ao realizar conexão com o BD!");
                                ses.setAttribute("idImagem", "imagens/sucesso.gif");
                                response.sendRedirect("mensagem.jsp");
                            }
                            response.sendRedirect("index.jsp");
                            break;
                        case 2:
                            //usuário não cadastrado;
                            ses.setAttribute("erroLogin", "Login: Usuário ainda não cadastrado: " + nome);
                            response.sendRedirect("index.jsp");

                            break;
                        case 3:
                            ses.setAttribute("mensagem", "Erro ao fazer login!");
                            ses.setAttribute("idImagem", "imagens/sucesso.gif");
                            response.sendRedirect("mensagem.jsp");
                            break;
                    }
                    break;
                }
                case "logout":
                    ses.setAttribute("logado", "");
                    response.sendRedirect("index.jsp");
                    break;
                case "verificaLC":
                    if(!((String)ses.getAttribute("eCad")).equals("") || !((String)ses.getAttribute("erroLogin")).equals("")){
                        out.println("erro");
                    }else{
                        out.println("");
                    }
                case "fazCadastro":
                    if (Util.validaString(request.getParameter("user")) || Util.validaString(request.getParameter("senha").trim()) || Util.validaString(request.getParameter("senhaConfirm"))) {
                        ses.setAttribute("eCad", "Cadastro: Todos os campos devem ser preenchidos!");
                    } else if (!request.getParameter("senha").equals(request.getParameter("senhaConfirm"))) {
                        ses.setAttribute("eCad", "Cadastro: As senhas não são correspondentes!");
                    } else {
                        UsuarioDto uDto = new UsuarioDto();
                        boolean erro = false;
                        try {
                            uDto.setNome(request.getParameter("user").trim().toLowerCase());
                            uDto.setSenha(request.getParameter("senha").trim().toLowerCase());
                            uDto.setCaminho("1a");
                        } catch (Exception e) {
                            erro = true;
                        }
                        if (erro) {
                            ses.setAttribute("mensagem", "Ocorreu um erro ao salvar os dados!");
                            ses.setAttribute("idImagem", "imagens/sucesso.gif");
                            response.sendRedirect("mensagem.jsp");
                        } else {
                            int b = uDao.verificaUsuario(uDto.getNome());
                            switch (b) {
                                case 1:
                                    ses.setAttribute("eCad", "Cadastro: Usuário já cadastrado!");
                                    break;
                                case 3:
                                    ses.setAttribute("mensagem", "Ocorreu um erro ao salvar os dados!");
                                    ses.setAttribute("idImagem", "imagens/sucesso.gif");
                                    response.sendRedirect("mensagem.jsp");
                                    break;
                                default:
                                    if (uDao.insereUsuario(uDto)) {
                                        ses.setAttribute("logado", uDto.getNome());
                                    } else {
                                        //avisa que deu erro na hora do cadastro
                                        ses.setAttribute("mensagem", "Ocorreu um erro ao salvar os dados!");
                                        ses.setAttribute("idImagem", "imagens/sucesso.gif");
                                        response.sendRedirect("mensagem.jsp");
                                    }
                                    break;
                            }
                        }

                    }
                    response.sendRedirect("index.jsp");
                    break;
                case "opcaoA":
                case "opcaoB": {
                    int numOpcao = (op.charAt(5) == 'A') ? 0 : 1;
                    UsuarioDto uDto = uDao.retornaUsuario((String) ses.getAttribute("logado"));
                    Capitulos cap = new Capitulos(uDto.getCaminho());
                    char novo = cap.retornaOpcao(numOpcao);
                    cap.atualizaCaminhoFrente(novo, 2);
                    uDto.setCaminho(cap.getCaminho());
                    uDao.atualizaUsuario(uDto);
                    break;
                }
                case "novoJogo": {
                    UsuarioDto uDto = uDao.retornaUsuario((String) ses.getAttribute("logado"));
                    uDto.setCaminho("1a");
                    if (!uDao.atualizaUsuario(uDto)) {
                        ses.setAttribute("mensagem", "Ocorreu um erro ao ao apagar seus dados antigos!");
                        response.sendRedirect("mensagem.jsp");
                    }
                    break;
                }
                case "verificaNovoJogo": {
                    boolean v = ((String) ses.getAttribute("ob")).equals("novoJogo");
                    ses.setAttribute("ob", "");
                    out.println(v);
                }
                case "retornaCenario": {
                    UsuarioDto uDto = uDao.retornaUsuario((String) ses.getAttribute("logado"));
                    Capitulos cap = new Capitulos(uDto.getCaminho());
                    String p = cap.retornaParagrafo();
                    String e = p.substring(11, p.indexOf(")"));
                    out.println(e);
                    break;
                }
                case "proxParagrafo": {
                    UsuarioDto uDto = uDao.retornaUsuario((String) ses.getAttribute("logado"));
                    Capitulos cap = new Capitulos(uDto.getCaminho());
                    uDto.setCaminho(cap.caminhoFrente());
                    uDao.atualizaUsuario(uDto);
                    String paragrafo = cap.retornaParagrafo();
                    paragrafo = paragrafo.replace(paragrafo.substring(0, paragrafo.indexOf(")") + 1), "");
                    out.println(paragrafo);
                    break;
                }
                case "retornaParagrafo": {
                    UsuarioDto uDto = uDao.retornaUsuario((String) ses.getAttribute("logado"));
                    Capitulos cap = new Capitulos(uDto.getCaminho());
                    String paragrafo = cap.retornaParagrafo();
                    paragrafo = paragrafo.replace(paragrafo.substring(0, paragrafo.indexOf(")") + 1), "");
                    out.println(paragrafo);
                    break;
                }
                default:
                    ses.setAttribute("mensagem", "Ocorreu um erro no controlador e a opção '" + op + "' não pôde ser realizada!");
                    response.sendRedirect("mensagem.jsp");
                    break;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
