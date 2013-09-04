
package br.com.conexaoBanco;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDAO {
    
     public static void main(String[]args) throws SQLException{

        try{
            Connection connection = ConexaoMySQL.getConexaoMySQL();
        }catch(Exception e){
            
        }
        Statement st = ConexaoMySQL.getConexaoMySQL().createStatement();
        ResultSet rs = st.executeQuery("Insert into raphael.tbl_usuarios (id, nome, password) values('3', '', '')");

    }
}
