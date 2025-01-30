package aula.ageOfEmpires.Personagens;

public class Aldeao extends Personagem {

    public Aldeao(Double velocidade, Integer ataque, Integer vida) {
        super(velocidade, ataque, vida);
    }

    public String atacar() {
        return super.atacar() + "picareta.";
    }

    public String mover() {
        return super.mover() + "0.8";
    }
}
