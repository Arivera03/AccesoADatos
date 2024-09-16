package Repaso.CadenasStrings;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = teclado.nextLine();
        String[] dividir = frase.split(" ");
        for (int i = 0; i < dividir.length; i++) {
            System.out.println(dividir[i]);
        }
    }
}
