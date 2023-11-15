
package bancodedados;

import DAO.AlunoDAO;
import DAO.Conexao;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.SQLException;

public class BancoDeDados {

    public static void main(String[] args) {
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
//        Conexao conexao = new Conexao();
//        try {
//            Connection conn = conexao.getConnection();
//            AlunoDAO dao = new AlunoDAO(conn);
//            dao.inserir(null);
//        } catch (SQLException ex) {
//            System.out.println("falha na conexão!");
//            ex.printStackTrace();
//        }
    }
    
}
