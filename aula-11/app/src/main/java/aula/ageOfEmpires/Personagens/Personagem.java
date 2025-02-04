package aula.ageOfEmpires.Personagens;


//Para que essa classe sirva só de gabarito, e não possa fazer um personagem sem as características de personagem, é necessároio que
//eu transforme essa classe e uma CLASSE ABSTRATA.
public abstract class Personagem {
    private Integer vida;
    private Integer ataque;
    private Double velocidade;

    public Personagem(Double velocidade, Integer ataque, Integer vida) {
        this.velocidade = velocidade;
        this.ataque = ataque;
        this.vida = vida;
    }

    public abstract String mover();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personagem{");
        sb.append(", vida=").append(vida);
        sb.append(", ataque=").append(ataque);
        sb.append(", velocidade=").append(velocidade);
        sb.append('}');
        return sb.toString();
    }
}
