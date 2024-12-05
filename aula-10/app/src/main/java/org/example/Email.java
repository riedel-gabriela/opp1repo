package org.example;

public class Email {
    private String rotulo;
    private String valor;

    public Email(String rotulo, String valor) {
        this.valor = validaEmail(valor);
        this.rotulo = rotulo;
    }

    @Override
    public String toString() {
        return rotulo + ": " + valor;
    }

    private String validaEmail(String valor) {
        String eR = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        if (valor.matches(eR)){
            return valor;
        } else {
            return null;
        }
    }
}
