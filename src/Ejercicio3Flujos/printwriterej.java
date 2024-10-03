package Ejercicio3Flujos;

import java.io.*;


public class printwriterej {
    public static void main(String[] args) {
        try {
            PrintWriter escrituraarchivo = new PrintWriter(new FileWriter("Ejercicio.txt", true));
            escrituraarchivo.println("Las clases de ficheros en Java son un jaleo\n");
            escrituraarchivo.flush();
            escrituraarchivo.close();
        } catch (IOException i){
            System.out.println("no va");
        }

    }
}
