public class Cliente {

    public int numeroDaConta;
    public int agencia;
    public String nomeDoCorrentista;
    public double saldo;

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

}
