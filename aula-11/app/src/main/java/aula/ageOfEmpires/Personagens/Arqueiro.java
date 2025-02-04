package aula.ageOfEmpires.Personagens;

public class Arqueiro extends Personagem implements Guerreiro {

    public Arqueiro(Double velocidade, Integer ataque, Integer vida) {
        super(velocidade, ataque, vida);
    }

    public String atacar() {
        return "Arqueiro atacando com arco e flecha.";
    }

    public String mover() {
        return "Arqueiro se movendo na velocidade 1.";
    }
}
