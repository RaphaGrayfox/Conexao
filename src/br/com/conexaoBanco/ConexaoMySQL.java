
package br.com.conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL {

    public static String status = "Não conectou...";

    public ConexaoMySQL(){

    }
    
    public static java.sql.Connection getConexaoMySQL() {

        Connection connection = null;          //atributo do tipo Connection
        
        try {

            String driverName = "com.mysql.jdbc.Driver";                        
            Class.forName(driverName);

            String serverName = "localhost:3306";    //caminho do servidor do BD
            String mydatabase = "raphael";        //nome do seu banco de dados
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";        //nome de um usuário de seu BD      
            String password = "";      //sua senha de acesso

            connection = DriverManager.getConnection(url, username, password);

            
            return connection;
        
        }catch(ClassNotFoundException e) {  //Driver não encontrado
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;

        }catch(SQLException e) {

            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            return null;
        }

    }
    
    public static String statusConection() {

        return status;

    }
 
}
