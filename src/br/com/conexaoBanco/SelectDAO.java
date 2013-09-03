
package br.com.conexaoBanco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDAO {
    
    public static void main(String[]args) throws SQLException{

        try{
            Connection connection = ConexaoMySQL.getConexaoMySQL();
        }catch(Exception e){
            
        }
        Statement st = ConexaoMySQL.getConexaoMySQL().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM raphael.tbl_usuarios");
        
        while (rs.next()){
            String usuario = rs.getString("nome");      
            System.out.println(usuario);
        }
    }
}
