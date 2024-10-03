package SerializacionyDeserializacion;

import java.io.Serializable;
import java.util.Scanner;

public class Asignatura implements Serializable {
    public String nombreasignatura;
    public int nota;

    public void configurarNota(int nota){
        Scanner teclado = new Scanner(System.in);
        boolean furula = false;
        while (!furula){
            if (nota<0 || nota>10){
                System.out.println("La nota no es válida, prueba otra vez");
                nota = teclado.nextInt();
            } else {
                this.nota = nota;
                furula = true;
            }
        }
    }
}
