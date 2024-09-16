package Repaso.Trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.println("Escribe un número A");
            int numeroA = teclado.nextInt();
            System.out.println("Ahora un número B");
            int numeroB = teclado.nextInt();

            System.out.println(numeroA / numeroB);
        } catch (InputMismatchException i) {
            System.out.println("Has escrito lo que no toca");
        } catch (ArithmeticException a) {
            System.out.println("No se ha podido calcular");
        }
    }
}
