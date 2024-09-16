package Repaso.ExamenSorpresa;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Introduce un número positivo");
            imprimePositivo(teclado.nextInt());
            System.out.println("Introduce un valor negativo");
            imprimeNegativo(teclado.nextInt());
        } catch (InputMismatchException i){
            System.out.println("Valor no valido, finalizando programa");
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void imprimePositivo(int n) throws Exception {
        if (n >= 0){
            System.out.println(n);
        } else {
            throw new Exception("El número debe ser positivo");
        }
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n < 0){
            System.out.println(n);
        } else {
            throw new Exception("El número debe ser negativo");
        }
    }
}
