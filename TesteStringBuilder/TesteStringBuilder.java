
/**
 * Escreva uma descrição da classe TesteStringBuilder aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TesteStringBuilder
{
    public static void main(String args[]){
        String a = " teste ";
        String b = " teste bxcvvc ";
        String c = a + b;
        
        System.out.println(c + " teste ".join(c,b));
        
        
        System.out.println("-------------");
        
        StringBuilder sb = new StringBuilder();
        sb.append("texto para teste");
        System.out.println(sb.codePointAt(15));
        System.out.println(sb.charAt(4));
        System.out.println(sb);
    }
}
