package JavasRandom;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class htmlenjava {
    public static void main(String[] args) {
        try{
            Scanner teclado = new Scanner(System.in);
            URL url = new URL("https://es.wikipedia.org/wiki/Santiago_Abascal");
            Scanner sc = new Scanner(url.openStream());
            PrintWriter pw = new PrintWriter("pagina.html", "UTF-8");
            String palabra1 = "Abascal";
            Pattern patron1 = Pattern.compile(palabra1);
            String palabra2 = "Santiago";
            Pattern patron2 = Pattern.compile(palabra2);
            String palabra3 = "Vox";
            Pattern patron3 = Pattern.compile(palabra3);

            int contpalabra1 = 0;
            int contpalabra2 = 0;
            int contpalabra3 = 0;
            do {
                String linea = sc.nextLine();
                Matcher matcher1 = patron1.matcher(linea);
                Matcher matcher2 = patron2.matcher(linea);
                Matcher matcher3 = patron3.matcher(linea);
                if (matcher1.find()) {
                    contpalabra1++;
                }
                if (matcher2.find()) {
                    contpalabra2++;
                }
                if (matcher3.find()) {
                    contpalabra3++;
                }
                pw.println(linea);
            } while (sc.hasNextLine());

            System.out.println("La palabra "+ palabra1 +" se ha repetido "+ contpalabra1 +" veces" );
            System.out.println("La palabra "+ palabra2 +" se ha repetido "+ contpalabra2 +" veces" );
            System.out.println("La palabra "+ palabra3 +" se ha repetido "+ contpalabra3 +" veces" );
            sc.close();
            pw.close();






        } catch (IOException e){
            System.out.println("no va");
        }
    }
}
