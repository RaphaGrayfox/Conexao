
package Execucao;

import Model.PessoaM;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Pessoa {

    public static void main(String[]args) throws SQLException{
        
        PessoaM pessoa;
        pessoa = new PessoaM();
    
        String nome,
               senha;
        
        /*nome = JOptionPane.showInputDialog("Digite o seu usuário : ");
        senha = JOptionPane.showInputDialog("Digite sua senha : ");
        
        pessoa.inserirUsuario(nome, senha);
        */
        pessoa.listarUsuarios();
        
    }
    
}
