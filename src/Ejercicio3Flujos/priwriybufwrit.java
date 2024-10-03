package Ejercicio3Flujos;

import java.io.*;

public class priwriybufwrit {
    public static void main(String[] args) {
        try {
            FileWriter archivo = new FileWriter("Ejercicio.txt");
            BufferedWriter bw = new BufferedWriter(archivo);
            bw.write("Las clases de ficheros en Java son un jaleo con bufferedwriter\n");
            PrintWriter pw = new PrintWriter(bw);
            pw.write("Las clases de ficheros en Java son un jaleo con printwriter\n");
            pw.flush();
            pw.close();
        } catch (IOException e) {
            System.out.println("no va");
        }

    }
}
