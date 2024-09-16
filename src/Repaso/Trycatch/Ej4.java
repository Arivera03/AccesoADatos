package Repaso.Trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vectorrandom[] = new int[(int) (Math.random()*100) + 1];

        for (int i = 0; i < vectorrandom.length; i++) {
            vectorrandom[i] = (int) (Math.random()*10) + 1;
        }

        boolean comp = true;

        while (comp){
            try{
                System.out.println("Introduce un valor para buscarlo en el vector");
                int valorpedido = teclado.nextInt();
                if (valorpedido < 0){
                    System.out.println("Finalizando programa");
                    comp = false;
                } else{
                    boolean valido = false;
                    for (int i = 0; i < vectorrandom.length; i++) {
                        if (vectorrandom[i] == valorpedido){
                            System.out.println("El valor introducido está en el vector");
                            valido = true;
                            break;
                        }
                    }
                    if (!valido){
                        System.out.println("El valor introducido no está en el vector");
                    }
                }
            } catch (InputMismatchException e){
                System.out.println("El valor no es válido, intentalo de nuevo");
                teclado.nextLine();
            }
        }
    }
}
