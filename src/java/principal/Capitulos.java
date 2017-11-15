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
        parte = caminho.charAt(caminho.length() - 2);
    }

    public String retornaParagrafo() {
        String paragrafo;
        switch ((int) parte) {
            case 65:
                //caminho A:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/02.png')Seguindo um corredor do Centro de Pesquisa, os especialistas se deparam com várias salas. A cada novo espaço o medo e a curiosidade duelavam no domínio sobre suas ações. Por fim, resolveram desbravar o local para buscarem uma ajuda. Eles seguiam juntos pelo corredor, em busca de manter alguma proteção sobre o grupo, em uma prevenção a qualquer coisa que pudesse ter acontecido naquele lugar.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Após algum tempo passando por várias salas de pesquisa bagunçadas, finalmente o grupo se depara com alguns computadores. Um sentimento de esperança crescia sob o peito de alguns, outros tentaram suprimir até que conseguissem ajuda para sair dali. Logo Jack sai na frente e começa a mexer em um dos computadores que ainda estava inteiro.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')Após alguns segundos teclando e olhando fixamente para a tela, o Professor solta um suspiro pesado e se volta aos outros.\n"
                                + "-Sem acesso a Internet ou qualquer meio externo."
                                + "Os cinco especialistas olham em desespero para Jack. Como sairiam dali? -E isso não é tudo. Deixaram um áudio aberto. Talvez possa ser algo importante…-Tenta uma falsa animação na voz.\n"
                                + "-Vamos logo então!- Exasperada Abby solta.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')Quando todos se põe ao redor do computador em um círculo, Jack libera a gravação aumentando o volume do áudio. \"Alerta! Alerta! (Sons agitados seguem o barulho constante de uma sirene. Algumas vozes conversam mas não é possível discernir o que falam.) -Não detonar as pontes de acesso! Não podemos danificar os SH! Um homem gritava com grande agitação na voz.";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/02.png')Sons de digitação sobrepunham rapidamente a sirene e alguns resmungos que conversavam com o homem. - Já chegaram no portão da ala de segurança, estão ultrapassando! Um grande estrondo é ouvido ao fundo. -Droga!  - Alguma voz feminina libera furiosa.\n"
                                + "-Sofremos uma falha na segurança! - Um homem ressoa na gravação, seguindo os vários barulhos ao fundo. -Podem utilizar o gás!-Um grande barulho de vidro corta o ambiente.";
                        break;
                    case 102:
                        paragrafo = "background('imagens/cenarios/02.png')- Agora! - A voz continua a ditar ordens.- Senhor, precisamos fechar a porta manualmente. A senha é IA379936, temos que fech…. - A voz do homem é cortada por ruídos extremamente altos, levando os especialistas a acreditarem que se davam no mesmo ambiente da gravação. \n"
                                + "Um silêncio se apodera do áudio por alguns segundos, quando logo depois uma respiração ofegante e passos pesados correndo.";
                        break;
                    case 103:
                        paragrafo = "background('imagens/cenarios/02.png')Um baque. Os especialistas se assustam. E novamente reina o silêncio no áudio tão estranho que acabaram de ouvir.\n"
                                + "Eles se entreolhavam, cada um com a mente em um turbilhão de ideias e teorias, mas uma grande lacuna a ser preenchida. O que era tudo aquilo? Quem seriam os SH? O que estava acontecendo naquele lugar?";
                        break;
                    case 104:
                        paragrafo = "background('imagens/cenarios/02.png')Por fim, a única dúvida no rosto de todos era :  sobreviveremos?\n"
                                + "- Acho melhor anotarmos aquela senha, talvez precisaremos. - Diz Samy pensativa olhando para o computador a sua frente.";
                        break;
                    case 105:
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
                        paragrafo = "background('imagens/cenarios/02.png')Seguindo temerosos pelos corredorea frios do centro de pesquisa, os especialistas resolvem tomar precauções, afinal, tudo o que viram naquela recepção ainda assombrava suas mentes a cada fôlego tomado. \n"
                                + "Assim, logo começaram a debater que atitudes tomar diante de algo que provavelmente não lhes faria bem.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Como cientistas, o debate não demorou a vir, cada um explanando suas teorias e métodos que deviam ser empregados.\n"
                                + "-Acredito que nada disso irá funcionar!- Exclamou exasperado Professor Jack. -Acreditem, todas essas teorias são interessantes e até dignas de um estudo, mas se queremos realmente sair daqui e entender o que aconteceu, não temos tempo para deduções.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')Eu penso que devemos agir de forma a nos protegermos de que algo como aquilo na recepção aconteça conosco.\n"
                                + "-E o que você sugere?- Questiona Michael.\n"
                                + "-Eu não tenho ideia….\n"
                                + "Um segundo depois da troca de olhares entre os seis, Joshua se manifesta.\n"
                                + "-Podemos manter algumas alas do centro trancadas, seja lá o que tem do lado de fora, garantiremos que se mantenha lá até a ajuda chegar.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')- Joshua mantém um semblante calmo, como se toda aquela situação fosse uma aula qualquer que não lhe permitisse grande entusiasmo, porém sua ideia rendeu um sorriso a face temerosa de Jules.\n"
                                + "-Isso é ótimo Joshua! Com isso podíamos descobrir e planejar possíveis rotas de fuga!\n"
                                + "E assim começaram a colocar o plano em prática.";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/02.png')Após fecharem e vasculharem algumas alas do centro,o grupo chega a uma ala demarcada com um J vermelho sob uma placa de vidro.\n"
                                + "Ao entrar no ambiente logo ficam chocados.\n"
                                + "Assim como a recepção, o caos lhes saltam os olhos, bem como um ser estranho deitado sobre o chão, aparentemente morto. O ser desprovido de pelos, claramente albino e com roupas básicas de cores neutras permanecia inerte em um canto da sala.";
                        break;
                    case 102:
                        paragrafo = "background('imagens/cenarios/02.png')Ao vasculharem com mais atenção o local, avistaram outro corpo. Um jaleco branco. O cheiro extremamente forte. Um provavel pesquisador.\n"
                                + "Após constatarem o óbvio, se apressam em direção ao pesquisador e percebem sua fraca respiração.\n"
                                + "-Ele está vivo! -Clama Abby claramente surpresa.\n"
                                + "Ao ouvir a voz da mulher, o homem caído ao chão próximo de alguns armários abre os olhos em espanto.";
                        break;
                    case 103:
                        paragrafo = "background('imagens/cenarios/02.png')Ele rapidamente passa os olhos pelo grupo de especialistas que lhe retribui um olhar suplicante de informações.\n"
                                + "- Ant…Antena. Vocês….Antena, Continente….Anim….Animais.-Fala o pesquisador com voz rouca e falha, enquanto em claro esforço ergue sua mão suja de sangue em direção a uma gaveta ao lado de Samy.";
                        break;
                    case 104:
                        paragrafo = "background('imagens/cenarios/02.png')Samy rapidamente abre a gaveta com expectativa de ter em mãos a salvação para longe daquele lugar. Mas, novamente lhe surgem duvidas ao pegar nad mãos um simples mapa. Seus olhos correm em direção ao pesquisador, mas percebe Jules ao lado dele, com as mãos em seu pescoço fino. Morto. \n"
                                + "Um leve ruído lhes chamam a atenção,não permitindo o debate que se iniciaria sobre o mapa nas mãos da mulher loira.";
                        break;
                    case 105:
                        paragrafo = "background('imagens/cenarios/02.png')O corpo estranho que antes jazia totalmente imóvel começava a se mexer. O taquicardia acometeu-se sobre todos, quando em uma decisão unânime rápida, correm para trás de uma bancada. O estranho logo se levanta, aparentemente bem o suficiente para estar vivo e em forma, bem diferente da visão deste há poucos minutos atrás.";
                        break;
                    case 106:
                        paragrafo = "background('imagens/cenarios/02.png')Quando o estranho aproveita para olhar ao seu redor, todo se encaminham com a mesma pressa pulsantr nas veias em direção a porta. Ao ver a movimentação, o estranho se coloca em movimento como um raio, assustando ainda mais os especialistas que fervorosamente tentam fechar a porta.\n"
                                + "-Droga de botão! Fecha! Fecha! Fecha!- Gritavam alguns.";
                        break;
                    case 107:
                        paragrafo = "background('imagens/cenarios/02.png')Após alguns apertos insistente a porta de fecha, poucos segundos antes do morto vivo ao alcançar. \n"
                                + "Com o coração ainda acelerado, o grupo permanece estagnado em choque, olhando aquele estranho ser focar em cada um. Porém o choque é brutalmente encerrado quando a figura quebra o vidro da porta e começa a tentar se lançar para fora.";
                        break;
                    case 108:
                        paragrafo = "background('imagens/cenarios/02.png')Mais que depressa o grupo corre para uma sala próxima e tranca a porta. Sorte deles que ao analisarem uma segunda vez se estavam mesmo trancados ali, perceberam quão forte aquela porta era. \n"
                                + "Logo eles percebem que estão em uma sala de segurança.\n"
                                + "Ao perceber o exato lugar em que se encotram, Jules toma as rédeas e se coloca em frente aos monitores que escondiam uma das paredes da sala.\n";
                        break;
                    case 109:
                        paragrafo = "background('imagens/cenarios/02.png')-Jules? O que está fazendo?-Pergunta Joshua ainda ofegante.\n"
                                + "-Especialista em tecnologia. Entre outras coisas. - Com um sorriso presunçoso Jules responde o colega enquanto trabalha em uma velocidade espantosa.\n"
                                + "-Poderia ter mencionado isso antes não acha? - Questiona Michael com um leve ar de deboche.";
                        break;
                    case 110:
                        paragrafo = "background('imagens/cenarios/02.png')Jules ainda concentrada se presta somente a lhe lançar um rápido olhar, porém o bastante para não ser mais questionada sobre o assunto.\n"
                                + "Todos mantém seus olhos em Jules, até que seus movimentos frenéticos cessam.\n"
                                + "Nas telas aparecem uma imagem, uma gravação de um lugar com as mesmas características do centro de pesquisa. Provavelmente um lugar próximo dali.";
                        break;
                    case 111:
                        paragrafo = "background('imagens/cenarios/02.png')A imagem mostra um portão com dois guardas munidos com uma arma estranha. Um pouco depois vários elementos como aquele visto na sala com o pesquisador aparecem correndo de forma assombrosamente rapida e deixam os dois guardas mortos. Não antes de um deles apertar um botão vermelho no aparelho preso em sua cintura.";
                        break;
                    case 112:
                        paragrafo = "background('imagens/cenarios/02.png')Em instantes o barulho de uma cirene ressoa nas imagens, só então eles percebem que as gravações não tem som. Porém nas imagens a seguir uma sala cheia de homens se desesperam olhando para todos os lados como se buscassem por algo. Em um canto da tela é possível ver o mesmo vídeo dos guardas mortos nos portões ser transmitido em um monitor de frente para um daqueles homens.";
                        break;
                    case 113:
                        paragrafo = "background('imagens/cenarios/02.png')Logo, este pega o que parece ser um telefone, e passa algum tempo agitando os braços, enquanto todos ao seu redor começam a ficar cada vez mais agitados. É quando novamente aqueles seres são vistos. \n"
                                + "Os especialistas olham intensamente as imagens do massacre a sua frente. Pulam quando um dos homens é morto violentamente por um ser albino, enquanto o homem com o telefone em mãos parece gritar.";
                        break;
                    case 114:
                        paragrafo = "background('imagens/cenarios/02.png')É possível ver suas mãos tremerem quando ele pega um pedaço de papel de sua mesa e uma caneta e escreve algo rapidamente.\n"
                                + "Jack franze seu cenho não entendendo a atitude do homem em frente ao terror que via. Mas todos passam a entender a atitude quando o homem tenta, de forma discreta, escondida, chegar a camera.";
                        break;
                    case 115:
                        paragrafo = "background('imagens/cenarios/02.png')Ele coloca o papel em frente a ela e todos podem ver uma combinação de letras e números. Talvez alguma informação relevante para os especialistas. Principalmente para Samy e sua memória fotográfica.\n"
                                + "Porém , os minutos seguintes , eram extamente um daqueles momentos em que tudo que Samy gostaria era de poder esquecer algo.";
                        break;
                    case 116:
                        paragrafo = "background('imagens/cenarios/02.png')O papel que antes trazia uma provavel senha, caía aos poucos da frente da camera, escorrendo quase lentamente como o sangue respingado nele.\n"
                                + "Ao fim das gravações, os especialistas permanecem parados em seus lugares por algum tempo. Talvez um tempo consideravelmente grande, cada um tentando absorver e processar tudo que tinham visto até ali.\n";
                        break;
                    case 117:
                        paragrafo = "background('imagens/cenarios/02.png')Mas, todos são interrompidos quando Jack se posiciona em suas frentes com algo em mãos.\n"
                                + "A arma grande e imponente não combinava em nada com o Professor qua a segurava, fazendo-os comparar com quando a viram nas mãos dos guardas mortos no portão. Ela realmente era imponente. Vendo que conseguira atenção, Jack gira a arma em suas mãos, deixando visível a inscrição de sua lateral. \n"
                                + "Arma Tranquilizante. ";
                        break;
                    case 118:
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
                        paragrafo = "background('imagens/cenarios/02.png')Os especialistas olharam uns para os outros. Claramente existiam várias opções que poderiam tomar ali, mas naquele momento eles permaneceram imersos nas vozes que acabaram de ouvir. \n"
                                + "Jack logo saiu de sua imersão e começou a vasculhar o local. Ao perceber a movimentação de Jack, Jules resolveu lhe seguir.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Pouco tempo depois, cada especialista seguia por cada canto procurando alguma pista.\n"
                                + "Ao chegar próximo a alguns armários, Abby encontra um mapa de três ilhas. Aquele era um ótimo sinal.\n"
                                + "-Pessoal! Achei um mapa!- gritou ela chamando a atenção dos outros.\n"
                                + "Logo os especialistas se aproximaram de uma bancada para que pudessem analisar o mapa em mãos.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')-São três ilhas, aqui, aqui e aqui. Estão vendo este ponto, aparentemente se trata de uma antena. Vocês entendem? Talvez , se chegarmos até ela podemos tentar chamar alguma ajuda.- Fala Abby concentrada em um plano que sua mente traçava.\n"
                                + "-Acho uma boa ideia, mas podíamos passar por esta ilha aqui, este deve ser o centro de segurança, podem haver coisas lá das quais precisaremos….";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')- Todos olham para Joshua com uma interrogação em suas faces. -Armas! Não sabemos com o que estamos lidando, armas são sempre bem vindas quando se tem uma recepção como aquela que passamos.\n"
                                + "Em um unânime assentir, tomam o mapa e se preparam para seguir ao centro de segurança. Porém, antes de partirem, o grupo ouve sons vindo da entrada do centro de pesquisa.";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/02.png')Ao tentarem identificar o que acontecia, se sobressaltam no momento que a porta é arrombada e uma estranha figura lhes aparece.\n"
                                + "Um homem de roupas simples em cores neutras, provavelmente o responsável por aquele feito, careca e extremamente albino.\n"
                                + "Com olhos arregalados , o grupo de especialistas sai em disparada para o mais longe possível.";
                        break;
                    case 102:
                        paragrafo = "background('imagens/cenarios/02.png')Seguindo o mapa nas mãos de Joshua, eles conseguem chegar a uma ponte com um portão em sua entrada. \n"
                                + "O portão detinha um painel , o que logo os fez pensar na senha que tinham ouvido no áudio. \n"
                                + "Samy e sua incrível memória logo digitaram a senha no painel, ouvindo um suave clique em resposta. \n"
                                + "Rapidamente todos atravessam o portão , fechando-o logo em seguida.\n";
                        break;
                    case 103:
                        paragrafo = "background('imagens/cenarios/02.png')Cuidadosamente, todos seguem em direção ao prédio central, provavelmente aquele era o centro de segurança. \n"
                                + "Ao adentrarem, o ambiente não diferia em nada à aquele visto na recepção do centro de pesquisa horas atrás. Talvez a grande diferença seja o tanto de armas dispostas em várias salas.";
                        break;
                    case 104:
                        paragrafo = "background('imagens/cenarios/02.png')Joshua, tomando a frente, inspeciona as várias armas escolhendo aquelas que acredita serem necessárias para chegarem a Antena.\n"
                                + "-Isso é o suficiente. Vamos lá!-Diz ele se dirigindo ao estranho grupo que agora segurava as armas escolhidas por ele.";
                        break;
                    case 105:
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
                        paragrafo = "background('imagens/cenarios/01.png')O helicóptero com 6 especialistas sobrevoa um território inóspito russo. O voo, totalmente fora de radares, segue pelo denso mar, quase que completamente congelado de Okhotsk. Aparentemente, todos naquele helicóptero faziam parte da pequena porcentagem de seres vivos, naquele ambiente extremo, o que não parecia os assustar.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')Aqueles eram os seis especialistas convidados para participarem de um experimento em uma ilha em algum ponto daquele mar de águas estranhas, o que de suma já era um ponto de desconfiança, visto as grandes dificuldades climáticas que viram até ali.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/03.png')Os especialistas mantinham uma conversa um tanto tímida, discutindo sobre as últimas novidades do projeto genoma X, depois de tentarem obter quaisquer informações adicionais sobre o experimento que participariam, porém, ao que parecia, todos sabiam exatamente nada. Porém, logo ouviram a voz do piloto:";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/03.png')\"Por favor doutores, permaneçam encostados nos assentos e com a cabeça entre os joelhos. Daqui poucos minutos passaremos por um campo magnético de retenção, que poderá causar alguma turbulência. Fiquem atentos a possíveis sangramentos nasais. Seguindo todos os procedimentos logo estaremos pousando!";
                        break;
                    case 102:
                        paragrafo = "background('imagens/cenarios/03.png')Todos logo seguiram as ordens do piloto, curiosos acerca do tal campo de retenção mencionado. Após uma leve turbulência, o helicóptero logo pousou sobre uma área destinada a ele na ilha. Ao descerem e todos tomarem suas bagagens, rapidamente o helicóptero os deixa.";
                        break;
                    case 103:
                        paragrafo = "background('imagens/cenarios/03.png')-Bem, alguém sabe se vamos ser recepcionados pelo coordenador? - Pergunta Joshua.\n"
                                + "-Acho melhor esperarmos aqui. Alguém deve estar vindo nos receber. -Se pronuncia Dra. Abby, ajeitando sua franja castanha sob a testa.";
                        break;
                    case 104:
                        paragrafo = "background('imagens/cenarios/03.png')-Concordo. Enquanto isso, se não se importam, vou fazer fotos para o portfólio. Olhem como o campo magnético consegue armazenar o clima artificial sem nenhuma evidência externa! Fascinante! Realmente muito curioso! - O homem ruivo pega sua câmera pendurada sobre o pescoço, se afastando do grupo enquanto resmungava ainda mais fascinado sobre o campo magnético.";
                        break;
                    case 105:
                        paragrafo = "background('imagens/cenarios/03.png')-Quem é aquele ali mesmo? Não me recordo dele falando qualquer palavra antes....- Pergunta um homem sentado sob sua mala. Seus olhos pequenos quase deixando uma aparência infantil, não fossem suas roupas desgastadas e o cabelo raspado.";
                        break;
                    case 106:
                        paragrafo = "background('imagens/cenarios/03.png')-Acredito que aquele seja o Professor Jack, doutor Michael. Ouvi dizer que ele é um verdadeiro gênio da genética, apenas acredito que tenha um medo de altura e por isso permaneceu quieto no helicóptero. - Termina risonha a jovem Jules, realçando sua covinha assimétrica na bochecha e balançando seus cabelos pretos repicados.";
                        break;
                    case 107:
                        paragrafo = "background('imagens/cenarios/01.png')Após algumas horas de espera, os especialistas cansados resolvem seguir caminho para o centro de pesquisa, acreditando que o coordenador deveria tê-los esquecido.\n"
                                + "-Isso tudo é tão estranho! Nunca vi um lugar tão quieto. -Resmunga a loira chamada Samy. Alguns assentem, mas ninguém toma coragem em falar mais nada.";
                        break;
                    case 108:
                        paragrafo = "background('imagens/cenarios/03.png')Logo que alcançam a porta do centro percebem a mesma quebrada. Ansiosos e temerosos decidem entrar rapidamente, mas logo que o fazem estancam em seus lugares.";
                        break;
                    case 109:
                        paragrafo = "background('imagens/cenarios/03.png')O cenário que veem é um completo caos. A recepção tem sua bancada parcialmente quebrada, com uma longa mancha de sangue seguindo em direção a uma poça negra atrás do balcão. De onde estão todos conseguem visualizar uma pálida mão repousando sobre a poça, sendo adornada por vários papéis já manchados ao seu redor.";
                        break;
                    case 110:
                        paragrafo = "background('imagens/cenarios/03.png')Com completo choque, cada um segue um caminho, não acreditando no que seus olhos presenciam. Podiam perceber que várias janelas estavam quebradas, uma boa parte detinha alguns tecidos pendurados nos vidros que ainda se mantinham firmes, outras com algumas manchas e respingos de sangue. ";
                        break;
                    case 111:
                        paragrafo = "background('imagens/cenarios/03.png')Em um dos cantos, era possível ver o que antes deveria ser um mapa da ilha que estavam. Agora, não passava de vários recortes pendurados em uma moldura na parede.\n"
                                + "-O que aconteceu aqui? - Sussurrou Jules. Apesar do tom baixo, todos puderam ouvi-la claramente, bem como as respirações aceleradas pelo choque.  Se abaixando lentamente Jules toca em um dos corpos jogados no chão, vendo o quão gelado já se encontra.";
                        break;
                    case 112:
                        paragrafo = "background('imagens/cenarios/03.png')-Acho que encontrei algo!\n"
                                + "Naquele instante o coração de cada um naquela sala errou uma batida, uns pela esperança de uma resposta, outros pelo medo ou ansiedade. Rapidamente todos viram seus olhos em direção ao estranho Professor Jack, se aproximando dele lentamente. ";
                        break;
                    case 113:
                        paragrafo = "background('imagens/cenarios/03.png')Em seu campo de visão se encontrava um grande monitor, piscando em letras vermelhas o grande perigo que aqueles cientistas estavam prestes a conhecer.\n"
                                + "\"Alerta Máximo: Segurança da IA Comprometida!!\"";
                        break;
                    case 114:
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
                //Muda o capítulo
                caminho = caminho.substring(0, caminho.indexOf(numParagrafo)) + novo + "a";
                parte = novo;
                numParagrafo = 'a';
                break;
            case 3:
                //Muda o parágrafo
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
                    case 102:
                        atualizaCaminhoFrente('g', 3);
                        break;
                    case 103:
                        atualizaCaminhoFrente('h', 3);
                        break;
                    case 104:
                        atualizaCaminhoFrente('i', 3);
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
                    case 102:
                        atualizaCaminhoFrente('g', 3);
                        break;
                    case 103:
                        atualizaCaminhoFrente('h', 3);
                        break;
                    case 104:
                        atualizaCaminhoFrente('i', 3);
                        break;
                    case 105:
                        atualizaCaminhoFrente('j', 3);
                        break;
                    case 106:
                        atualizaCaminhoFrente('k', 3);
                        break;
                    case 107:
                        atualizaCaminhoFrente('l', 3);
                        break;
                    case 108:
                        atualizaCaminhoFrente('m', 3);
                        break;
                    case 109:
                        atualizaCaminhoFrente('n', 3);
                        break;
                    case 110:
                        atualizaCaminhoFrente('o', 3);
                        break;
                    case 111:
                        atualizaCaminhoFrente('p', 3);
                        break;
                    case 112:
                        atualizaCaminhoFrente('q', 3);
                        break;
                    case 113:
                        atualizaCaminhoFrente('r', 3);
                        break;
                    case 114:
                        atualizaCaminhoFrente('s', 3);
                        break;
                    case 115:
                        atualizaCaminhoFrente('t', 3);
                        break;
                    case 116:
                        atualizaCaminhoFrente('u', 3);
                        break;
                    case 117:
                        atualizaCaminhoFrente('v', 3);
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
                    case 100:
                        atualizaCaminhoFrente('e', 3);
                        break;
                    case 101:
                        atualizaCaminhoFrente('f', 3);
                        break;
                    case 102:
                        atualizaCaminhoFrente('g', 3);
                        break;
                    case 103:
                        atualizaCaminhoFrente('h', 3);
                        break;
                    case 104:
                        atualizaCaminhoFrente('i', 3);
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
                    case 101:
                        atualizaCaminhoFrente('f', 3);
                        break;
                    case 102:
                        atualizaCaminhoFrente('g', 3);
                        break;
                    case 103:
                        atualizaCaminhoFrente('h', 3);
                        break;
                    case 104:
                        atualizaCaminhoFrente('i', 3);
                        break;
                    case 105:
                        atualizaCaminhoFrente('j', 3);
                        break;
                    case 106:
                        atualizaCaminhoFrente('k', 3);
                        break;
                    case 107:
                        atualizaCaminhoFrente('l', 3);
                        break;
                    case 108:
                        atualizaCaminhoFrente('m', 3);
                        break;
                    case 109:
                        atualizaCaminhoFrente('n', 3);
                        break;
                    case 110:
                        atualizaCaminhoFrente('o', 3);
                        break;
                    case 111:
                        atualizaCaminhoFrente('p', 3);
                        break;
                    case 112:
                        atualizaCaminhoFrente('q', 3);
                        break;
                    case 113:
                        atualizaCaminhoFrente('r', 3);
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
