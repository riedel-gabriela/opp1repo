/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public static void main(String[] args) {
        Telefone t = new Telefone("celular", "48996376006");
        System.out.println(t);

        Email e = new Email("pessoal", "gabriela@email.com");
        System.out.println(e);

        Contato c = new Contato("Gabriela", "Riedel", "14/18/2004");
        System.out.println(c);
        c.addEmail(e);
        c.addTelefone(t);

        System.out.println(c);
    }
}
