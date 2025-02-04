package aula.ageOfEmpires.Personagens;

public class Catapulta extends Personagem{
    public Catapulta(String nome, Double velocidade, Integer ataque, Integer vida) {
        super(velocidade, ataque, vida);
    }

    public String atacar() {
        return "Catapulta atacando com pedras.";
    }

    public String mover() {
        return "Catapulta se movendo na velocidade 2.";
    }
}
