package domain;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimir(Cliente cliente) {
        System.out.println("=== Conta corrente ===");
        super.informacoes();
    }
}
