package Repaso3Ev.Herencia.A;

public class Persona {
    protected String nombre;
    protected String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return apellidos + ", " + nombre;
    }
}

