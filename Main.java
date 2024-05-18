public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        
        Conta conta1 = new Conta();
        conta1.setNumeroConta("123456");
        banco.adicionarConta(conta1);
        
        try {
            Conta encontrada = banco.buscarContaPorNumero("123456");
            System.out.println("Conta encontrada: " + encontrada.getNumeroConta());
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
        
        Conta conta2 = new Conta();
        conta2.setNumeroConta("654321");

        try {
            Conta encontrada = banco.buscarConta(conta2);
            System.out.println("Conta encontrada: " + encontrada.getNumeroConta());
        } catch (ContaNaoEncontradaException e) {
            System.out.println(e.getMessage());
        }
    }
}
