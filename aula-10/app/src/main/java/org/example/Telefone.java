package org.example;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class Telefone {
    private String rotulo;
    private String valor;

    public Telefone(String rotulo, String valor) {
        this.rotulo = rotulo;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return rotulo + ": " + formataTelefone(valor);
    }

    private String formataTelefone(String valor){
        String mascara = "(##) #####−####";
        MaskFormatter mask = null;
        String resultado = "";
        try {
            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            resultado = mask.valueToString(valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}
