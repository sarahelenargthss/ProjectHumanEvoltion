<!DOCTYPE html>
<html>
    <head>
        <title>Project: Human Evolution</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/style.css">
        <script src="jquery-1.10.2.js">
        </script>

        <script>


            $(document).ready(
                    function () {

                        $("#conteudo").load("teste.jsp");

                        $("#jogo").click(
                                function () {
                                    $("#conteudo").load("teste.jsp");
                                }
                        );
                        $("#historia").click(
                                function () {
                                    $("#conteudo").load("Historia.jsp");
                                }
                        );
                        $("#personagens").click(
                                function () {
                                    $("#conteudo").load("Personagens.jsp");
                                }
                        );
                    }

            );
        </script>

    </head>
    <body>

        <div id="barraLogo" >
            <a href="index.jsp"><img id="logo" alt="logo" src="imagens/pgrande.png"/></a>

            <%
                boolean verificaLogin = false;
                HttpSession ses = request.getSession(true);
                ses.setAttribute("novoJogo", "novo");
                try {
                    if (!((String) ses.getAttribute("logado")).equals("")) {
                        verificaLogin = true;
                    }
                } catch (Exception e) {
                    verificaLogin = false;
                }

                if (verificaLogin) {

            %>

            <div class="dropdown">
                <button id="user" style="background: transparent; border: none; cursor: pointer;"><img alt="user" src="imagens/user.png"/></button>
                <div class="dropdown-content">
                    <a href="controlador?op=logout">Logout</a>
                </div>
            </div>

            <%            } else {
            %>

            <div class="dropdown">
                <button id="user" style="background: transparent; border: none; cursor: pointer;"><img alt="user" src="imagens/user.png"/></button>
                <div class="dropdown-content">
                    <div id="caixaLogin" class="modal">
                        <div class="login-html">
                            <span class="close">&times;</span>
                            <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Login</label>
                            <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab">Cadastro</label>
                            <div class="login-form">
                                <form class="form" action="controlador" method="post">  
                                    <input type="hidden" name="op" value="fazlogin">
                                    <div class="sign-in-htm">
                                        <div class="group">
                                            <input id="nome" class="input" type="text" name="user" placeholder="Nome de Usuário">
                                        </div>
                                        <div class="group">
                                            <input id="senha" class="input" type="password" name="senha" placeholder="Senha">
                                        </div>
                                        <div class="group">
                                            <input type="submit" class="button" value="Login">
                                        </div>
                                    </div>
                                </form>
                                <form class="form" action="controlador" method="post">  
                                    <input type="hidden" name="op" value="fazCadastro">
                                    <div class="sign-up-htm">
                                        <div class="group">
                                            <input class="input" type="text" name="user" placeholder="Nome de Usuário">
                                        </div>
                                        <div class="group">
                                            <input class="input" type="password" name="senha" placeholder="Senha">
                                        </div>
                                        <div class="group">
                                            <input class="input" type="password" name="senhaConfirm" placeholder="Confirmar Senha">
                                        </div>
                                        <div class="group">
                                            <input type="submit" class="button" value="Cadastrar">
                                        </div>
                                    </div>
                                </form>
                            </div>
                            <div class="alert" style=" background-color: #333;">
                                  <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span> 
                                Espaços adicionados antes e depois do nome ou senha serão desconsiderados!
                            </div> 
                            <%
                                ses = request.getSession();
                                try {
                                    if (!((String) ses.getAttribute("eCad")).equals("")) {

                            %>
                            <div class="alert" style=" background-color: #993e3e;">
                                  <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span> 

                                  <%                                    out.println(ses.getAttribute("eCad"));
                                    ses.setAttribute("eCad", "");
                                %>
                            </div> 
                            <%                                    } else {
                                if (!((String) ses.getAttribute("erroLogin")).equals("")) {


                            %>
                            <div class="alert" style=" background-color: #993e3e;">
                                  <span class="closebtn" onclick="this.parentElement.style.display = 'none';">&times;</span> 

                                  <%                                    out.println(ses.getAttribute("erroLogin"));
                                    ses.setAttribute("erroLogin", "");
                                %>
                            </div> 

                            <%
                                        }
                                    }

                                } catch (Exception u) {
                                    ses.setAttribute("eCad", "");
                                }
                            %>
                        </div>
                    </div>
                </div>
            </div>
            <%
                }
            %>

        </div>
        <nav id="nav">
            <ul class="barraNav">
                <li><a href="#" id="jogo">Jogo</a></li>
                <li><a href="#" id="historia">Ver História</a></li>
                <li><a href="#" id="personagens">Personagens</a></li>
            </ul>
        </nav>



        <div id="conteudo">

        </div>

        <div id="rodape">
            Desenvolvedoras: Brenna Struck & Sara Theiss      |     2017
            Todos os direitos reservados.
        </div>


        <script>

            var modal = document.getElementById('caixaLogin');
            var btn = document.getElementById("user");
            var span = document.getElementsByClassName("close")[0];
            btn.onclick = function () {
                modal.style.display = "block";
            };
            span.onclick = function () {
                modal.style.display = "none";
            };
            window.onclick = function (event) {
                if (event.target == modal) {
                    modal.style.display = "none";
                }
            };
//            try{
//            ses = request.getSession(true);
//            if (!((String)ses.getAttribute("eCad")).equals("")){
//            modal.style.display = "block";
//            }
//            } catch (Exception e) {
//            ses.setAttribute("eCad", "");
//            }
        </script>

    </body>
</html>
