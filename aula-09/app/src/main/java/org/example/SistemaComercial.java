package org.example;

import java.util.HashMap;

public class SistemaComercial {
    private HashMap<String, Cliente> clientes;

    public SistemaComercial() {
        this.clientes = new HashMap<>();
    }

    public boolean adicionarCliente(Cliente cliente) {
        if (this.clientes.get(cliente.getCpf()) == null) {
            this.clientes.put(cliente.getCpf(), cliente);
            return true;
        }
        return false;
    }

    public Cliente buscaCliente(String cpf) {
        return this.clientes.get(cpf);
    }

    public static void main(String[] args) {
        SistemaComercial sistema = new SistemaComercial();

        Cliente a = new Cliente("fulano", "1", "5454");
        Cliente b = new Cliente("beltrano", "2", "6565");
        Cliente c = new Cliente("ciclano", "3", "3232");

        sistema.adicionarCliente(a);
        sistema.adicionarCliente(b);
        sistema.adicionarCliente(c);

        System.out.println(sistema.buscaCliente("1"));
        System.out.println(sistema.buscaCliente("9"));


    }
}
