
/**
 * Escreva uma descrição da classe FuncIntegral aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FuncMensalista extends Funcionario
{

    /**
     * Construtor para objetos da classe FuncIntegral
     */
    public FuncMensalista(String nome, String email, double salario)
    {
        super(nome,email);
        super.setSalario(salario);
    }
    
    public double calcularSalario(){
        double resultado = this.getSalario();
        resultado = resultado -(resultado * this.TAX);
        return resultado;
    }
}
