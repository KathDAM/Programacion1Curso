package Herencia.ClaseA;


public class Profesor extends Persona{

    protected Double salario;
    protected String especialidad;

    public void imprimeProfe(Double salario, String especialidad) {
        this.especialidad = especialidad;
        this.salario = salario;
        
    }
}
