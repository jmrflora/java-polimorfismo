public class Administrador extends Funcionario implements Auntenticavel{

    private AuntenticacaoUtil auntenticador;

    public Administrador(){
        this.auntenticador = new AuntenticacaoUtil();
    }

    @Override
    public double getBonificacao() {
        // TODO Auto-generated method stub
        return 50;
    }
    @Override
    public void setSenha(int senha) {
        this.auntenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.auntenticador.autentica(senha);
    }
}
