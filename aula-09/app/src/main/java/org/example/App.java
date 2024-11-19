/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(20);
        numeros.add(10);
        numeros.add(5);

        //for each tradicional
        for (Integer numero: numeros) {
            System.out.println(numero);
        }

        // lambda
        numeros.forEach(e -> System.out.println(e));

        //method reference
        numeros.forEach(System.out::println);

        numeros.removeIf(numero -> numero % 10 == 0);
        System.out.println(numeros);

        //__________________________________________________________________________________

        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Gabriela");
        nomes.add("Alexandre");
        nomes.add("Letícia");

        System.out.println(nomes);
        nomes.removeIf(nome -> nome.equals("Alexandre"));
        System.out.println(nomes);

        nomes.stream().filter(nome -> !nome.equals("Letícia")).forEach(System.out::println);

        //______________________________________________________________________________

        // FIFO: first in, first out
        Queue<String> fila = new LinkedList<>();

        fila.add("Gabriela");
        fila.add("Ana");

        //_______________________________________________________________________________

        ArrayList<String> segundaFase = new ArrayList<>();
        segundaFase.add("Programação Orientada a Objetos");

        Aluno a = new Aluno(
               "Alexandre Pereira", "Osvaldo Montenegro", "Fernanda Abreu", 1L
        );

        System.out.println(a);


    }
}