package Ej1Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorEstudiantes {
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Estudiante anton = new Estudiante(1,"Antonio",14);
        estudiantes.add(anton);
        Estudiante john = new Estudiante(2,"John",13);
        estudiantes.add(john);
        Estudiante alex = new Estudiante(3,"Alex",15);
        estudiantes.add(alex);
        Estudiante juan = new Estudiante(4,"Juan",14);
        estudiantes.add(juan);
        Estudiante robert = new Estudiante(5,"Roberto",15);
        estudiantes.add(robert);

        anadirestudiante(estudiantes);

        obtenerid(estudiantes);

        actualizaredad(estudiantes);

        eliminarporid(estudiantes);

        obtenerid(estudiantes);
    }

    public static void anadirestudiante(ArrayList<Estudiante> ests) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Id del estudiante que quieras añadir");
        int id = teclado.nextInt();
        System.out.println("Nombre del estudiante");
        String nombre = teclado.next();
        System.out.println("Y por último la edad");
        int edad = teclado.nextInt();

        boolean existe = false;
        for (Estudiante est : ests) {
            if (est.getId() == id) {
                System.out.println("No se ha podido añadir el estudiante debido a que su id ya está registrado en la lista");
                existe = true;
            }
        }

        if (!existe) {
            ests.add(new Estudiante(id,nombre,edad));
        }
    }

    public static void obtenerid(ArrayList<Estudiante> ests) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Id del estudiante que quieras obtener");
        int id = teclado.nextInt();
        boolean existe = false;
        for (Estudiante est : ests) {
            if (est.getId() == id) {
                System.out.println(est.getNombre() + " con " + est.getEdad() + " años pertenece a la id especificada");
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No existe el estudiante con id " + id);
        }
    }

    public static void actualizaredad(ArrayList<Estudiante> ests) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Id del estudiante que quieras actualizar la edad");
        int id = teclado.nextInt();

        boolean existe = false;
        for (Estudiante est : ests) {
            if (est.getId() == id) {
                System.out.println(est.getNombre() + " con " + est.getEdad() + " años pertenece a la id especificada");
                System.out.println();
                System.out.println("Especifica su nueva edad");
                int edad = teclado.nextInt();
                est.setEdad(edad);
                System.out.println("Modificado con éxito");
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No existe el estudiante con id " + id);
        }
    }

    public static void eliminarporid(ArrayList<Estudiante> ests) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Especifica la id del estudiante que quieras eliminar");
        int id = teclado.nextInt();

        boolean existe = false;
        for (int i = 0; i < ests.size(); i++) {
            if (ests.get(i).getId() == id) {
                ests.remove(ests.get(i));
                System.out.println("Borrado con éxito");
                existe = true;
            }
        }
        if (!existe) {
            System.out.println("No existe el estudiante con id " + id);
        }
    }
}
