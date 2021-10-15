
/**
 * Este classe ira chamar os metodos necessarios para tratar
 * enviados pelo usuário e mostras o resultado organizado
 * 
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{
    //Pega o numeque que o usuario digitou e armazena nas 
    //variaveis ini e fm
    int ini = Tela.retornaInt("Informe o numero inicial");
    int fm = Tela.retornaInt("Informe o numero final");
    
    //Organiza os números em ordem crescente da 
    //esquerda para a direita e armazena na variavel resultado
    Pares organiza = new Pares();
    String resultado = organiza.retornaPares(ini,fm);
    
    //Pega a variavel resultado e coloca em uma caixa de 
    //dialogo para mostrar ao usuário
    Tela.mostraTexto(resultado);
}
