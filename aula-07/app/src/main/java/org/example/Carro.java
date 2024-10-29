package org.example;

public class Carro {
    private String marca;
    private String modeloCarro;
    private String cor;
    private String valor;
    private String modeloMotor;
    private final int VELOCIDADE_MAXIMA = 200;
    private int velocidadeAtual;

    public int obterVelocidade() {
        return velocidadeAtual;
    }

    public void aceleraCarro(int v) {
        if (velocidadeAtual + v > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        } else {
            velocidadeAtual += v;
        }
    }

    public void freiaCarro(int v) {
        if (velocidadeAtual - v < 0) {
            velocidadeAtual = 0;
        } else {
          velocidadeAtual -= v;
        }
    }
}
