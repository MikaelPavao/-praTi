
/**
 * Escreva uma descrição da classe FuncHorista aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class FuncHorista extends Funcionario
{
     /**
     * Construtor para objetos da classe FuncHorista
     */
    public FuncHorista(String nome, String email, int hr, double salario)
    {
        super(nome,email);
        super.setHora(hr);
        super.setSalario(salario);        
    }

    public double calcularSalario(){
        double resultado = (this.salario * this.hora);
        resultado = resultado -(resultado * this.TAX);       
        return resultado;
    }
}
