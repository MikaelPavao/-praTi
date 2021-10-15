
/**
 * Escreva uma descrição da classe Cliente aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Cliente
{
    private String nome;
    private String email;
    private int idade;

    public Cliente( String emailC, int idadeC)
    {
        //this.nome = nomeC;
        this.email = emailC;
        this.idade = idadeC;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setEmail(String e){
        this.nome = e;
    }
    public String getEmail(){
        return this.email;
    }
    
    public void setIdade(String i){
        this.nome = i;
    }
    public int getIdade(){
        return this.idade;
    }
}
