package org.example;

public class Pessoa {
    private String dataNascimento;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String telefone;
    private String email;

    // Para gerar construtores: botão direito > generate > constructor > seleciona os parametros > ok

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String sobrenome) {
        this(nome);
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String sobrenome, String cpf) {
        this(nome, sobrenome);
        this.cpf = cpf;
    }

    // Para gerar getter and setter: botão direito > generate > getter and setter > seleciona os parametros > ok


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }


    public String getNome() {
        return ("nome: " + nome);
    }

    public String getCpf() {
        return ("cpf: " + cpf);
    }

}
