package Ejercicio3Flujos;

import java.io.*;

public class OutputStrWrit {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream(new File("Ejercicio.txt"), true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write("Las clases de ficheros en Java son un jaleo con OutputStreamWriter\n");
            osw.close();
        } catch (FileNotFoundException e) {
            System.out.println("no va");
        } catch (IOException e) {
            System.out.println("no va");
        }

    }
}
