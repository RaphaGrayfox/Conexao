
package Model;

public class ModelLogin {
    
    private String nome,
                   password;

    public ModelLogin(String nome, String password){//Construtor
        this.nome = nome;
        this.password = password;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
}
