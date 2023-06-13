package Repaso3Ev;

public class ej {

    //COMPARE TO
    class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    // Constructor, getters, setters

    @Override
    public int compareTo(Persona otraPersona) {
        return Integer.compare(this.edad, otraPersona.edad);
    }
}

}
