package Repaso.CadenasStrings;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = teclado.nextLine();
        frase = frase.replace(" ", "").toLowerCase();

        boolean pal = true;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != frase.charAt(frase.length() - 1 - i)) {
                System.out.println("No es palindromo");
                pal = false;
            }
        }
        if (pal){
            System.out.println("Es palindromo");
        }
    }
}
