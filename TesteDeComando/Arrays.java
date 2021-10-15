import java.util.ArrayList;
import javax.swing.*;
/**
 * Escreva uma descrição da classe Arrays aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Arrays
{
    public static void main(String args[]){
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome");
        
        String msg = "";
        int saida = Integer.parseInt(nome);
        if(saida >=18){
            msg = "É maior de idade";
        }else{
            msg = "É menor de idade";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
