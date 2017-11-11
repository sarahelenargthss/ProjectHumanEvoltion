package dto;

public class UsuarioDto {
    private String nome;
    private String senha;
    private String caminho;
    
    public UsuarioDto(String nome, String senha, String caminho) {
        this.nome = nome;
        this.senha = senha;
        this.caminho = caminho;
    }

    public UsuarioDto() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCaminho() {
        return caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    
}
