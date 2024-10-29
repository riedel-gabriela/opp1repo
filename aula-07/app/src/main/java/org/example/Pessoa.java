package org.example;

public class Pessoa {
    private String dataNascimento;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String email;

    public Pessoa(String n, String c) {
        nome = n;
        cpf = c;
    }

    public Pessoa() {
        // Posso criar quantos métodos construtores eu quiser, desde que a lista de parâmetros seja diferente EM NÚMERO E TIPO.
    }

    public void defineCPF(String novoCpf) {
       cpf = novoCpf;
    }
    public void defineNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return ("nome: " + nome);
    }

    public String getCpf() {
        return ("cpf: " + cpf);
    }

}
