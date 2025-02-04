package aula.classeAbstrata.pessoas;

import java.time.LocalDate;

//abstract garante que não consigo criar uma instância sem sobrescrever a classe.
public abstract class Pessoa {
    private String nome;
    private LocalDate dataNsc;

    public Pessoa(String nome, LocalDate dataNsc) {
        this.nome = nome;
        this.dataNsc = dataNsc;
    }

    //metodo abstract que obriga a sobrescrita.
    public abstract String mover();

}
