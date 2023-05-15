package Herencia.ClaseA;

public class Alumno extends Persona {

    protected String grupo;
    protected Double notamedia;

    public void imprimeProfe(String grupo, Double notamedia) {
        this.grupo = grupo;
        this.notamedia = notamedia;
        
    }
}
