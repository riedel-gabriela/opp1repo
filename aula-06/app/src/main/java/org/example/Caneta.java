package org.example;

public class Caneta {
    private String cor;
    private int nivelTinta;

    public String desenhar(int distancia) {
        if (distancia < 0) {
            return "Valor inválido. Tente novamente!";
        }
        if (distancia > nivelTinta) {
            return "Nivel de tinta insuficiente.";
        } else {
            nivelTinta -= distancia;
            return "-".repeat(distancia);
        }
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
    public void setNivelTinta(int nivelTinta) {
        this.nivelTinta = nivelTinta;
    }
    public String getNivelTinta() {
        return (nivelTinta + "%");
    }
}
