//não pode se criar instancias de objetos abstratos
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //construtor
    public Funcionario(){
        
    }
    //getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //métodos
    //não há implementação desse métodos, necessitandoda implementação dos filhos 
    public abstract double getBonificacao();
    
}
