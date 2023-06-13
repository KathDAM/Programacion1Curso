package Repaso3Ev.Herencia.A;

public class Profesor  extends Persona {
 private String despacho;

    public Profesor(String nombre, String apellidos, String despacho) {
        super(nombre, apellidos);
        this.despacho = despacho;
    }

    @Override
    public String toString() {
        return super.toString() + " (Office: " + despacho + ")";
    }
}