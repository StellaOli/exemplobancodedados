
package controller;

import DAO.AlunoDAO;
import DAO.Conexao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Aluno;
import view.CadastroFrame;

public class ControllerCadastro {
    private CadastroFrame view;
    public ControllerCadastro(CadastroFrame view){
        this.view = view;
    }
    
    public void salvarAluno(){
        String nome = view.getEntrada_nome().getText();
        String usuario = view.getEntrada_usuario().getText();
        String senha = view.getEntrada_senha().getText();
        Aluno aluno = new Aluno(nome, usuario,senha);
        
        Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            AlunoDAO dao = new AlunoDAO(conn);
            dao.inserir(aluno);
            JOptionPane.showMessageDialog(view, "Usuario Cadastrado!","Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(view, "Falha na conexão!","Erro", JOptionPane.ERROR_MESSAGE);
            //System.out.println("falha na conexão!");
            ex.printStackTrace();
        }
    }
}
