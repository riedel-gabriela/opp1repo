package org.example;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Senha {
    private Integer numero;
    private Boolean preferencial;
    private String assunto;
    private LocalDateTime horario;

    public Senha(Integer numero, LocalDateTime horario, String assunto, Boolean preferencial) {
        this.numero = numero;
        this.horario = horario;
        this.assunto = assunto;
        this.preferencial = preferencial;
    }

    @Override
    public String toString() {
        return "Senha{" +
                "numero=" + numero +
                ", preferencial=" + preferencial +
                ", assunto='" + assunto + '\'' +
                ", horario=" + horario +
                '}';
    }
}
