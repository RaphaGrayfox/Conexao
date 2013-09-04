
package Model;

import ModelDAO.QueryDAO;
import java.sql.SQLException;

public class PessoaM {
    String nome;
    String senha;
         
    public PessoaM() {
       
    }
    public void inserirUsuario(String nome, String senha) throws SQLException{
        
        QueryDAO query;
        query = new QueryDAO();
        
        query.queryInserir(nome, senha);
        
    }
    
    public void listarUsuarios() throws SQLException{
        
        QueryDAO query;
        query = new QueryDAO();
        
        query.queryListar();
        
    }
    
}
