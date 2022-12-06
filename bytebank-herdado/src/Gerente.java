//Gerente herda de funcionário
public class Gerente extends Funcionario{

    private int senha;

    //construtor
    public Gerente(){
        
    }
    //getters and setters
    public void setSenha(int senha) {
        this.senha = senha;
    }
    //métodos
    public double getBonificacao(){
        return super.getSalario();
    }

    public boolean autentica(int senha){
        if (this.senha == senha) {
            return true;
        }
        return false;
    }
}
