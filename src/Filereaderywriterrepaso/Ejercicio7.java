package Filereaderywriterrepaso;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();
        try{
            FileReader arch = new FileReader("src/7.txt");
            BufferedReader br = new BufferedReader(arch);
            String linea;
            int numpalabras = 1;
            int numlineas = 0;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (int i = 0; i < palabras.length; i++) {
                    numpalabras++;
                }
                numlineas++;
            }
            System.out.println(numpalabras);
            System.out.println(numlineas);

            br.close();

        } catch (FileNotFoundException f){
            System.out.println("no va");
        } catch (IOException io){
            System.out.println("no vaa");
        }
    }
}
