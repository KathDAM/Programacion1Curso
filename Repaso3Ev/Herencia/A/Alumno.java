package Repaso3Ev.Herencia.A;

public class Alumno extends Persona {
     private String cuatrimestre;

    public Alumno(String nombre, String apellidos, String cuatrimestre) {
        super(nombre, apellidos);
        this.cuatrimestre = cuatrimestre;
    }

    @Override
    public String toString() {
        return super.toString() + " (Semester: " + cuatrimestre + ")";
    }
}
