package domain;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir(Cliente cliente) {
        System.out.println("=== Conta Poupança ===");
        super.informacoes();
    }
}
