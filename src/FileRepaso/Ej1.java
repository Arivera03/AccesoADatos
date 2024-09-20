package FileRepaso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean intro = false;

        while (!intro){
            try {
                System.out.println("Escribe la ruta que quieras mostrar");
                String ruta = teclado.nextLine();
                if (ruta.isEmpty()){
                    System.out.println("Finalizando...");
                    intro = true;
                } else {
                    File file = new File(ruta);
                    mostrarinforuta(file);
                }
            } catch (NullPointerException n) {
                System.out.println("La ruta no es válida");
            } catch (FileNotFoundException f) {
                System.out.println("No se encontró la ruta");
            }
        }
    }

    public static void mostrarinforuta(File f) throws FileNotFoundException {
        File[] ficheros = f.listFiles();
        for (File fichero : ficheros){
            if (fichero.isDirectory()){
                System.out.println("[D] " + fichero.getName());
            } else if (fichero.isFile()){
                System.out.println("[A] " + fichero.getName());
            } else {
                throw new FileNotFoundException();
            }
        }
    }
}
