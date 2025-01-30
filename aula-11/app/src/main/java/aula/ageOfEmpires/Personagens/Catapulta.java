package aula.ageOfEmpires.Personagens;

public class Catapulta extends Personagem{
    public Catapulta(String nome, Double velocidade, Integer ataque, Integer vida) {
        super(velocidade, ataque, vida);
    }

    public String atacar() {
        return super.atacar() + "pedras.";
    }

    public String mover() {
        return super.mover() + "2.";
    }
}
