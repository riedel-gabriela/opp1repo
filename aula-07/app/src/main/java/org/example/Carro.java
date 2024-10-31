package org.example;

public class Carro {
    private String marca;
    private String modeloCarro;
    private String cor;
    private String valor;
    private String modeloMotor;
    private final int VELOCIDADE_MAXIMA;
    private int velocidadeAtual;

    // Ao construir um carro, iniciar um construtor com todos os atributos. Atribuir a velocidade máxima no construtor.

    public Carro(int VELOCIDADE_MAXIMA, int velocidadeAtual) {
        this.velocidadeAtual = 0;
        this.VELOCIDADE_MAXIMA = VELOCIDADE_MAXIMA;
        this.aceleraCarro(velocidadeAtual);
    }

    public int getVelocidade() {
        return velocidadeAtual;
    }

    public void aceleraCarro(int v) {
        this.velocidadeAtual = Math.max(Math.min(velocidadeAtual + v, VELOCIDADE_MAXIMA), v);
    }

    public void freiaCarro(int v) {
        this.velocidadeAtual = Math.max(velocidadeAtual - v, 0);
    }
}
