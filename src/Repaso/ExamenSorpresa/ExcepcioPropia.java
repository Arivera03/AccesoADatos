package Repaso.ExamenSorpresa;

public class ExcepcioPropia extends Exception {
    private int n;
    public ExcepcioPropia(int n) {
        this.n = n;
        if (n > 10){
            System.out.println("Capturando la excepcion propia ["+ n +"]");
        }
    }
}
