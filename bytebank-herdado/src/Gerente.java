//Gerente herda de funcionário
public class Gerente extends FuncionarioAuntenticavel{

    //construtor
    public Gerente(){
        
    }
    //getters and setters
   
    //métodos
    public double getBonificacao(){
        return super.getSalario();
    }

    
}
