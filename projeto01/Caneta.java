
/**
 * Escreva uma descrição da classe Caneta aqui.
 * 
 * @author (Mikael) 
 * @version (1.0)
 */
public class Caneta
{   
    //Caracteristicas da caneta
    //representadas por variaveis
    String cor = "Azul";
    double tamanhoPonta = 1.0;
    //Metodo para escrever com a caneta
    public void escrever(String texto){
        System.out.println(texto);
        System.out.println("A cor da caneta é:" + this.cor);
        System.out.println("O tamanhor da canete é:" + this.tamanhoPonta);
    }
    //metodo para ajustar a cor da caneta
    public void ajustaCor(String cor){        
        this.cor = cor;    
    }
    //metodo para ajustar o tamanho da ponta da caneta
    public void ajustaTamanho(double tamanho){        
        this.tamanhoPonta = tamanho;
    }
}
