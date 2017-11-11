<%@page import="principal.Capitulos"%>
<%@page import="dto.UsuarioDto"%>
<%@page import="dao.UsuarioDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paragrafo</title>

        <link rel="stylesheet" href="css/style.css">

    </head>
    <body>

        <%
            HttpSession ses = request.getSession(true);
            UsuarioDao uDao = new UsuarioDao();
            UsuarioDto uDto = uDao.retornaUsuario((String) ses.getAttribute("logado"));
            Capitulos cap = new Capitulos(uDto.getCaminho());

            String paragrafo = cap.retornaParagrafo();
            paragrafo = paragrafo.replace(paragrafo.substring(0 ,paragrafo.indexOf(")")+1), "");
            if (paragrafo.indexOf("opcao=") != -1) {
                String[] ops = paragrafo.substring(paragrafo.indexOf("=") + 1, paragrafo.length()).split("/");
        %>
        O que fazer:
        <br>
        <form method="post" action="controlador">
            <input type="hidden" name="op" value="opcaoA">  
            <button class="btnOp"><%out.println(ops[0]);%></button>
        </form>
        <form method="post" action="controlador">
            <input type="hidden" name="op" value="opcaoB">  
            <button class="btnOp"><%out.println(ops[1]);%></button>
        </form>

        <%} else {
                out.println(paragrafo);
            }
        %>

    </body>
</html>
