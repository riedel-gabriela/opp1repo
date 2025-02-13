package aula;

public class Carta {
    public final ValorCarta valor;
    public final Naipe naipe;

    public Carta(ValorCarta valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carta{");
        sb.append("valor=").append(valor);
        sb.append(", naipe=").append(naipe);
        sb.append('}');
        return sb.toString();
    }
}
