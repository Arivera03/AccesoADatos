package JavasRandom;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares2 {
    public static void main(String[] args) {
        String frase = "Eres un huevon";
        String insulto = "huevon";
        String reemplazo = "buen hombre";

        Pattern patron = Pattern.compile(insulto);
        Matcher matcher = patron.matcher(frase);
        
        String nuevoTexto = matcher.replaceAll(reemplazo);

        System.out.println(nuevoTexto);
    }
}
