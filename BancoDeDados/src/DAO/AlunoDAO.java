
package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Aluno;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AlunoDAO {
    private Connection conn;
    
    public AlunoDAO(Connection conn){
        this.conn = conn;
    }
    
    public void inserir(Aluno aluno) throws SQLException{
        String sql = "insert into aluno (nome, usuario, senha) values ('"+aluno.getNome()+"', '"+aluno.getUsuario()+"', '"+aluno.getSenha()+"')";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        conn.close();
    }
    
    public ResultSet consultar(Aluno aluno) throws SQLException{
        //String sql = "select * from aluno where usuario = '"+aluno.getUsuario()+"' AND senha =  '"+aluno.getSenha()+"'";
        //trecho abaixo como correcao para sql injection
        //String sql = "select * from aluno where usuario = '"+aluno.getUsuario()+"'";
        //
        String sql = "select * from aluno where usuario = ? and senha = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.setString(2, aluno.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
        
        // colocar no usuario: negool'--
        // vai logar mesmo sem senha
        // sql injection
        // colocar ' or 1=1-- no campo usuario e sem senha, vai logar tbm
        // -- é comentário em sql
    }
    
    public void atualizar(Aluno aluno) throws SQLException{
        String sql = "update aluno set senha =  ? where usuario = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getSenha());
        statement.setString(2, aluno.getUsuario());
        statement.execute();
        conn.close();
    }
    
    public void remover(Aluno aluno) throws SQLException{
        String sql = "delete from aluno where usuario = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, aluno.getUsuario());
        statement.execute();
        conn.close();
    }
}
