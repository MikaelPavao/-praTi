import javax.swing.*;

/**
 * Escreva uma descrição da classe TesteRepeticao aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class TesteRepeticao
{
    public static void main(String args[]){
        
        String resp = "sim";
        String nomeMaisNovo = "";
        int id;
        int idadeTotal = 0;
        int idadeMaisNovo = 200;
        int cont = 0;
        double media;
        
        while(resp.equalsIgnoreCase("sim")){
            String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
            String idade = JOptionPane.showInputDialog("Digite sua idade: ");
            id = Integer.parseInt(idade);
            
            if(id < idadeMaisNovo){
                nomeMaisNovo = nome;
                idadeMaisNovo = id;
            }
            idadeTotal += id;
            cont++;
            
            resp = JOptionPane.showInputDialog("Tem mais alguém?");
        }
        media = idadeTotal/cont;
        
        JOptionPane.showMessageDialog(null," Nome do mais novo: " + nomeMaisNovo + "\n Idade do mais novo: " + idadeMaisNovo + "\n Media das idades: "+ media, "RESULTADO", JOptionPane.PLAIN_MESSAGE);
        
    }
    
    
}
