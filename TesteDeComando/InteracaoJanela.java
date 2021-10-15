import javax.swing.*;
/**
 * Escreva uma descrição da classe InteracaoJanela aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class InteracaoJanela
{
    public static void main(String args[]){
        String janela = "";
        int idade;
        do{
        janela = JOptionPane.showInputDialog("Digite sua idade: \n ou digite 0 para sair");
        
        idade = Integer.parseInt(janela);
    if (idade == 0){
        JOptionPane.showMessageDialog(null,"Sistema finalizado");
    }else{
        if(idade < 5 || idade > 70){
            janela = "Idade não permitida";   
        }else if(idade <= 12){
            janela = "Categoria Infantil";
        }else if(idade <= 20){
            janela = "Categoria juvenil";
        }else if(idade <= 45){
            janela = "Categoria adulto";
        }else{
            janela = "Categoria master";
        }
        JOptionPane.showMessageDialog(null,janela);
    }
        
        
        }while(idade > 1);
    }
}
