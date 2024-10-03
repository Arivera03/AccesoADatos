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
        int RepPalabra = 0;
        String palabramasrep = null;
        try{
            FileReader arch = new FileReader("src/7.txt");
            BufferedReader br = new BufferedReader(arch);
            String linea;
            int numpalabras = 1;
            int numlineas = 0;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split(" ");
                for (String palabra : palabras) {
                    mapa.put(palabra, mapa.getOrDefault(palabra, 0) + 1);
                    numpalabras++;
                    if (mapa.get(palabra) > RepPalabra) {
                        RepPalabra = mapa.get(palabra);
                        palabramasrep = palabra;
                    }
                }
                numlineas++;
            }
            System.out.println(numpalabras);
            System.out.println(numlineas);
            System.out.println("La palabra más repetida ha sido: " + palabramasrep);
            

            br.close();

        } catch (FileNotFoundException f){
            System.out.println("no va");
        } catch (IOException io){
            System.out.println("no vaa");
        }
    }
}
