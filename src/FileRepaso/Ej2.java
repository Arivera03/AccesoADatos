package FileRepaso;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean intro = false;

        while (!intro) {
            try {
                System.out.println("Escribe la ruta que quieras mostrar");
                String ruta = teclado.nextLine();
                if (ruta.isEmpty()) {
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
        boolean info = true;
        Arrays.sort(ficheros);
        for (File fichero : ficheros){
            if (fichero.isDirectory()){
                System.out.print("[D] " + fichero.getName());
                if (info){
                    System.out.println(" " + fichero.length() + " bytes " + fichero.lastModified());
                } else {
                    System.out.println();
                }
            }
        }
        for (File fichero : ficheros){
            if (fichero.isFile()){
                System.out.print("[A] " + fichero.getName());
                if (info){
                    System.out.println(" " + fichero.length() + " bytes " + fichero.lastModified());
                } else {
                    System.out.println();
                }
            }
        }
    }
}
