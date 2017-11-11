<%@page import="javax.servlet.http.HttpSession"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" href="css/style.css">

        <script>

            $(document).ready(
                    function () {

                        $("#continua").click(
                                function () {
                                    $("#inicial").load("Jogo.jsp");
                                }
                        );

                        var modal = document.getElementById('confirmNovo');
                        var btnAbre = document.getElementById("novo");
                        var btnCancela = document.getElementById("cancelar");
                        var span = document.getElementsByClassName("close")[0];
                        btnAbre.onclick = function () {
                            modal.style.display = "block";
                        }
                        span.onclick = function () {
                            modal.style.display = "none";
                        }
                        btnCancela.onclick = function () {
                            modal.style.display = "none";
                        }
                        window.onclick = function (event) {
                            if (event.target == modal) {
                                modal.style.display = "none";
                            }
                        }

                    }

            );

//            function novoJogo() {
//
//                var modal = document.getElementById('confirmNovo');
//                modal.style.display = "none";
            <%//request.getSession(true).setAttribute("nJ", true);%>
//                $("#inicial").load("Jogo.jsp");
//            }


        </script>

    </head>
    <body>

        <div id="inicial">
            <%
                String login = "";
                try {
                    HttpSession ses = request.getSession(false);
                    login = (String) ses.getAttribute("logado");
                    //if (!ses.getAttribute("logado").equals(null)) {
                    if (!login.equals("")) {


            %>

            <div style="padding-top: 240px;">
                <button id="continua" class="btn">Continuar Jogo</button>
                <br>
                <button id="novo" class="btn">Novo Jogo</button>
            </div>

            <%            } else {
            %>

            <p style="font: 25px/30px monospace; padding-top: 30%; 
               background: rgba(0,0,0,0.75);
               color: #fff; 
               height: 600px;">
                Você precisa estar logado para jogar! <br>
                Clique no ícone de login no canto superior direito da tela.
            </p>

            <%
                }
            } catch (Exception e) {
            %>

            <p style="font: 25px/30px monospace; padding-top: 30%; 
               background: rgba(0,0,0,0.75);
               color: #fff; 
               height: 600px;">
                Você precisa estar logado para jogar! <br>
                Clique no ícone de login no canto superior direito da tela.
            </p>

            <%
                }
            %>
        </div>

        <div id="confirmNovo" class="modal">

            <!-- Modal content -->
            <div class="modal-content">
                <span class="close">&times;</span>
                <p>Seu jogo anterior será perdido! <br /></p>
                <button id="confirmar" onclick="javascript: novoJogo()" class="btn">Continuar</button>
                <br>
                <button id="cancelar" class="btn">Cancelar</button>
            </div>

        </div>

        <script>

        </script>

    </body>
</html>
