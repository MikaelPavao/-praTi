import javax.swing.*;

/**
 * Escreva uma descrição da classe Tela aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Tela
{
    public static int retornaInt(String texto){
        String txt = JOptionPane.showInputDialog(texto);
        return Integer.parseInt(txt);
    }
    
    public static double retornaDouble(String d){
        String txt2 = JOptionPane.showInputDialog(d);
        return Double.parseDouble(txt2);
    }
    
    public static String retornaOperador(String opr){
        String op = JOptionPane.showInputDialog(opr);
        return op;
    }
    
    public static void mostraTexto(String a){
        JOptionPane.showMessageDialog(null,a);
    }
}
