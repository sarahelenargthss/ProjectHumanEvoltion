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
                        paragrafo = "background('imagens/cenarios/05.png')Seguindo um corredor do Centro de Pesquisa, os especialistas se deparam com várias salas. A cada novo espaço o medo e a curiosidade duelavam no domínio sobre suas ações. Por fim, resolveram desbravar o local para buscarem uma ajuda. Eles seguiam juntos pelo corredor, em busca de manter alguma proteção sobre o grupo, em uma prevenção a qualquer coisa que pudesse ter acontecido naquele lugar.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/04.png')Após algum tempo passando por várias salas de pesquisa bagunçadas, finalmente o grupo se depara com alguns computadores. Um sentimento de esperança crescia sob o peito de alguns, outros tentaram suprimir até que conseguissem ajuda para sair dali. Logo Jack sai na frente e começa a mexer em um dos computadores que ainda estava inteiro.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/04.png')Após alguns segundos teclando e olhando fixamente para a tela, o Professor solta um suspiro pesado e se volta aos outros.\n"
                                + "-Sem acesso a Internet ou qualquer meio externo."
                                + "Os cinco especialistas olham em desespero para Jack. Como sairiam dali? -E isso não é tudo. Deixaram um áudio aberto. Talvez possa ser algo importante…-Tenta uma falsa animação na voz.\n"
                                + "-Vamos logo então!- Exasperada Abby solta.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/04.png')Quando todos se põe ao redor do computador em um círculo, Jack libera a gravação aumentando o volume do áudio. \"Alerta! Alerta! (Sons agitados seguem o barulho constante de uma sirene. Algumas vozes conversam mas não é possível discernir o que falam.) -Não detonar as pontes de acesso! Não podemos danificar os SH! Um homem gritava com grande agitação na voz.";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/04.png')Sons de digitação sobrepunham rapidamente a sirene e alguns resmungos que conversavam com o homem. - Já chegaram no portão da ala de segurança, estão ultrapassando! Um grande estrondo é ouvido ao fundo. -Droga!  - Alguma voz feminina libera furiosa.\n"
                                + "-Sofremos uma falha na segurança! - Um homem ressoa na gravação, seguindo os vários barulhos ao fundo. -Podem utilizar o gás!-Um grande barulho de vidro corta o ambiente.";
                        break;
                    case 102:
                        paragrafo = "background('imagens/cenarios/04.png')- Agora! - A voz continua a ditar ordens.- Senhor, precisamos fechar a porta manualmente. A senha é IA379936, temos que fech…. - A voz do homem é cortada por ruídos extremamente altos, levando os especialistas a acreditarem que se davam no mesmo ambiente da gravação. \n"
                                + "Um silêncio se apodera do áudio por alguns segundos, quando logo depois uma respiração ofegante e passos pesados correndo.";
                        break;
                    case 103:
                        paragrafo = "background('imagens/cenarios/04.png')Um baque. Os especialistas se assustam. E novamente reina o silêncio no áudio tão estranho que acabaram de ouvir.\n"
                                + "Eles se entreolhavam, cada um com a mente em um turbilhão de ideias e teorias, mas uma grande lacuna a ser preenchida. O que era tudo aquilo? Quem seriam os SH? O que estava acontecendo naquele lugar?";
                        break;
                    case 104:
                        paragrafo = "background('imagens/cenarios/04.png')Por fim, a única dúvida no rosto de todos era :  sobreviveremos?\n"
                                + "- Acho melhor anotarmos aquela senha, talvez precisaremos. - Diz Samy pensativa olhando para o computador a sua frente.";
                        break;
                    case 105:
                        paragrafo = "background('imagens/cenarios/04.png')opcao=Ignorar a discussão e continuar procurando por pistas/Todo mundo quieto!";
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
                        paragrafo = "background('imagens/cenarios/05.png')Os especialistas olharam uns para os outros. Claramente existiam várias opções que poderiam tomar ali, mas naquele momento eles permaneceram imersos nas vozes que acabaram de ouvir. \n"
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
                        paragrafo = "background('imagens/cenarios/05.png')- Todos olham para Joshua com uma interrogação em suas faces. -Armas! Não sabemos com o que estamos lidando, armas são sempre bem vindas quando se tem uma recepção como aquela que passamos.\n"
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
                        paragrafo = "background('imagens/cenarios/02.png')O silêncio chegava a ser pertubador. Após a confusão anterior, quando todos decidiram falar ao mesmo tempo, o silêncio que imperava podia ser considerado bem vindo, porém, dadas as circunstâncias, não lhes causava nada além de apreensão. Alguns barulhos estranhos cortaram a atmosfera silenciosa, fazendo Jules, Samy e Michael tremerem levemente em respostas.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/05.png')A troca de olhares entre os seis foi quase imediata. Em uma rápida conversa silenciosa, decidiram procurar a causa dos ruídos. Saíram pelo corredor, revistando as salas que encontravam pelo caminho. Ao chegarem a uma última sala, não encontraram causa alguma para o som, porém, em um dos inúmeros armários da sala havia um mapa. Após pegarem o mapa, continuaram seguindo pelo corredor.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/05.png')De repente, um homem estranho sai de dentro da sala ao qual tinham acabado de passar. Apreensivos e ligeiramente assustados acabam disparando suas armas. \n"
                                + "Enquanto percebem que seu alvo tornou-se desorientado, os especialistas aproveitam e fogem para mais adentro do centro de pesquisa.";
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
                        paragrafo = "background('imagens/cenarios/16.png')Saindo do centro de pesquisa, os especialistas seguem caminho em direção a IA. Após passarem pelo centro de segurança, chegam a tão esperada Ilha Artificial.\n"
                                + "O lugar era semelhante a uma prisão moderna. Quase como uma habitação razoável. Curiosos como de costume, os especialistas vasculham a área denominada cativeiro. ";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/16.png')Com poucas descobertas, os especialistas resolvem vasculhar outra parte do prédio. O que lhes esperava na ala de teste não era uma recepção agradável. Um grupo de pessoas estava reunida e logo perceberam a presença dos especialistas. -São eles!- Gritou Jules desesperada. ";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/16.png')Rapidamente Jack, Joshua e Samy disparam suas armas contra o grupo enquanto começam a correr em direção a ponte de acesso com o centro de segurança. A respiração acelerada se tornou audível no silêncio que o grupo de super humanos fazia enquanto corria assustadoramente rápido. Logo Joshua consegue abrir o portão, liberando a passagem para Samy e Jack passarem. ";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/16.png')-Mais rápido Jules! -Grita Michael olhando para trás e percebendo a mulher sendo alcançada pelo homem careca. Jules responde com um olhar deseperado. Sem pensar sobre sua reação, Michael se volta em coreida em direção ao super humano, distraindo-o a tempo de Jules passar pelo portão, sendo o suficiente para assinar sua morte.";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/16.png')Quando viu que Michael seguia em direção a ela, assustada, esforçou-se para ser mais rápida passando logo pelo portão. Logo que cruzou a linha divisória, Joshua fechou o portão. -O que está fazendo? Michael está lá fora!-Gritou desesperada e sem fôlego. -Ele não está mais lá Jules. -Respondeu Jack lhe segurando os ombros, percebendo o quanto a mulher tremia.";
                        break;
                    case 102:
                        paragrafo = "background('imagens/cenarios/16.png')-Mas….\n"
                                + "-Jules, Michael escolheu. Agora ele se foi. -Disse Jack com pesar.\n"
                                + "Sem mais palavras, os cinco especialistas seguem em silêncio para o prédio do centro de segurança.";
                        break;
                    case 103:
                        paragrafo = "background('imagens/cenarios/16.png')opcao=Explodir a ponte de acesso a IA/Continua correndo e atirando";
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
                        paragrafo = "background('imagens/cenarios/02.png')Voltando para o centro de pesquisa, os especialistas seguem em grupo, sempre atentos ao seu redor. O grupo a pouco não conhecia um ao outro, agora, a vida de todos dependia da união que tivessem. Chegando ao portão, Joshua toma a frente o abrindo, dando passagem aos outros para entrarem.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Quando o portão é novamente fechado, o pequeno clique chama a atenção do ser albino a frente deles. Com um reflexo rápido, se põe em disparada, fugindo do monstro que os perseguia. -O que vamos fazer? - Grita Samy enquanto corre.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')Continua...";
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
                        paragrafo = "background('imagens/cenarios/05.png')Correndo com toda a força , os especialistas adentram em um labirinto de corredores, estando cada vez mais perdidos dentro do centro de pesquisa.\n"
                                + "-Temos que ir mais rápido, ele está nos alcançando!-Grita Jack.\n"
                                + "-Não sei se consigo correr mais!-Retruca Jules com o rosto vermelho pelo esforço.\n"
                                + "Logo eles percebem que já era tarde demais. O Super humano estava no alcance de Samy e não tardou até a agarrar pela cintura e pernas, dando uma joelhada em suas costas. ";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/05.png')Assim que ouve o quebrar da coluna da loira, o super humano deixa seu corpo inerte ali.\n"
                                + "Os especialistas, ainda correndo não param para ver o estrago feito em Samy. Não havia alternativa no momento em que este a pegou.\n"
                                + "Ainda correndo, chegam a uma bifurcação. \n"
                                + "-Acredito que devemos ir para a esquerda. -Diz Joshua pouco ofegante.\n"
                                + "-Porque ? - Pergunta Jules totalmente vermelha e suada.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')-Podemos tentar despistar ele, é meio óbvio que pegariamos o caminho da direita.\n"
                                + "Assentindo ao comentário de Joshua, seguiram com ele pelo corredor esquerdo, em um ritmo mais lento, porém não menos cuidadoso.\n"
                                + "Algum tempo depois, chegam novamente a recepção.\n"
                                + "-O que faremos agora? -Questiona Jack olhando fixamente para o alerta que piscava na tela ao fundo.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')Continua...";
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
                        paragrafo = "background('imagens/cenarios/05.png')Enquanto correm, os especialistas percebem que o Super Humano está muito proximo. \n"
                                + "-O que vamos fazer? - Pergunta Jules.\n"
                                + "-Temos que tentar despista-lo!- Fala Jack.\n"
                                + "Joshua ouvindo a discussão que se seguiu entre os dois sobre a melhor forma de agir, acabou seguindo seus instintos.\n"
                                + "Em um súbito, parou de correr e se dirigiu a pequena janela da porta ao lado. ";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/05.png')Com o cotovelo, socou o vidro, fazendo-o se quebrar em alguns pedaços. \n"
                                + "Com uma agilidade impressionante, pegou um pedaço de vidro que ficara pendurado na porta. Esperou alguns segundos suficientes para o super humano chegar ao seu lado, quando rapidamente se virou em direção a ele.\n"
                                + "Jack e Jules ao ouvirem o vidro quebrando param de correr e olham assustados para a cena.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/05.png')Joshua empunhava um pedaço pontiagudo de vidro e o cravava embaixo do queixo do super humano, o arrastando pelo pescoço do mesmo. \n"
                                + "Logo o sangue começava a jorrar, fazendo-os arregalaram ainda mais os olhos.\n"
                                + "O super humano cai morto sob os pés ensanguentados de Joshua, enquanto todos o olham com espanto por tamanha brutalidade e sangue frio.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/05.png')Continua...";
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
                        paragrafo = "background('imagens/cenarios/05.png')Enquanto os especialistas seguem em direção ao centro de pesquisa, Joshua resolve tomar uma atitude de precaução.\n"
                                + "Retirando rapidamente alguns explosivos que carregava nos bolsos da calça, ele os coloca em pontos estrategicos da ponte que liga a Ilha Artificial ao resto do complexo.\n"
                                + "Após conferir cada um dos explosivos, ele aguarda alguns especialistas sairem da ponte para então começar a correr até eles.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/05.png')Sua corrida chama a atenção dos demais que o olham com interrogação em suas faces. Provavelmente eles não sonham com todas as munições que Joshua detinha em seus bolsos, muito menos o quanto de estratégia militar ele adquirira na vida.\n"
                                + "Assim que se aproximou dos outros 4 especialistas gritou:\n"
                                + "-Abaixem-se e coloquem a mão sobre as orelhas! Agora! ";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/05.png')Atirando-se ao chão, ele seguiu as próprias ordens, sem ter a chance de conferir se seus colegas o imitaram pois logo apertou o gatilho para a explosão.\n"
                                + "O barulho foi alto o bastante para deixa-los tontos, além das pedras que os atingiram com entulho da explosão. ";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/05.png')Após um tempo se recuperando, os especialistas levantam assustados, mas se alegram quando veem a ponte de ligação totalmente destruída. \n"
                                + "Com uma esperança nascendo em seu interior seguiram para o centro de pesquisa. Alguma felicidade e esperança no peito. Mas, em suas mentes, a angustia por tudo que viram em tão pouco tempo. ";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/05.png')Continua...";
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
                        paragrafo = "background('imagens/cenarios/05.png')Atirando e correndo. Atirando e correndo. O cansaço tomava conta dos especialistas. Poderia até se dizer que tanto temor em suas mentes os desviava da intenção real de acertar um alvo. Na realidade, qualquer lugar que fosse, atirar lhes fazia tomar um pouco de controle sobre a situação. ";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/05.png')O desespero fluindo sobre seus corpos, junto a exaustão de tudo que passaram faziam suas me tes estarem tão alertas que acabavam por ser tornarem inoperantes a tantos estímulos.\n"
                                + "Cada lugar podia ser o fim para um deles, como os corpos naquela recepção. O sangue, a confusão. ";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')A mente dos especialistas tentava ao máximo, que aquela não se tornasse sua própria realidade.\n"
                                + "Chegando ao centro de pesquisa, os especialistas se utilizam da senha para trancar o portão da ponte. Assim, acreditavam que manteriam maior segurança no centro, evitanto que certos monstros pudessem circular livremente entre os espaços.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')Continua...";
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
                        paragrafo = "background('imagens/cenarios/05.png')Fugindo dos super humanos, os especialistas empunham suas armas, enquanto revezam para atirar e recarregar a munição especial.\n"
                                + "Por poucos segundos eles conseguem transpor o portão, e fecha-lo, chegando a prender os dedos de um super humano que,por pouco, quase os alcançara.\n"
                                + "Aliviados, alguns especialistas suspiram.";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/02.png')Outros largam suas armas enquanto curvam-se a frente para tomar respirações mais profundas.\n"
                                + "Assim que o momento de recuperar o fôlego acaba eles se encaminham para o lado em direção a saída.\n"
                                + "Estavam presos. Encurralados.\n"
                                + "Não tinham como abrir novamente o portão, afinal, do outro lado estavam esperando por eles.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/02.png')Não podiam seguir em frente, pois ali os encarando com fúria estava um super humano, seguido por um grupo razoavelmente grande atrás de si.\n"
                                + "As armas estavam quase sem munição. Não tinham tempo. Poucas opções de ação. E uma mínima possibilidade de vencer. O que fariam agora os especialistas para viver?";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/02.png')Continua...";
                        break;
                    default:
                        paragrafo = "nulo";
                        break;
                }
                break;
            default:
                switch ((int) numParagrafo) {
                    case 97:
                        paragrafo = "background('imagens/cenarios/00.png')-- Project: Human Evolution --";
                        break;
                    case 98:
                        paragrafo = "background('imagens/cenarios/01.png')O helicóptero com 6 especialistas sobrevoa um território inóspito russo. O voo, totalmente fora de radares, segue pelo denso mar, quase que completamente congelado de Okhotsk. Aparentemente, todos naquele helicóptero faziam parte da pequena porcentagem de seres vivos, naquele ambiente extremo, o que não parecia os assustar.";
                        break;
                    case 99:
                        paragrafo = "background('imagens/cenarios/10.png')Aqueles eram os seis especialistas convidados para participarem de um experimento em uma ilha em algum ponto daquele mar de águas estranhas, o que de suma já era um ponto de desconfiança, visto as grandes dificuldades climáticas que viram até ali.";
                        break;
                    case 100:
                        paragrafo = "background('imagens/cenarios/14.png')Os especialistas mantinham uma conversa um tanto tímida, discutindo sobre as últimas novidades do projeto genoma X, depois de tentarem obter quaisquer informações adicionais sobre o experimento que participariam, porém, ao que parecia, todos sabiam exatamente nada. Porém, logo ouviram a voz do piloto:";
                        break;
                    case 101:
                        paragrafo = "background('imagens/cenarios/14.png')\"Por favor doutores, permaneçam encostados nos assentos e com a cabeça entre os joelhos. Daqui poucos minutos passaremos por um campo magnético de retenção, que poderá causar alguma turbulência. Fiquem atentos a possíveis sangramentos nasais. Seguindo todos os procedimentos logo estaremos pousando!";
                        break;
                    case 102:
                        paragrafo = "background('imagens/cenarios/12.png')Todos logo seguiram as ordens do piloto, curiosos acerca do tal campo de retenção mencionado. Após uma leve turbulência, o helicóptero logo pousou sobre uma área destinada a ele na ilha. Ao descerem e todos tomarem suas bagagens, rapidamente o helicóptero os deixa.";
                        break;
                    case 103:
                        paragrafo = "background('imagens/cenarios/13.png')-Bem, alguém sabe se vamos ser recepcionados pelo coordenador? - Pergunta Joshua.\n"
                                + "-Acho melhor esperarmos aqui. Alguém deve estar vindo nos receber. -Se pronuncia Dra. Abby, ajeitando sua franja castanha sob a testa.";
                        break;
                    case 104:
                        paragrafo = "background('imagens/cenarios/13.png')-Concordo. Enquanto isso, se não se importam, vou fazer fotos para o portfólio. Olhem como o campo magnético consegue armazenar o clima artificial sem nenhuma evidência externa! Fascinante! Realmente muito curioso! - O homem ruivo pega sua câmera pendurada sobre o pescoço, se afastando do grupo enquanto resmungava ainda mais fascinado sobre o campo magnético.";
                        break;
                    case 105:
                        paragrafo = "background('imagens/cenarios/00.png')-Quem é aquele ali mesmo? Não me recordo dele falando qualquer palavra antes....- Pergunta um homem sentado sob sua mala. Seus olhos pequenos quase deixando uma aparência infantil, não fossem suas roupas desgastadas e o cabelo raspado.";
                        break;
                    case 106:
                        paragrafo = "background('imagens/cenarios/00.png')-Acredito que aquele seja o Professor Jack, doutor Michael. Ouvi dizer que ele é um verdadeiro gênio da genética, apenas acredito que tenha um medo de altura e por isso permaneceu quieto no helicóptero. - Termina risonha a jovem Jules, realçando sua covinha assimétrica na bochecha e balançando seus cabelos pretos repicados.";
                        break;
                    case 107:
                        paragrafo = "background('imagens/cenarios/01.png')Após algumas horas de espera, os especialistas cansados resolvem seguir caminho para o centro de pesquisa, acreditando que o coordenador deveria tê-los esquecido.\n"
                                + "-Isso tudo é tão estranho! Nunca vi um lugar tão quieto. -Resmunga a loira chamada Samy. Alguns assentem, mas ninguém toma coragem em falar mais nada.";
                        break;
                    case 108:
                        paragrafo = "background('imagens/cenarios/02.png')Logo que alcançam a porta do centro percebem a mesma quebrada. Ansiosos e temerosos decidem entrar rapidamente, mas logo que o fazem estancam em seus lugares.";
                        break;
                    case 109:
                        paragrafo = "background('imagens/cenarios/02.png')O cenário que veem é um completo caos. A recepção tem sua bancada parcialmente quebrada, com uma longa mancha de sangue seguindo em direção a uma poça negra atrás do balcão. De onde estão todos conseguem visualizar uma pálida mão repousando sobre a poça, sendo adornada por vários papéis já manchados ao seu redor.";
                        break;
                    case 110:
                        paragrafo = "background('imagens/cenarios/02.png')Com completo choque, cada um segue um caminho, não acreditando no que seus olhos presenciam. Podiam perceber que várias janelas estavam quebradas, uma boa parte detinha alguns tecidos pendurados nos vidros que ainda se mantinham firmes, outras com algumas manchas e respingos de sangue. ";
                        break;
                    case 111:
                        paragrafo = "background('imagens/cenarios/02.png')Em um dos cantos, era possível ver o que antes deveria ser um mapa da ilha que estavam. Agora, não passava de vários recortes pendurados em uma moldura na parede.\n"
                                + "-O que aconteceu aqui? - Sussurrou Jules. Apesar do tom baixo, todos puderam ouvi-la claramente, bem como as respirações aceleradas pelo choque.  Se abaixando lentamente Jules toca em um dos corpos jogados no chão, vendo o quão gelado já se encontra.";
                        break;
                    case 112:
                        paragrafo = "background('imagens/cenarios/02.png')-Acho que encontrei algo!\n"
                                + "Naquele instante o coração de cada um naquela sala errou uma batida, uns pela esperança de uma resposta, outros pelo medo ou ansiedade. Rapidamente todos viram seus olhos em direção ao estranho Professor Jack, se aproximando dele lentamente. ";
                        break;
                    case 113:
                        paragrafo = "background('imagens/cenarios/02.png')Em seu campo de visão se encontrava um grande monitor, piscando em letras vermelhas o grande perigo que aqueles cientistas estavam prestes a conhecer.\n"
                                + "\"Alerta Máximo: Segurança da IA Comprometida!!\"";
                        break;
                    case 114:
                        paragrafo = "background('imagens/cenarios/02.png')opcao=Procurar meio de comunicação com o continente/Trancar algumas alas do centro para manter certa segurança";
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
                        if (caminho.charAt(caminho.indexOf("E") - 1) == 'B') {
                            atualizaCaminhoFrente('g', 3);
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
                        if (caminho.charAt(caminho.indexOf("F") - 1) == 'B') {
                            atualizaCaminhoFrente('H', 2);
                        } else {
                            atualizaCaminhoFrente('c', 3);
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
                    case 99:
                        atualizaCaminhoFrente('d', 3);
                        break;
                }
                break;
            case 72:
                //caminho H:
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
            case 73:
                //caminho I:
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
            case 74:
                //caminho J:
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
