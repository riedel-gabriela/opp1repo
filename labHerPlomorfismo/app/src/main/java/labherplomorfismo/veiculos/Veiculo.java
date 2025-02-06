package labherplomorfismo.veiculos;

public abstract class Veiculo {
    private Integer id;
    protected Integer velocidadeAtual;

    protected Veiculo() {
        this.velocidadeAtual = 0;
    }

    abstract Integer acelerar(int i);
    abstract Integer frear(int i);
}
