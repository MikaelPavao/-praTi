import javax.swing.*;
/**
 * Esta classe vai receber os textos informados pelo usuário
 * e ira retornar uma caixa de diálogo com estes textos
 * 
 * @author (Mikael) 
 * @version (11/10/2021)
 */
public class Tela
{
    public static int retornaInt(String texto){
        String txt = JOptionPane.showInputDialog(texto);
        return Integer.parseInt(txt);
    }
    
    public static void mostraTexto(String a){
        JOptionPane.showMessageDialog(null,a);
    }
}
