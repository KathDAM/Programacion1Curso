package Herencia.ClaseA;

public class Alumno extends Persona {

    protected String grupo;
    protected Double notamedia;

    public void imprimeProfe(String grupo, Double notamedia) {
        this.grupo = grupo;
        this.notamedia = notamedia;
        
    }

    //GETTER Y SETTER
    public Double getNotamedia() {
        return notamedia;
    }
    public String getGrupo() {
        return grupo;
    }

    public void setNotamedia(Double notamedia) {
        this.notamedia = notamedia;
    }public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
