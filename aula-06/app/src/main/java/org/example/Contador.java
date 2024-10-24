package org.example;

public class Contador {
    private int valorAtual;

    public void setValor(int valor) {
        valorAtual = valor;
    }
    public void incrementar() {
        valorAtual++;
    }
    public int getValorAtual() {
        return valorAtual;
    }
}
