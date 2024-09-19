package Ej1Colecciones;

public class Estudiante {
    private int id;
    private String nombre;
    private int edad;

    public Estudiante(int id, String n, int e) {
        this.id = id;
        this.nombre = n;
        this.edad = e;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
