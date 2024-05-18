public class Conta {
    private String numeroConta;
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Conta conta = (Conta) obj;
        return numeroConta != null ? numeroConta.equals(conta.numeroConta) : conta.numeroConta == null;
    }

    @Override
    public int hashCode() {
        return numeroConta != null ? numeroConta.hashCode() : 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
