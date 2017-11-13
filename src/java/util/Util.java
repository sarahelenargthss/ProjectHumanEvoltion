package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 
public class Util {

    public static PreparedStatement retornaConexao(String sql) {
        //retorna a conexão com o BD
        String str = "jdbc:mysql://localhost:3306/phe?" + "user=root&password=alunoifc";
        PreparedStatement p;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            Connection conn = (Connection) DriverManager.getConnection(str);
            p = conn.prepareStatement(sql);
        } catch (SQLException e) {
            p = null;
        }
        return p;
    }
    
    public static boolean validaString(String text) {
        //método que retorna true quando as Strings são vazias
        return text.trim().equals("");
    }

}
 