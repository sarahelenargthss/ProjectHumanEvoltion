package principal;

public class Capitulos {

    private String caminho;
    char parte;
    char numParagrafo;

    public Capitulos(String caminho) {
        this.caminho = caminho;
        divideCaminho();
    }

    private void divideCaminho() {
        numParagrafo = caminho.charAt(caminho.length() - 1);
//        
        parte = caminho.charAt(caminho.length() - 2);
    }

    public String retornaParagrafo() {
        String paragrafo;
        switch ((int) parte) {
            case 65:
                //caminho A:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Encontram alguns computadores funcionando, mas sem comunicação com o continente. Acham um áudio do "
                                + "\n momento do ataque, numa discussão entre o CP e a Segurança.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')“Não detonar as pontes de acesso a IA para não perder os SH. Eles já chegaram no portão da ala de "
                                + "\n segurança e estão quase ultrapassando (Aparentemente tem um líder entre eles, comandando o ataque). ";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')CS berra que teve falha de segurança e CP ordena a contenção tentando manter o maior n° de SH, com "
                                + "\n gás tranquilizante. Não foi suficiente, ficaram ainda mais agressivos. ";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')Um  tio do alto comando do CS berra a senha pro CP pra porta ser fechada manualmente (não conseguiram "
                                + "\n contê-los) e o áudio continua com os sons de tudo quebrando”[os SH entraram na plataforma mataram "
                                + "\n todos] (o áudio silenciou do outro lado e só da pra ouvir que alguém do CP correu pra fechar a porta \n "
                                + "mas os SH já tava em cima).";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/02.png')Ficam curiosos sobre os SH e anotam a senha, mas ainda não sabem o que são. Discussão sobre os SH e"
                                + " \n alguém loqueando que todo mundo vai morrer.";
                        break;
                    case 102:
                        paragrafo = "background('imagens/cenarios/02.png')opcao=Ignorar a discussão e continuar procurando por pistas/Todo mundo quieto!";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 66:
                //caminho B:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Fechando as alas J1 encontra um laboratório onde tem um SH morto e um pesquisador morrendo, mas ainda \n "
                                + "vivo.A sala tem um cheiro forte de substâncias químicas (que disfarça o cheiro deles)";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Ele fala: “Antena. Continente. Animais” enquanto estica a mão em direção a gaveta [ta estirado no chão]. "
                                + " \n A pessoa morre. Eles abre a gaveta acham o mapa e pensam no que significam as palavras. ";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')SH começa a se mexer, Todo mundo se desespera e corre pra trás das bancadas. SH levanta da uma examinada \n "
                                + "no corpo, todo mundo da um sprinnt pra porta e aperta o botãozinho pra fechar.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')Encaram a porta mas o SH quebra o vidro e começa a tentar sair mas não consegue passar pelo espaço, \n"
                                + "então eles correm acham uma porta reforçada pacas, abrem, veem que é a ponte, saem. ";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/02.png')Acham á sala com as câmeras de segurança da IA. Voltam a gravação veem a abertura dos portões, e quando \n"
                                + "os SH foram pro CP e guardam a senha. Passeiam mais um pouco e acham umas arma de tranquilizante e é isso aí.";
                        break;
                    case 102:
                        paragrafo = "background('imagens/cenarios/02.png')opcao=Ir para a área de testes na ilha artificial/Voltar para o centro de pesquisa";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 67:
                //caminho C:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Sai da roda, acha o mapa, chama os outros, resolve ir para o centro de segurança procurar armas para ir \n"
                                + " para a antena. ";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Enquanto decidem escutam uns barulhos perto da entrada do edifício. A porta é arrombada e um SH aparece. ";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')Eles, tendo o mapa, correm pra entrada da ponte e fecham o SH no CP com a senha que pegaram do audio. \n "
                                + "Chegam no CS , acham armas (tranquilizantes)";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')opcao=Ir para a área de testes na ilha artificial/Voltar para o centro de pesquisa";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 68:
                //caminho D:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Eles param de falar e ouvem uns barulhos vindos de algum lugar e seguem o barulho, antes pegam algumas \n"
                                + "armas de seguranças do CP que cuidavam do portão e estão mortos tbm. ";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Não encontram nada quando procuraram pelo barulho, mas encontram o mapa enquanto estavam vasculhando tudo. \n"
                                + "Vão pelo corredor principal dos laboratórios e o SH sai de um deles e brota atrás. ";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')Eles disparam uns tranquilizantes e quando o outro fica desorientado, eles fogem pro lado contrário, cada \n"
                                + "vez mais pra dentro do CP.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')opcao=Continuar correndo e continuar atirando/Quebrar o vidro da porta de um laboratório e usá-lo como arma pra tentar matar o SH";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 69:
                //caminho E:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Saem do CS vão para IA, veem os cativeiros e exploram o lugar até chegar na área de teste (convivência) e \n"
                                + "encontrar um grupo de SH ";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Dão umas atiradas SH fica puto pega J3 na ponte (voltando pro CS) e mata, os outros correm loucamente pela \n"
                                + "ponte para o cs;";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')opcao=Explodir a ponte de acesso a IA/Continua correndo e atirando";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 70:
                //caminho F:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Tem as arminha e voltam pro CP";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')(não narra pegando as armas, só o caminho até o CP)";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')abrem o portão e acham um SH, fogem dele, o que fazer?";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')- - FIM - -";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 71:
                //caminho G:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Eles continuam correndo e o SH os alcança, pegando um dos especialistas. J3 é morto, mas eles conseguem um \n"
                                + "tempo para fugirem. ";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Eles correm pelo corredor até chegarem em uma bifurcação, seguem pela esquerda e chegam na área central \n"
                                + "onde estavam inicialmente. Pensavam no que fazer.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')- - FIM - -";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 72:
                //caminho H:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')J2 quebra o vidro e mata o SH e todos olham assustados para ele(a)";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')- - FIM - -";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 73:
                //caminho I:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')explodem a ponte de acesso ao IA e vão para o CP";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')- - FIM - -";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 74:
                //caminho J:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Encontram alguns computadores funcionando, mas sem comunicação com o continente. Acham um áudio do momento \n"
                                + " do ataque, numa discussão entre o CP e a Segurança.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')- - FIM - -";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            case 75:
                //caminho K:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Ta fugindo dos SH doido, com as arminha.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')chegam no CP e tem tempo de fechar o portão.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')quando olham pro lado, em direção a saida, tem um SH la."
                                + "todo mundo corre.\n"
                                + "cabou.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')- - FIM - -";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            default:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/cpDown.png')-- Project: Human Evolution --";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/01.png')O helicóptero com os especialistas chega a ilha(e vai embora)";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')esses vão para o centro de pesquisa e não encontram ninguém apenas um centro vazio, parcialmente destruído \n "
                                + "e os corpos destroçados.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/03.png')Eles não sabiam que foram os SH(eles apenas sabiam que iam trabalhar com cobaias em um projeto secreto).";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/04.png')opcao=Procurar meio de comunicação com o continente/Trancar algumas alas do centro para manter certa segurança";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
        }
        return paragrafo;
    }

    public String getCaminho() {
        return caminho;
    }

    public void atualizaCaminhoFrente(char novo, int muda) {
        switch (muda) {
            case 2:
                caminho = caminho.substring(0, caminho.indexOf(numParagrafo)) + novo + "a";
                parte = novo;
                numParagrafo = 'a';
                break;
            case 3:
                caminho = caminho.substring(0, caminho.indexOf(numParagrafo)) + novo;
                numParagrafo = novo;
                break;
        }
        System.out.println("atualizado: " + caminho);
    }

    public String caminhoFrente() {
        switch ((int) parte) {
            case 65:
                //caminho A:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                    case 98:
                        atualizaCaminhoFrente('c', 3);
                        break;
                    case 99:
                        atualizaCaminhoFrente('d', 3);
                        break;
                    case 100:
                        atualizaCaminhoFrente('e', 3);
                        break;
                    case 101:
                        atualizaCaminhoFrente('f', 3);
                        break;
                }
                break;
            case 66:
                //caminho B:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                    case 98:
                        atualizaCaminhoFrente('c', 3);
                        break;
                    case 99:
                        atualizaCaminhoFrente('d', 3);
                        break;
                    case 100:
                        atualizaCaminhoFrente('e', 3);
                        break;
                    case 101:
                        atualizaCaminhoFrente('f', 3);
                        break;
                }
                break;
            case 67:
                //caminho C:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                    case 98:
                        atualizaCaminhoFrente('c', 3);
                        break;
                    case 99:
                        atualizaCaminhoFrente('d', 3);
                        break;
                }
                break;
            case 68:
                //caminho D:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                    case 98:
                        atualizaCaminhoFrente('c', 3);
                        break;
                    case 99:
                        atualizaCaminhoFrente('d', 3);
                        break;
                }
                break;
            case 69:
                //caminho E:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                    case 98:
                        if (caminho.charAt(caminho.indexOf("E") - 1) == 'B') {
                            atualizaCaminhoFrente('c', 3);
                        } else {
                            atualizaCaminhoFrente('K', 2);
                        }
                        break;
                }
                break;
            case 70:
                //caminho F:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                    case 98:
                        atualizaCaminhoFrente('c', 3);
                        break;
                    case 99:
                        if (caminho.charAt(caminho.indexOf("F") - 1) == 'B') {
                            atualizaCaminhoFrente('H', 2);
                        } else {
                            atualizaCaminhoFrente('d', 3);
                        }
                        break;
                }
                break;
            case 71:
                //caminho G:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                    case 98:
                        atualizaCaminhoFrente('c', 3);
                        break;
                }
                break;
            case 72:
                //caminho H:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                }
                break;
            case 73:
                //caminho I:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                }
                break;
            case 74:
                //caminho J:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                }
                break;
            case 75:
                //caminho K:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                    case 98:
                        atualizaCaminhoFrente('c', 3);
                        break;
                    case 99:
                        atualizaCaminhoFrente('d', 3);
                        break;
                }
                break;
            default:
                switch ((int) numParagrafo) {
                    case 97:
                        atualizaCaminhoFrente('b', 3);
                        break;
                    case 98:
                        atualizaCaminhoFrente('c', 3);
                        break;
                    case 99:
                        atualizaCaminhoFrente('d', 3);
                        break;
                    case 100:
                        atualizaCaminhoFrente('e', 3);
                        break;
                }
                break;
        }
        return caminho;
    }

    public String retornaHistoria() {
        String historia = "";
        String pag;
        if ((int) caminho.charAt(1) >= 65 && (int) caminho.charAt(1) <= 75) {
            parte = '1';
            numParagrafo = 'a';
            do {
                pag = retornaParagrafo();
                if (pag.equals("nulo")) {
                    historia += "<br /><br />" + " -- ";
                } else {
                    pag = pag.replace(pag.substring(0, pag.indexOf(")") + 1), "");
                    if (!pag.contains("opcao=")) {
                        historia += "<br /><br />" + pag;
                    }
                }
                numParagrafo = (char) ((int) numParagrafo + 1);
            } while (!pag.equals("nulo"));
            for (int i = 1; i < caminho.length(); i++) {
                if ((int) caminho.charAt(i + 1) >= 65 && (int) caminho.charAt(i + 1) <= 75) {
                    parte = caminho.charAt(i);
                    numParagrafo = 'a';
                    do {
                        pag = retornaParagrafo();
                        if (pag.equals("nulo")) {
                            historia += "<br /><br />" + " -- ";
                        } else {
                    pag = pag.replace(pag.substring(0, pag.indexOf(")") + 1), "");
                            if ((!pag.contains("opcao=")) && (!pag.contains("FIM"))) {
                                historia += "<br /><br />" + pag;
                            }
                        }
                        numParagrafo = (char) ((int) numParagrafo + 1);
                    } while (!pag.equals("nulo"));
                    //numero de paragrafos
                } else if ((int) caminho.charAt(i + 1) >= 97 && (int) caminho.charAt(i + 1) <= 122) {
                    numParagrafo = 'a';
                    do {
                        parte = caminho.charAt(i);
                        pag = retornaParagrafo();
                        if (pag.equals("nulo")) {
                            historia += "<br /><br />" + " -- ";
                        } else {
                    pag = pag.replace(pag.substring(0, pag.indexOf(")") + 1), "");
                            if ((!pag.contains("opcao=")) && (!pag.contains("FIM"))) {
                                historia += "<br /><br />" + pag;
                            }
                        }
                        numParagrafo = (char) ((int) numParagrafo + 1);
                        System.out.println(numParagrafo);
                    } while ((int) numParagrafo <= (int) caminho.charAt(i + 1));
                    break;
                }
            }

        } else {
            do {
                pag = retornaParagrafo();
                if (pag.equals("nulo")) {
                    historia += "<br /><br />" + " -- ";
                } else {
                    pag = pag.replace(pag.substring(0, pag.indexOf(")") + 1), "");
                    if (!pag.contains("opcao=")) {
                        historia += "<br /><br />" + pag;
                    }
                }
                numParagrafo = (char) (((int) numParagrafo) + 1);
                System.out.println(numParagrafo);
            } while ((int) numParagrafo <= (int) caminho.charAt(1));
        }
        divideCaminho();
        return historia;
    }

    public char retornaOpcao(int numOpcao) {
        char[] caminhos = new char[2];
        switch ((int) parte) {
            case 65:
                caminhos[0] = 'C';
                caminhos[1] = 'D';
                break;
            case 66:
                caminhos[0] = 'E';
                caminhos[1] = 'F';
                break;
            case 67:
                caminhos[0] = 'E';
                caminhos[1] = 'F';
                break;
            case 68:
                caminhos[0] = 'G';
                caminhos[1] = 'H';
                break;
            case 69:
                caminhos[0] = 'I';
                caminhos[1] = 'J';
                break;
            default:
                caminhos[0] = 'A';
                caminhos[1] = 'B';
                break;
        }
        return caminhos[numOpcao];
    }

}
