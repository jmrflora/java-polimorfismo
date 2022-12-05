public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();

        g1.setNome("Marcos");
        g1.setCpf("2345 ");
        g1.setSalario(5000);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

        System.out.println(g1.autentica(12345));

        g1.setSenha(12345);

        System.out.println(g1.autentica(12345));

        System.out.println(g1.getBonificacao());
    }

}
