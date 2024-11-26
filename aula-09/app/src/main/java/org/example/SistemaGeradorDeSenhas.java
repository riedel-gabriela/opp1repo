package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class SistemaGeradorDeSenhas {
// trocar o arraylist por queue;
    private ArrayList<Senha> senhas;
    private AtomicInteger contador;

    public SistemaGeradorDeSenhas() {
        this.senhas = new ArrayList<>();
    }

//    public Senha chamaProximaSenha() {
//        return;
//    }

    public void adicionarSenha() {
        Integer numero = contador.incrementAndGet();
        LocalDateTime horario = LocalDateTime.now();

    }


    public static void main(String[] args) {
        SistemaGeradorDeSenhas s = new SistemaGeradorDeSenhas();
        s.adicionarSenha();
        // Senha a = s.chamaProximaSenha();
    }
}
