package Herencia.ClaseA;


public class Profesor extends Persona{

    protected Double salario;
    protected String especialidad;

    public void imprimeProfe(Double salario, String especialidad) {
        this.especialidad = especialidad;
        this.salario = salario;
        
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
