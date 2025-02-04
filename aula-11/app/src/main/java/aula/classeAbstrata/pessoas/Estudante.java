package aula.classeAbstrata.pessoas;

import java.time.LocalDate;

public class Estudante extends Pessoa {
    public Estudante(String nome, LocalDate dataNsc) {
        super(nome, dataNsc);
    }

    @Override
    public String mover() {
      return "Estudante se movendo.";
    };
}
