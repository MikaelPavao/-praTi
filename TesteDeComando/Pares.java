
/**
 * Esta classe irá tratar os numeros de entrada e retornara 
 * os números pares, entre o número inicial e o número final,
 * invertendo caso o número inicial seja maior que o final.
 * @author (Mikael) 
 * @version (11/10/2021)
 */
public class Pares
{
    public String retornaPares(int inicio, int fim){
        
        if(inicio > fim){
            int aux = inicio;
            inicio = fim;
            fim = aux;
        }
        String res = "";
        for(int i = inicio;i<=fim;i++){
            if(i % 2 ==0){
                res += i + " ";
            }
        }
        return res;
    }
}
