<%@page import="java.lang.String"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operação executada</title>

        <style>
            body{
                background: #969696 ;
                font: 25px monospace;
            }
            #sucesso{
                background: #fff;
                padding: 30px;
                margin: auto;
                margin-top: 100px;
                max-width: 90%;
                min-width: 90%;
                box-shadow: 0px 8px 16px 0px rgba(51,51,51,0.2);
            }
            #btn:hover{
                background: #ef6b6b;
            }
            #btn{
                background: #e04c4c;
                color: #fff;
                font: 25px monospace;
                border-radius: 5px;
                cursor: pointer;
                padding: 7px;
                text-decoration: highlight;
                margin: 15px;
                min-width: 235px;
                max-width: 235px;
                float: right;
            }
        </style>

    </head>
    <body>

        <%
            HttpSession ses = request.getSession(true);
            String msg = (String) ses.getAttribute("mensagem");
        %>

        <div id="sucesso">
            <p>
                <b>
                    <h2>
                        <img src="imagens/alert.png" alt="alerta" style="width:35px">
                        <%=msg%>
                    </h2>
                </b>
            </p>
            <br><br><br>
            <a id="btn" href="index.jsp">Recarregar Página</a>
        </div>

    </body>
</html>
