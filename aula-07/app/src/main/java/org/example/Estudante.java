package org.example;

public class Estudante {
    // Atributos:
    private String curso;
    private String nome;
    private int idade;
    // Static significa que o atributo da classe e não do objeto/instancia.
    // Um exemplo é esse contador de objetos. Todos os objetos olham pra essa mesmo atributo da classe.
    private static int total = 0;

    // Construtor:
    public Estudante(int idade, String nome, String curso) {
        this.idade = idade;
        this.nome = nome;
        this.curso = curso;
        total++;
    }

    // Getters e Setters:
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Estudante{" +
                "curso ='" + this.curso + '\'' +
                ", nome ='" + this.nome + '\'' +
                ", idade =" + this.idade +
                '}';
    }

}
