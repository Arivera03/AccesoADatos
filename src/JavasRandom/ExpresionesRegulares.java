package JavasRandom;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionesRegulares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de teléfono");
        String telefono = sc.nextLine();
        String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(telefono);
        if (m.matches()) {
            System.out.println("es válido.");
        } else {
            System.out.println("no es válido.");
        }
    }
}
