<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="dao.UsuarioDao"%>
<%@page import="dto.UsuarioDto"%>
<%@page import="principal.Capitulos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Jogo</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/style.css">




        <script language="JavaSript">
            $(document).ready(
                    function () {
                        $("#paragrafo").load("Paragrafo.jsp #principal");
                    }

            );
            function proxParagrafo() {
                try {
                    $("#paragrafo").load("Paragrafo.jsp #proximo");
                } catch (e) {
                    alert(e);
                }
            }


        </script>



    </head>

    <body>


        <div id="telaJogo">
            <%
                try {
                    HttpSession ses = request.getSession();
                    UsuarioDao uDao = new UsuarioDao();
                    UsuarioDto uDto = uDao.retornaUsuario((String) ses.getAttribute("logado"));
//                    if ((ses.getAttribute("nJ")).equals(true)) {
//                        uDto.setCaminho("1a");
//                        uDao.atualizaUsuario(uDto);
//                    }
                    Capitulos cap = new Capitulos(uDto.getCaminho());
                    String paragrafo = cap.retornaParagrafo();
                    if (paragrafo.indexOf("opcao=") != -1) {
                        String[] ops = paragrafo.substring(paragrafo.indexOf("=") + 1, paragrafo.length()).split("/");
            %>
            <div id="opcoes" style="display: block; background: rgba(255,255,255, 0.8); min-height: 580px; max-height: 580px; padding-top: 220px;">
                O que fazer:<br>
                <form method="post" action="controlador">
                    <input type="hidden" name="op" value="opcao">  
                    <!-- Testar como o controlador pegaria os valores e saberia qual o btn clicado -->
                    <!-- Verificar se deve ser feito como button ou como input -->
                    <button id="1op" onclick="controlador?op = opcao" class="btnOp"><%out.println(ops[0]);%></button>
                    <br>
                    <button id="2op" class="btnOp"><%out.println(ops[1]);%></button>
                    <!--<input type="submit" class="btnOp" value="<% //out.println(ops[0]);%>" />-->
                </form>
            </div>

            <%} else {%>
            <div id="caixaTexto">
                <table style=" background: transparent; border: none;">
                    <tr>
                        <td>
                            <a href="#" style="float: left; background: transparent; border: none;" id="back">
                                <img alt="back" style="float: left;" src="imagens/back.png"/>
                            </a>
                        </td>
                        <td style="min-width: 795px;">
                            <div id="paragrafo" style="margin-left: 6px; margin-right: 6px; float: end;">
                                <%

                                %> 

                            </div>
                        </td>
                        <td>
                            <a href="javascript:proxParagrafo();" style="float: right;  background: transparent; border: none;" id="next">
                                <img alt="next" style="float: right;" src="imagens/next.png"/>
                            </a>
                        </td>
                    </tr>
                </table>
            </div>
            <% }

                } catch (Exception e) {
                    out.println("erro: " + e.getMessage());
                }%>
        </div>

    </body>
</html>
