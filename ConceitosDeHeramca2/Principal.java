
/**
 * Escreva uma descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Principal
{
    public static void main(String args[]){
        String resposta = "sim";
        int opcao = 0;
        while(resposta.equalsIgnoreCase("sim")){
            opcao = Tela.recebeInt("Digite \n1-Cadastro\n 2-Pesquisa \n 3-Aumentar limite  ");
            switch(opcao){
                case 1:
                    Sistema.cadastrarCliente();
                    break;
                case 2:
                    Sistema.pesquisarCliente();
                    break;
                case 3:
                    Sistema.aumentarLimite();
                    break;
                default:
                    Tela.mostrarTexto("Número inválido");
            }
            resposta = Tela.recebeString("Continuar?");
        }
    }
}
