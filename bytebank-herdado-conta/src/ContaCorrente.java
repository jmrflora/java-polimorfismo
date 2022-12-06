public class ContaCorrente extends Conta{
    //não herda construtor


    public ContaCorrente(int agencia, int numero){
        //chama o construtor específico da super classe
        super(agencia, numero);
    }
    @Override
    public boolean saca(double valor) {
        // TODO Auto-generated method stub
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
    @Override
    public void deposita(double valor){
        this.setSaldo(this.getSaldo() + valor);
    }
}
