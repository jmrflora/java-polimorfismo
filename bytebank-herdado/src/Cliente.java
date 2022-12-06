public class Cliente implements Auntenticavel{

    private AuntenticacaoUtil autenticador;

    public Cliente(){
       this.autenticador = new AuntenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
    
}
