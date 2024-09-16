package Recursividad;

import java.util.Scanner;

public class EjerciciosRecursivos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un numero n");
        int n = teclado.nextInt();

        System.out.println(Recursivasumatorio(n));

        int arrayej2[] = new int[10];
        arrayej2[0] = 5;
        arrayej2[1] = 8;
        arrayej2[2] = 234;
        arrayej2[3] = 55;
        arrayej2[4] = 9;
        arrayej2[5] = 532;
        arrayej2[6] = 12;
        arrayej2[7] = 37;
        arrayej2[8] = 84;
        arrayej2[9] = 10;

        Recursivavector(0, arrayej2);

        System.out.println("Escribe un número para buscar en la array");
        int n2 = teclado.nextInt();

        RecursivaBuscarVector(0,n2,arrayej2);

        System.out.println("Escribe un número y contaré sus dígitos");
        int n3 = teclado.nextInt();
        int numdig = 0;
        RecursivaDetectarDigitos(n3,numdig);

        System.out.println("Por último escribe un número");
        int n4 = teclado.nextInt();

        System.out.println();
        System.out.println("Y ahora escribe la potencia que le quieres dar");
        int potencia = teclado.nextInt();
        potencia--;
        System.out.println(RecursivaPotencia(n4,potencia));
    }
    static int Recursivasumatorio(int n){
        if (n <= 1) {
            return n;
        } else {
            return Recursivasumatorio(n - 1) + n;
        }
    }

    static void Recursivavector(int n, int[] m){
        if (n+1 >= m.length) {
            System.out.println(m[n]);
        } else {
            System.out.println(m[n]);
            Recursivavector(n+1,m);
        }
    }

    static void RecursivaBuscarVector(int n,int i, int[] m){
        if (i == m[n]) {
            System.out.println("Está en el vector");
        } else if (n+1 >= m.length) {
            System.out.println("No está en el vector");
        } else {
            RecursivaBuscarVector(n+1,i,m);
        }
    }

    static void RecursivaDetectarDigitos(int n, int numdig){
        if (n != 0){
            numdig++;
            RecursivaDetectarDigitos(n/10,numdig);
        } else {
            System.out.println(numdig);
        }
    }

    static int RecursivaPotencia(int n, int p){
        if (p == 0){
            return n;
        } else {
            return n*RecursivaPotencia(n,p - 1);
        }
    }
}
