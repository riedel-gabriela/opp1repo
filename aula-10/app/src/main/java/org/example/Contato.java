package org.example;

import java.util.ArrayList;

public class Contato {
    private String nome;
    private String sobrenome;
    private String dataDeNascimento;
    private ArrayList<Telefone> telefones;
    private ArrayList<Email> emails;

    public Contato(String nome, String sobrenome, String dataDeNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeNascimento = dataDeNascimento;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    boolean addTelefone(Telefone telefone) {
        this.telefones.add(telefone);
        return true;
    }

    boolean addEmail(Email email) {
        this.emails.add(email);
        return true;
    }

    String imprimirTelefones() {
        StringBuilder telefonesSB = new StringBuilder();
        this.telefones.forEach(telefone -> telefonesSB.append("\n   ").append(telefone));
        return telefonesSB.toString();
    }

    String imprimirEmails() {
        StringBuilder emailsSB = new StringBuilder();
        this.emails.forEach(email -> emailsSB.append("\n   ").append(email));
        return emailsSB.toString();
    }

    boolean deleteEmail(int index) {
        this.emails.remove(index);
        return true;
    }

    boolean deleteTelefone(int index) {
        this.telefones.remove(index);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Nome: ").append(nome).append(" ").append(sobrenome).append("\nData Nasc.: ").append(dataDeNascimento).append("\nTelefones:").append(this.imprimirTelefones()).append("\nEmails:").append(this.imprimirEmails());

        return s.toString();
    }
}
