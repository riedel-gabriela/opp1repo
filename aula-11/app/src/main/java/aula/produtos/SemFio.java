package aula.produtos;

public class SemFio extends Telefone{

    private double frequencia;
    private int quantidadeCanais;
    private double distancia;

    public SemFio(int codigo, String numSerie, String modelo, double peso, Dimensao dimensao, double frequencia, int quantidadeCanais, double distancia) {
        super(codigo, numSerie, modelo, peso, dimensao);
        this.frequencia = frequencia;
        this.quantidadeCanais = quantidadeCanais;
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SemFio{");
        sb.append("frequencia=").append(frequencia);
        sb.append(", quantidadeCanais=").append(quantidadeCanais);
        sb.append(", distancia=").append(distancia);
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }

}
