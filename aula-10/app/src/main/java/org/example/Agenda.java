package org.example;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    boolean addContato(Contato contato) {
        this.contatos.add(contato);
        return true;
    }

    boolean removeContato(String nome, String sobrenome) {
        return this.contatos.removeIf(contato ->
            contato.getNome().equals(nome) && contato.getSobrenome().equals(sobrenome)
        );
    }



}
