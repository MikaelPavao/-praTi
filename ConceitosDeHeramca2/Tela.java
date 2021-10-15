import javax.swing.*;
/**
 * Escreva uma descrição da classe Tela aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Tela
{
    public static int recebeInt(String n){
        String escolha = JOptionPane.showInputDialog(n);
        return Integer.parseInt(escolha);
    }
    
    public static String recebeString(String txt){
        String resposta = JOptionPane.showInputDialog(txt);
        
        return resposta; 
    }
    
    public static void mostrarTexto(String tela){
        JOptionPane.showMessageDialog(null, tela, "Erro do sistema", JOptionPane.ERROR_MESSAGE);
    }
}
