package aula.classeAbstrata.jogoDeCorrida;

public abstract class Automovel implements Funcionamento {
    private String marca;
    private String cor;
    private String modelo;

    public Automovel(String marca, String cor, String modelo) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
    }
}
