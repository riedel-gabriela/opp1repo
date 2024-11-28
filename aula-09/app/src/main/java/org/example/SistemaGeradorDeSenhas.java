package org.example;


import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class SistemaGeradorDeSenhas {
    private Queue<Senha> senhas;
    private AtomicInteger contador;

    public SistemaGeradorDeSenhas() {
        this.senhas = new LinkedList<>();
        this.contador = new AtomicInteger();
    }

    public Senha chamaProximaSenha() {
        return this.senhas.poll();
    }

    public void adicionarSenha() {
        LocalDateTime horario = LocalDateTime.now();
        Integer numero = contador.incrementAndGet();

        Senha s = new Senha(numero, horario, "conta", false);
        this.senhas.add(s);
    }


    public static void main(String[] args) {
        SistemaGeradorDeSenhas s = new SistemaGeradorDeSenhas();
        s.adicionarSenha();
        s.adicionarSenha();
//        System.out.println(s);

        Senha a = s.chamaProximaSenha();
        System.out.println(a);

    }
}
