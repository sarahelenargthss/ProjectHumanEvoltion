package teste;

//import util.Util;
//import dao.UsuarioDao;
import principal.Capitulos;

//import principal.Capitulos;
public class testaDao {

    public static void main(String[] args) {
        //Util.retornaConexao("select * from usuario;");
//        
        Capitulos cap = new Capitulos("1BFHb");
        System.out.println(": ");
        System.out.println(cap.retornaParagrafo());
        System.out.println("---- Historia ----");
        System.out.println(cap.retornaHistoria());
//String op = "opcaoA";
//        int numOpcao = (op.charAt(5) == 'A') ? 0 : 1;
//        UsuarioDao uDao = new UsuarioDao();
//        Capitulos cap = new Capitulos("1Dd");
//        char novo = cap.retornaOpcao(numOpcao);
//        cap.atualizaCaminhoFrente(novo, 2);
//        System.out.println(cap.retornaParagrafo());
    }

}
