public class SistemaInterno {
    
    private int senha = 2222;

    public void autentica(FuncionarioAuntenticavel g){
        boolean auntenticou = g.autentica(this.senha);
        if (auntenticou) {
            System.out.println("pode entrar no sistema");
        }else{
            System.out.println("não pode entrar");
        }
    }
}
