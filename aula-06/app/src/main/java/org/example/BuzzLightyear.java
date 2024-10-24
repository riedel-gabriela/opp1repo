package org.example;

import java.util.Random;

public class BuzzLightyear {
    private int capacete;
    private int asas;
    private String[] frases = {
            "Ao infinito e além!",
            "Preparado para voar!",
            "Comando estelar pronto para voar!",
            "Relatorio da missão",
            "Registro da missão, estou num território desconhecido.",
            "Isso não é voar, é cair... com estilo."
    };
    public String disparaLaser() {
        return "pewewewewewewewewew";
    }
    public String capaceteRetratil() {
        if (capacete % 2 == 0) {
            capacete++;
            return "Capacete aberto!";
        } else {
            capacete++;
            return "Capacete fechado!";
        }
    }
    public String abreAsas() {
        if (asas % 2 == 0) {
            asas++;
            return "Asas abertas!";
        } else {
            asas++;
            return "Asas fechadas!";
        }
    }
    public String dizFrase() {
        Random r = new Random();
        String frase = frases[r.nextInt(6)];
        return frase;
    }
    public String golpesDeKarate() {
        return "Aplicando golpes de karatê!";
    }
}
