//Gerente herda de funcionário
public class Gerente extends Funcionario implements Auntenticavel{

    private int senha;

    //construtor
    public Gerente(){
        
    }
    //getters and setters
   
    //métodos
    public double getBonificacao(){
        return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        // TODO Auto-generated method stub
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        // TODO Auto-generated method stub
        if (this.senha == senha) {
            return true;
        }
        return false;
    }

    
}
