package aula.ageOfEmpires.Personagens;

public class Cavaleiro extends Personagem {
    public Cavaleiro(Double velocidade, Integer ataque, Integer vida) {
        super(velocidade, ataque, vida);
    }

    public String atacar() {
        return super.atacar() + "espada.";
    }

    public String mover() {
        return super.mover() + "3.";
    }
}
