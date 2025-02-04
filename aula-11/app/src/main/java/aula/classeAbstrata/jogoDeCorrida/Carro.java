package aula.classeAbstrata.jogoDeCorrida;

public class Carro extends Automovel {
    public Carro(String marca, String cor, String modelo) {
        super(marca, cor, modelo);
    }

    @Override
    public String acelerar() {
        return "";
    }

    @Override
    public String frear() {
        return "";
    }

    @Override
    public String ligar() {
        return "";
    }

    @Override
    public String desligar() {
        return "";
    }
}
