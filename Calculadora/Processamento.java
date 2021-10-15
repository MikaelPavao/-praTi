
/**
 * Escreva uma descrição da classe Processamento aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Processamento
{
    public String RetornaCalc(double a, double b, String c){
        double resultado=0; 
        if(c.equals("/")){
            resultado = a / b;
        }else if(c.equals("*")){
            resultado = a * b;
        }else if(c.equals("+")){
            resultado = a + b;
        }else if(c.equals("-")){
            resultado = a - b;
        }
        return Double.toString(resultado);
    }
}
