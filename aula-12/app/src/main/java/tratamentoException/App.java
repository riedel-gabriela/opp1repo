package tratamentoException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static int inputNumero(String mensagem) throws InputMismatchException {
        do {
            Scanner scan = new Scanner(System.in);
            // esse try catch faz o do main ficar inútil.
            try {
                System.out.println(mensagem);
                int res = scan.nextInt();
                return res;
            } catch (Exception e) {
                System.err.println("Deu ruim: " + e);
                scan.next(); // limpar o buffer
            } finally {
                scan.close();
            }
        } while(true);

    }

    public static void main(String[] args) {
        int[] vetor = new int[10];

        try {
            int numero = inputNumero("Entre com um número: ");
            int posicao = inputNumero("Entre com a posição: ");

            vetor[posicao] = numero;
        } catch (InputMismatchException e) {
            System.err.println("Somente números.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Fora do limite do vetor.");
        } catch (Exception e) {
            System.err.println("Comportamento inesperado.");
        }

    }
}
