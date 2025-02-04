package aula.ageOfEmpires.Personagens;

public class Aldeao extends Personagem implements Guerreiro, Coletador {

    public Aldeao(Double velocidade, Integer ataque, Integer vida) {
        super(velocidade, ataque, vida);
    }

    public String atacar() {
        return "Aldeão atacando com picareta.";
    }

    public String mover() {
        return "Aldeão se movendo na velocidade 0.8.";
    }

    @Override
    public String coletarMadeira() {
        return "";
    }

    @Override
    public String coletarOuro() {
        return "";
    }
}
