/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            String linha = scanner.nextLine();
            System.out.println(linha.toUpperCase());
        }
    }
}
