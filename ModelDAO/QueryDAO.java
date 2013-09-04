
package ModelDAO;

import ConexaoBanco.ConexaoMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryDAO {
    
    public void queryInserir(String nome, String senha) throws SQLException{
        
        try{
            Connection conn = ConexaoMySQL.getConexaoMySQL();
            
        }catch(Exception e){
            System.out.println("Error ...");
        }
        
        String sql = "INSERT INTO tbl_usuarios (nome, senha) VALUES(?,?)";
        PreparedStatement ps = ConexaoMySQL.getConexaoMySQL().prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, senha);
        ps.execute();

       }
    
        public void queryListar() throws SQLException{
            
            try{
                Connection conn = ConexaoMySQL.getConexaoMySQL();
            
            }catch(Exception e){
                System.out.println("Error ...");
            }
            
            String sql = "SELECT * FROM tbl_usuarios";
            Statement st = ConexaoMySQL.getConexaoMySQL().createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            if(rs.next()){
                String nome = rs.getString("nome");
                System.out.println(nome);
            }
                     
        }
}
