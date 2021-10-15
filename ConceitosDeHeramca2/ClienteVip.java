
/**
 * Escreva uma descrição da classe ClienteVip aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ClienteVip extends Cliente
{
    double limite = 3000;
    /**
     * Construtor para objetos da classe ClienteVip
     */
    public ClienteVip(String nomeC, String emailC, int idadeC)
    {
        super(emailC, idadeC);
    }
    public void ajustarLimite(){
        limite += 1000;
        
    }
    
    public double retornaLimite(){
        return limite;
    } 
    
}
