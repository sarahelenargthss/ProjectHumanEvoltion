<%@page import="principal.Capitulos"%>
<%@page import="dto.UsuarioDto"%>
<%@page import="dao.UsuarioDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jogo</title>
        <link rel="stylesheet" href="css/style.css">

        <script>

            function proxParagrafo() {
                $.get("controlador?op=proxParagrafo", function (paragrafo) {
                    verificaParagrafo(paragrafo);
                    montaCenario();
                });
            }

            function montaCenario() {
                $.get("controlador?op=retornaCenario", function (url) {
                    $("#telaJogo").css("background", "url(" + url + ")");
                });
            }

            function verificaParagrafo(p) {
                if (p.indexOf("opcao=") !== -1) {
                    var ops = p.substring(p.indexOf("=") + 1, p.length).split("/");
                    $("#pOp").css("display", "block");
                    $("#paragrafo").css("display", "none");
                    $("#next").css("display", "none");
                    $("#a").text(ops[0]);
                    $("#b").text(ops[1]);
                } else {
                    $("#pOp").css("display", "none");
                    $("#paragrafo").css("display", "block");
                    $("#next").css("display", "block");
                    $("#paragrafo").text(p);
                    if (p.indexOf("Continua...") !== -1) {
                        $("#next").css("display", "none");
                    }
                }
            }

            $(document).ready(
                    function () {

                        $.get("controlador?op=retornaParagrafo", function (paragrafo) {
                            verificaParagrafo(paragrafo);
                            montaCenario();
                        });

                        $("#a").click(function () {
                            $.get("controlador?op=opcaoA", function (paragrafo) {
                                $.get("controlador?op=retornaParagrafo", function (paragrafo) {
                                    verificaParagrafo(paragrafo);
                                    montaCenario();
                                });
                            });
                        });

                        $("#b").click(function () {
                            $.get("controlador?op=opcaoB", function () {
                                $.get("controlador?op=retornaParagrafo", function (paragrafo) {
                                    verificaParagrafo(paragrafo);
                                    montaCenario();
                                });
                            });
                        });

                        $("#continua").click(function () {
                            $("#telaJogo").css("display", "block");
                            $("#inicial").css("display", "none");
                        });

                        $("#confirmar").click(function () {
                            $.get("controlador?op=novoJogo", function () {
                                $("#confirmNovo").css("display", "none");
                                $("#telaJogo").css("display", "block");
                                $("#inicial").css("display", "none");
                                $.get("controlador?op=retornaParagrafo", function (paragrafo) {
                                    verificaParagrafo(paragrafo);
                                    montaCenario();
                                });
                            });
                        });

                        var modal = document.getElementById('confirmNovo');
                        var btnAbre = document.getElementById("novo");
                        var btnCancela = document.getElementById("cancelar");
                        var span = document.getElementsByClassName("close")[0];
                        btnAbre.onclick = function () {
                            modal.style.display = "block";
                        };

                        span.onclick = function () {
                            modal.style.display = "none";
                        };
                        btnCancela.onclick = function () {
                            modal.style.display = "none";
                        };
                        window.onclick = function (event) {
                            if (event.target === modal) {
                                modal.style.display = "none";
                            }
                        };

                    }

            );

        </script>

    </head>
    <body>

        <div id="telaJogo">
            <div id="caixaTexto">
                <table style=" background: transparent; border: none;">
                    <tr>
                        <td style="min-width: 830px;">
                            <div id="paragrafo" style="margin-left: 6px; margin-right: 6px; float: end;">
                                <%                                        %> 
                            </div>
                            <div id="pOp" style="display: none; margin-left: 6px; margin-right: 6px; float: end;">
                                O que fazer: 
                                <br> 
                                <button id="a" class="btnOp"></button>
                                <br>
                                <button id="b" class="btnOp"></button>
                            </div>
                        </td>
                        <td>
                            <a href="javascript:proxParagrafo();" style="display: block; float: right;  background: white; border-radius: 45%; border: none;" id="next">
                                <img alt="next" style="float: right;" src="imagens/next.png"/>
                            </a>
                        </td>
                    </tr>
                </table>
            </div>
        </div>


        <div id="inicial">
            <%
                HttpSession ses = request.getSession();
                boolean logado = true;
                try {
                    ses = request.getSession(false);
                    String login = (String) ses.getAttribute("logado");
                    if (login.equals("")) {
                        logado = false;
                    }
                } catch (Exception e) {
                    logado = false;
                }

                if (logado) {


            %>
            <div style="padding-top: 240px;">
                <button name="op" value="jogo" id="continua" class="btn">Continuar Jogo</button>
                <br>
                <button id="novo" class="btn">Novo Jogo</button>
            </div>
            <%            } else {
            %>
            <div style="font: 25px/30px monospace; padding-top: 30%; background: rgba(0,0,0,0.75); color: #fff; height: 600px;">
                Você precisa estar logado para jogar! <br>
                Clique no ícone de login no canto superior direito da tela.
            </div>
            <%
                }
            %>
        </div>


        <div id="confirmNovo" class="modal">
            <div class="modal-content">
                <span class="close">&times;</span>
                <p>Seu jogo anterior será perdido! <br /></p>
                <button  name="op" value="novoJogo" id="confirmar" class="btn">Continuar</button>
                <br>
                <button id="cancelar" class="btn">Cancelar</button>
            </div>
        </div>

    </body>
</html>
