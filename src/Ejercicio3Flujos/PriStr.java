package Ejercicio3Flujos;

import java.io.*;

public class PriStr {
    public static void main(String[] args) {
        try{
            PrintStream ps = new PrintStream(new File("Ejercicio.txt"));
            ps.println("Las clases de ficheros en Java son un jaleo con PrintStream\n");
        } catch (FileNotFoundException e) {
            System.out.println("no va");
        }
    }
}
