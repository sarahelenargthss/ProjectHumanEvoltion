package util;

public class comentarios {

    /*
    ________________________________________________________
    SOBRE O CAMINHO:
        o paragrafo 'a' de cada capitulo (antes de entrar em uma parte) é a abertura do cap
        dai o retornaParagrafo retorna "abertura"
    
        quando chega na tela de opções da parte, o numParagrafo = ao último paragrafo
        dai o retornaParagrafo retorna ("opcao #-" + <primeira opção> + "/" + <segunda opção>) 
        (a barra vai ser usada para separar as opções, através do split())
        (vai começar a contar as opções a partir do indexOf("-"))
    
    obs: número máximo de caracteres por parágrafo é 360!!!!!!!!!!!!!
    obs: o limite pode ser até 391 no máximo já pulando as linhas
    ___________________________________________________________
   
    -------------------------------------------------------------
    _____________________________________________________________
      var product = document.getElementById("usuario");
                        var use = product.getAttribute("data-prodnumber");
                        if (use === "ola") {
                            $("#primeiro").css("display", "none");
                            $("#segundo").css("display", "block");
                        }
                        product.innerHTML = "<%request.setAttribute("chave", "parei");%>";
    _____________________________________________________________
    
    ---------------------------------------------------------------
    ______________________________________________________________
    function proxParagrafo() {
 +//                try {
 +//                    var product = document.getElementById("usuario");
 +//                    var use = product.getAttribute("data-prodnumber");
 +////                    var uDao = new UsuarioDao();
 +////                    var uDTO = uDao.retornaUsuario(use);
 +////                    var cap = new Capitulos(uDTO.getCaminho());
 +////                    uDTO.setCaminho(cap.caminhoFrente());
 +////                    if (uDao.atualizaUsuario(uDTO)) {
 +//                    var elem = document.getElementById("paragrafo");
 +//                    elem.innerHTML = "funcionou";
 +////                    } el 
 +//                } catch (e) {
 +//                    alert("de pau: " + e.printStackTrace);
 +//                }
 +//            }
    _________________________________________________________________
    
    ------------------------------------------------
    __________________________________________________________________
    { var b = {'nome': 'Gabriel', 'sobrenome': 'Rodrigues'};      }
    { b = JSON.stringify(b);                                      }
    { sessionStorage.setItem('chave', b);                         }
    { var c = JSON.parse(sessionStorage.getItem('chave'));        }
    { console.info(c);                                            }
    ___________________________________________________________________
    
   --------------------------------------------------------------
    ________________________________________________________________________
    arrumar o caminho e as setas pra voltar/ir pro paragrafo anterior/próximo respectivamente;
        o próximo foi feito, mas precisa ser arrumado pra ele não recarregar toda a pagina quando apertado, pq dai 
    a pagina não volta exatamente onde fica a tela de jogo,ela começa do inicio
    _______________________________________________________________________
    
    a parte de pegar só a div proximo, por exemplo, do Pragrafo não está funcionand
    tem que arranjar outro jeito :/
    
     */
}
