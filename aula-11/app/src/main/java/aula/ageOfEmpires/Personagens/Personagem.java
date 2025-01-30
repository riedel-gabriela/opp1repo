package aula.ageOfEmpires.Personagens;

public class Personagem {
    private Integer vida;
    private Integer ataque;
    private Double velocidade;

    public Personagem(Double velocidade, Integer ataque, Integer vida) {
        this.velocidade = velocidade;
        this.ataque = ataque;
        this.vida = vida;
    }

    public String atacar(){
        return "Atacando com ";
    }

    public String mover() {
        return "Movendo na velocidade ";
    }

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
