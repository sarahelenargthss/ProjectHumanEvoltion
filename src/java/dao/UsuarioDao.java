package dao;

import dto.UsuarioDto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDao {

    public UsuarioDao() {
       
    }
    
    private static PreparedStatement retornaConexao(String sql) {
        //retorna a conexão com o BD
        String str = "jdbc:mysql://localhost:3306/phe?" + "user=root&password=root";
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

    public UsuarioDto retornaUsuario(String nome) {
        UsuarioDto uDto = new UsuarioDto();
        try {
            PreparedStatement p = retornaConexao("select * from usuario where nom_usuario = ?;");
            p.setString(1, nome);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                uDto.setNome(rs.getString(1));
                uDto.setCaminho(rs.getString(2));
                uDto.setSenha(rs.getString(3));
            }
        } catch (SQLException e) {
            return null;
        }
        return uDto;
    }

    public int verificaUsuario(String nome) {
        String nomeDao = "";
        try {
            PreparedStatement p = retornaConexao("select nom_usuario from usuario where nom_usuario = ?");
            p.setString(1, nome);
            ResultSet rs = p.executeQuery();
            if (rs.next()) {
                nomeDao = rs.getString(1);
            }
        } catch (SQLException e) {
            return 3;
        }
        if (nomeDao.equals("")) {
            return 2;
        } else {
            return 1;
        }
    }
    
    public boolean atualizaUsuario(UsuarioDto dto){
        try{
            PreparedStatement p = retornaConexao("update usuario set caminho_historia = ? where nom_usuario = ?");
            p.setString(1, dto.getCaminho());
            p.setString(2, dto.getNome());
            p.execute();
        }catch(SQLException e){
            return false;
        }
        return true;
    }
    
    public boolean insereUsuario(UsuarioDto u){
        try{
            PreparedStatement p = retornaConexao("insert into usuario values(?, ?, ?)");
            p.setString(1, u.getNome());
            p.setString(2, u.getCaminho());
            p.setString(3, u.getSenha());
            p.execute();
        }catch(SQLException e){
            return false;
        }
        return true;
    }

}
