
package ConexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {
    
    public static String status = "Não Conectou...";
    
    public ConexaoMySQL(){
        
    }
    
    public static java.sql.Connection getConexaoMySQL() throws SQLException{
        
        Connection connection = null;
        
        try{
            
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
            String serverName = "localhost:3306";
            String mydatabase = "raphael";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
            String password = "";
            
            connection = DriverManager.getConnection(url, username, password);
            
            if(connection!=null){
                status = "Conectado";
            }else{
                status = "Desconectado";
            }
            
            return connection;
        }catch(ClassNotFoundException e){
            System.out.println("Problema no drive");
            return null;
        }catch(SQLException e){
            System.out.println("Não foi possivel conectar");
            return null;
        }
    }
}
