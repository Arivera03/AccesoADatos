package Repaso.Trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número");

        try {
            int numero = teclado.nextInt();
            System.out.println("Oleeeee");
        } catch (InputMismatchException i) {
            System.out.println("Un número he dicho >:(");
        }
    }
}
