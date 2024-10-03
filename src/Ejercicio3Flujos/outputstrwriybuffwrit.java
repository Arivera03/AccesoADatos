package Ejercicio3Flujos;

import java.io.*;

public class outputstrwriybuffwrit {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream(new File("Ejercicio.txt"), true);
            OutputStreamWriter osw = new OutputStreamWriter(fos);
            osw.write("Las clases de ficheros en Java son un jaleo con OutputStreamWriter\n");
            BufferedWriter bw = new BufferedWriter(osw);
            bw.write("Las clases de ficheros en Java son un jaleo con BufferedWriter\n");
            bw.close();

        }catch (IOException e){
            System.out.println("no va");
        }

    }
}
