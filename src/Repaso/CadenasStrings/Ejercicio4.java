package Repaso.CadenasStrings;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe una frase");
        String frase = teclado.nextLine();
        int a = 0, e=0, i=0, o=0, u=0;
        frase.toLowerCase().split(" ");
        char  letras[] = frase.toCharArray();



        for (int j = 0; j < letras.length; j++) {
            if (letras[j] == 'a') {
                a++;
            }
            if (letras[j] == 'e') {
                e++;
            }
            if (letras[j] == 'i') {
                i++;
            }
            if (letras[j] == 'o') {
                o++;
            }
            if (letras[j] == 'u') {
                u++;
            }
        }

        System.out.println("El número de A ha sido: " + a);
        System.out.println("El número de E ha sido: " + e);
        System.out.println("El número de I ha sido: " + i);
        System.out.println("El nombre de O ha sido: " + o);
        System.out.println("El nombre de U ha sido: " + u);
    }
}
