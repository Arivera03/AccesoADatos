package Repaso.CadenasStrings;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe nombre");
        String nombre1 = teclado.nextLine();
        System.out.println("1er apellido");
        String nombre2 = teclado.nextLine();
        System.out.println("2do apellido");
        String nombre3 = teclado.nextLine();

        nombre1 = nombre1.substring(0,3).toUpperCase();
        nombre2 = nombre2.substring(0,3).toUpperCase();
        nombre3 = nombre3.substring(0,3).toUpperCase();
        System.out.println(nombre1 + nombre2 + nombre3);
    }
}
