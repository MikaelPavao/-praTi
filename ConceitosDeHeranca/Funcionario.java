
/**
 * Esta classe contém as variaveis compartilhadas entre um
 * funcionario horista e um fucionario mensalista
 * 
 * 
 * @author (Mikael) 
 * @version (1.0)
 */
public abstract class Funcionario
{
    protected final double TAX = 0.10;
    protected String nome;
    protected String email;
    protected int hora;
    protected double salario;
    
    /**
     * Construtor para objetos da classe Funcionario
     */
    public Funcionario(String n, String e)
    {
       this.nome = n;
       this.email = e;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNom(String n){
        this.nome = n;
    }
    
    public int getHora(){
        return this.hora;
    }
    
    public void setHora(int h){
        this.hora = h;
    }
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double s){
        this.salario = s;
    }
    
    public abstract double calcularSalario();
}

