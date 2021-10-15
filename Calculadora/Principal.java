
/**
 * Esta classe vai processar os dados comforme o usuário informar
 * e fazer o cálculo e mostrar o resultado na tela
 * 
 * 
 * @author (Mikael) 
 * @version (11/10/2021)
 */
public class Principal
{
    public static void main(String[] args) {
        double n1 = Tela.retornaDouble("Informe o primeiro número ");
        double n2 = Tela.retornaDouble("Informe o segundo número ");
        String operador = Tela.retornaOperador("Digite / para "+ n1 + " / " + n2+ " \nDigite * para "+ n1 + " * " + n2+ " \nDigite - para "+ n1 + " - " + n2+ " \nDigite + para "+ n1 + " + " + n2+ "");
        
        Processamento calculadora = new Processamento();
        
        String resultado = calculadora.RetornaCalc(n1,n2,operador);
    
        Tela.mostraTexto(resultado);
    }
}
