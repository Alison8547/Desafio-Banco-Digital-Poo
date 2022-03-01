package domain;

public abstract class Conta implements IConta {
    private static final int PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void informacoes(){
        System.out.printf("Titular: %s%n",cliente.getNome());
        System.out.printf("Agência: %d%n",this.agencia);
        System.out.printf("Numéro: %d%n",this.numero);
        System.out.printf("Saldo: %.2f%n",this.saldo);
    }
}
