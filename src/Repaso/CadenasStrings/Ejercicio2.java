package Repaso.CadenasStrings;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String palabra1 = teclado.nextLine();
        System.out.println("Escribe otra palabra");
        String palabra2 = teclado.nextLine();

        System.out.println("¿Son la misma palabra? " + palabra1.equals(palabra2));
        System.out.println("¿Y ahora ignorando mayusculas y minusculas? " + palabra1.equalsIgnoreCase(palabra2));
    }
}
