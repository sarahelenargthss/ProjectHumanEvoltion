<%-- 
    Document   : Historia
    Created on : 07/09/2017, 21:08:49
    Author     : Ana
--%>

<%@page import="principal.Capitulos"%>
<%@page import="dto.UsuarioDto"%>
<%@page import="dao.UsuarioDao"%>
<%@page import="dao.UsuarioDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/style.css">

    </head>
    <body>
        <div id="pagHistoria">
            <%
                String login = "";
                HttpSession ses = request.getSession(true);
                try {
                    login = (String) ses.getAttribute("logado");
                    if (!login.equals("")) {
                        UsuarioDao uDao = new UsuarioDao();
                        UsuarioDto uDto = uDao.retornaUsuario((String) ses.getAttribute("logado"));
                        Capitulos cap = new Capitulos(uDto.getCaminho());
                        out.println(cap.retornaHistoria());
                    }else{
                        out.println("<br /><br /><h2>Você precisa estar logado para consultar a história.</h2>");
                    }
                } catch (Exception e) {
                    out.println("<br /><br /><h2> Ocorreu um erro ao carregar a história </h2>");
                }
            %>
        </div>

    </body>
</html>
