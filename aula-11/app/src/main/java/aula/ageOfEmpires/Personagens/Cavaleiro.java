package aula.ageOfEmpires.Personagens;

public class Cavaleiro extends Personagem implements Guerreiro {
    public Cavaleiro(Double velocidade, Integer ataque, Integer vida) {
        super(velocidade, ataque, vida);
    }

    public String atacar() {
        return "Cavaleiro atacando com espada.";
    }

    public String mover() {
        return "Cavaleiro se movendo na velocidade 3.";
    }
}
