package JavasRandom;

import java.io.*;

public class htmlenjava {
    public static void main(String[] args) {
        try{
            FileWriter archivohtml = new FileWriter("prueba.html");
            BufferedWriter bw = new BufferedWriter(archivohtml);
            bw.write("<html>\n" +
                    "<head>\n" +
                    "<title>Mi sitio web</title>\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<h1>Bienvenido a mi sitio web</h1>\n" +
                    "<h2>Este es un ejemplo sencillo de como hacer una página en java</h2>\n" +
                    "<ul>\n" +
                    "<p>Elemento 1</p>\n" +
                    "<p>Elemento 2</p>\n" +
                    "<p>Elemento 3</p>\n" +
                    "</ul>\n" +
                    "</body>\n" +
                    "</html>\n");
            bw.close();
        } catch (IOException e){
            System.out.println("no va");
        }
    }
}
