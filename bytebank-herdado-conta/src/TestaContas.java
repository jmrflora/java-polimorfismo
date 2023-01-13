public class TestaContas {
    public static void main(String[] args) throws SaldoInsuficienteEx{
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);
        System.out.println("CC saldo: "+ cc.getSaldo());


        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);
        System.out.println("CP saldo: "+ cp.getSaldo());

        cc.transfere(10, cp);

        System.out.println("CC saldo: "+ cc.getSaldo());
        System.out.println("CP saldo: "+ cp.getSaldo());
    }
}
