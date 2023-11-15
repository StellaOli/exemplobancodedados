
package model;

public class Aluno {
    private String nome, senha, usuario;

    public Aluno(String nome, String usuario, String senha) {
        this.nome = nome;
        this.senha = senha;
        this.usuario = usuario;
    }

    public Aluno() {
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
}
