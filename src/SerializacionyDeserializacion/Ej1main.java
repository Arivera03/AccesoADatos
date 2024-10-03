package SerializacionyDeserializacion;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej1main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Asignatura asignatura1 = new Asignatura();
        asignatura1.nombreasignatura = "Programación";
        Asignatura asignatura2 = new Asignatura();
        asignatura2.nombreasignatura = "Base de datos";
        Asignatura asignatura3 = new Asignatura();
        asignatura3.nombreasignatura = "Lenguaje de marcas";
        Asignatura asignatura4 = new Asignatura();
        asignatura4.nombreasignatura = "Entornos de desarrollo";
        Asignatura asignatura5 = new Asignatura();
        asignatura5.nombreasignatura = "Ingles";
        Asignatura asignatura6 = new Asignatura();
        asignatura6.nombreasignatura = "FOL";

        System.out.print("Introduce la nota de Programación ");
        asignatura1.configurarNota(teclado.nextInt());
        System.out.print("Introduce la nota de Base de datos ");
        asignatura2.configurarNota(teclado.nextInt());
        System.out.print("Introduce la nota de Lenguaje de marcas ");
        asignatura3.configurarNota(teclado.nextInt());
        System.out.print("Introduce la nota de Entornos de desarrollo ");
        asignatura4.configurarNota(teclado.nextInt());
        System.out.print("Introduce la nota de Ingles ");
        asignatura5.configurarNota(teclado.nextInt());
        System.out.print("Introduce la nota de FOL ");
        asignatura6.configurarNota(teclado.nextInt());

        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        asignaturas.add(asignatura1);
        asignaturas.add(asignatura2);
        asignaturas.add(asignatura3);
        asignaturas.add(asignatura4);
        asignaturas.add(asignatura5);
        asignaturas.add(asignatura6);

        try {
            FileOutputStream archivoescribir = new FileOutputStream("asignaturas.dat");
            ObjectOutputStream out = new ObjectOutputStream(archivoescribir);
            for (Asignatura asignatura : asignaturas) {
                out.writeObject(asignatura);
                System.out.println("Se ha serializao");
            }
            archivoescribir.close();
            out.close();

            Asignatura objeto = null;
            FileInputStream archivoleer = new FileInputStream("asignaturas.dat");
            ObjectInputStream in = new ObjectInputStream(archivoleer);
            int sumanotas = 0;
            for (int i = 0; i < 6; i++) {
                objeto = (Asignatura) in.readObject();
                sumanotas += objeto.nota;
            }
            in.close();
            archivoleer.close();
            int media = sumanotas / 6;
            System.out.println("La media es: " + media);

        } catch (IOException i) {
            System.out.println("no va");
        } catch (ClassNotFoundException c){
            System.out.println("no va");
        }


    }
}
