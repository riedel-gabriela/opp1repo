package aula.ageOfEmpires;

import aula.ageOfEmpires.Personagens.Aldeao;
import aula.ageOfEmpires.Personagens.Arqueiro;
import aula.ageOfEmpires.Personagens.Cavaleiro;
import aula.ageOfEmpires.Personagens.Personagem;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Personagem> aldeia = new ArrayList<>();

        aldeia.add(new Aldeao(0.8, 1, 25));
        aldeia.add(new Arqueiro(1.0, 2, 35));
        aldeia.add(new Cavaleiro(1.5, 3, 50));

        aldeia.forEach(personagem -> {
            System.out.println(personagem.atacar());
            System.out.println(personagem.mover());
        });
    }
}
