package test;

import domain.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Alison");

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Kaio");


        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100.00d);
        Conta poupanca = new ContaPoupanca(cliente);
        cc.transferir(60.00d, poupanca);

        cc.imprimir(cliente);
        System.out.println();
        poupanca.imprimir(cliente);

        System.out.println();

        Banco banco = new Banco();
        banco.setClientes(List.of(cliente,cliente2));
        banco.listaClientes();
    }
}
