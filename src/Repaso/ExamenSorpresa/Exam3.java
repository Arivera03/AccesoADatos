package Repaso.ExamenSorpresa;

public class Exam3 {
    public static void main(String[] args) {

        try {
            metode(1);
            System.out.println("\n ******** ");
            metode(20);
        }
        catch (ExcepcioPropia expropia) {

            System.out.println("Capturant l'excepció " + expropia);
        }
    }

    static void metode (int n) throws ExcepcioPropia{

        System.out.println(" Estic cridant al mètode amb el valor: " + n + " metode("+n+")");

        if (n>10)
            throw new ExcepcioPropia(n);

        System.out.println("Finalització Normal!!! ");
}
}
