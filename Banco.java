import java.util.List;
import java.util.ArrayList;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

  
    public Conta buscarContaPorNumero(String numeroConta) throws ContaNaoEncontradaException {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return conta;
            }
        }
        throw new ContaNaoEncontradaException("Conta com número " + numeroConta + " não encontrada.");
    }

    public Conta buscarConta(Conta c) throws ContaNaoEncontradaException {
        for (Conta conta : contas) {
            if (conta.equals(c)) {
                return conta;
            }
        }
        throw new ContaNaoEncontradaException("Conta não encontrada.");
    }

    
    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

}
