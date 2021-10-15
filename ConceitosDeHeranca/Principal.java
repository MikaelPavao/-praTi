
/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{   
    public static void main(String args[]){
    Funcionario func = null;
    
        String nome = Tela.retornaTxt("Nome");
        String email = Tela.retornaTxt("E-mail");
        
        String tipo = Tela.retornaTxt("H - Horista | I - Integral");
        
        if(tipo.equals("I")){
            int qtd = Tela.retornaInt("Qtd horas");
            double val = Tela.retornaDouble("Valor hora");
            func = new FuncHorista(nome, email,qtd, val);    
        }else{
            double sal = Tela.retornaDouble("Salário Base");
            func = new FuncMensalista(nome, email, sal);
        }
        
        double sal = func.calcularSalario();
        nome = func.getNome();
        Tela.mostraTxt(nome + "Seu salário será: " + sal);
    
    }
}
