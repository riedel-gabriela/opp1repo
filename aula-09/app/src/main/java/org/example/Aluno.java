package org.example;

import org.checkerframework.checker.units.qual.A;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class Aluno {
    private String nome;
    private Long matricula;
    // mais de um telefone
    private ArrayList<Integer> telefones;
    // nome do pai e da mãe
    private ArrayList<String> filiacao;
    //mais de uma disciplina
    private HashSet<String> disciplinas;

    public Aluno(String nome, String pai, String mae, Long matricula) {
        this.nome = nome;
        this.matricula = matricula;
        ArrayList<String> filiacao = new ArrayList<>();
        filiacao.add(pai);
        filiacao.add(mae);
        this.filiacao = filiacao;
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

    public ArrayList<Integer> getTelefones() {
        return telefones;
    }

    public void setTelefones(ArrayList<Integer> telefones) {
        this.telefones = telefones;
    }

    public ArrayList<String> getFiliacao() {
        return filiacao;
    }

    public void setFiliacao(ArrayList<String> filiacao) {
        this.filiacao = filiacao;
    }

    public ArrayList<String> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(String disciplina) {
        this.disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Aluno {" +
                "\n nome: " + nome +
                ",\n matricula: " + matricula +
                ",\n telefones: " + telefones +
                ",\n filiacao: " + filiacao +
                ",\n disciplinas: " + disciplinas +
                "\n}";
    }
}
