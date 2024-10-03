package Ejercicio3Flujos;

import java.io.*;

public class FwyBw {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("Ejercicio.txt");
            fw.write("Las clases de ficheros en Java son un jaleo con FileWriter\n");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Las clases de ficheros en Java son un jaleo con BufferedWriter\n");
            bw.close();
        } catch (IOException e){
            System.out.println("no va");
        }

    }
}
