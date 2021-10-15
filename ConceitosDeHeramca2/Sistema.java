import java.util.*;

/**
 * Escreva uma descrição da classe Sistema aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Sistema
{
    private static ArrayList<Cliente> dados = new ArrayList<Cliente>();
     
    public static void cadastrarCliente(){
        String nome, email, tipo;
        int idade;
        nome = Tela.recebeString("Nome:");
        email = Tela.recebeString("E-mail:");
        idade = Tela.recebeInt("Idade:");
        tipo = Tela.recebeString("A conta é Vip-||V|| ou \nComun-||C||");
        Cliente dadosCadastro;
        if(tipo.equalsIgnoreCase("V")){
            dadosCadastro = new ClienteVip(nome, email, idade);
        }else{
            dadosCadastro = new ClienteComun(nome, email, idade);
        }
        dados.add(dadosCadastro);
    }
    
    public static void pesquisarCliente(){
        String nomePesq = Tela.recebeString("Nome a pesquisar:");
        Cliente dadosPesquisa = retornaCliente(nomePesq);
        String saida = "";
        if(dadosPesquisa != null){
            saida += "Nome: " + dadosPesquisa.getNome()+"\n";
            saida += "E-mail: " + dadosPesquisa.getEmail()+"\n";
            saida += "Idade: " + dadosPesquisa.getIdade();
        }else{
            saida = "Nenhum resultado encontrado";
        }
        Tela.mostrarTexto(saida);
    }
    private static Cliente retornaCliente(String pesqN){
            Cliente rtnCliente;
            for(int i =0; i<dados.size(); i++){
                rtnCliente = dados.get(i);
                String recebeNome = rtnCliente.getNome();
                System.out.println(dados.get(i));
                if(recebeNome.equalsIgnoreCase(pesqN)){
                    return rtnCliente;
                }
                System.out.println(dados.get(i));
            }
            return null;
    }
    
    public static void aumentarLimite(){
        String nomeParaPesquisa = Tela.recebeString("Qual cliente desja pesquisar? ");
        Cliente recebeNome2 = retornaCliente(nomeParaPesquisa);
        if(recebeNome2 != null && recebeNome2 instanceof ClienteVip){
            ClienteVip cv = (ClienteVip)recebeNome2;
            cv.ajustarLimite();
            double limite = cv.retornaLimite();
            Tela.mostrarTexto("Novo limite: " + limite);            
        }else{
            Tela.mostrarTexto("Cliente comun...");
        }
    }
}
