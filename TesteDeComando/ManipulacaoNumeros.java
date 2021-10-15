import javax.swing.*;

/**
 * Escreva uma descrição da classe ManipulacaoNumeros aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ManipulacaoNumeros
{
    public static void main(String args[]){
        String inicio = JOptionPane.showInputDialog("Valor Inicial");
        String fim = JOptionPane.showInputDialog("Valor final");
        String concatena = "";
        int ini = Integer.parseInt(inicio);
        int fm = Integer.parseInt(fim);
        
        if(fm <= ini){
            fim = JOptionPane.showInputDialog(null,"Valor final deve ser maior que inicial", "Mensagem de erro", JOptionPane.ERROR_MESSAGE);
            fm = Integer.parseInt(fim);
        }
        
        int qtd = 0;
        int soma = 0;
        for(int i = ini; i<= fm; i++){
                
                if(i % 2 == 0){
                    concatena += "-" + i;
                    soma += i;
                    qtd += 1;
                }
        }
        
        JOptionPane.showMessageDialog(null,concatena + "\n Quantidade: "+ qtd + "\n Soma: " + soma, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
