package Repaso.Trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double vector[] = new double[5];
        System.out.println("Escribe números para el vector");
        for (int i = 0; i < vector.length; i++) {
        try{
            vector[i] = teclado.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Intentalo de nuevo");
            i--;
            teclado.nextLine();
        }
        }
    }
}
