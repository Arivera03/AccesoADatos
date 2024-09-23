package Filereaderywriterrepaso;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        FileReader archivo = null;


        try {
            archivo = new FileReader("Documentos/alumnos_notas.txt");
            BufferedReader br = new BufferedReader(archivo);

            String lineas = br.readLine();
            String[] info = lineas.split(" ");

            for (int i = 2; i < lineas.length(); i++) {

            }


        } catch (FileNotFoundException f) {
            System.out.println("no va");
        } catch (IOException io) {
            System.out.println("no va");
        }
    }
}
