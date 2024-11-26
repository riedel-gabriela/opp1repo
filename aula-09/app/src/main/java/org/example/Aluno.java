package org.example;

import java.util.ArrayList;
import java.util.HashSet;

public class Aluno {
    private String nome;
    private Long matricula;
    // mais de um telefone
    private ArrayList<String> telefones;
    // nome do pai e da mãe
    private ArrayList<String> filiacao;
    //mais de uma disciplina e não pode elementos duplicados
    private HashSet<String> disciplinas;

    public Aluno(String nome, String pai, String mae, Long matricula) {
        this.nome = nome;
        this.matricula = matricula;

        this.filiacao = new ArrayList<>();
        this.filiacao.add(pai);
        this.filiacao.add(mae);

        this.disciplinas = new HashSet<>();
        this.telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public ArrayList<String> getTelefones() {
        return telefones;
    }

    public void setTelefones(String telefones) {
        this.telefones.add(telefones);
    }

    public ArrayList<String> getFiliacao() {
        return filiacao;
    }


    public HashSet<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplina(String disciplina) {
        this.disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        StringBuilder telefonesSB = new StringBuilder();
        this.telefones.forEach(telefone -> telefonesSB.append("\n  - ").append(telefone));
        StringBuilder disciplinasSB = new StringBuilder();
        this.disciplinas.forEach(disciplina -> disciplinasSB.append("\n  - ").append(disciplina));

        return "\nMatrícula: " + matricula +
                "\nNome: " + nome +
                "\nFiliação: " + "\n  pai: " + this.filiacao.get(0) + "\n  mãe: " + this.filiacao.get(1) +
                "\nTelefones: " + telefonesSB +
                "\nDisciplinas: " + disciplinasSB;
    }
}
