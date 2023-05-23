package Herencia.ClaseD.Figuras;

public class Circulo extends Figura{

    //ATRIBUTOS
    protected double radio;

    //CONSTRUCTOR  (es lo unico que no heredan de la clase padre)
    public Circulo(double radio) {
        this.radio = radio;
    }

    //GET,SET
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    //MÉTODO
    public  double area() { /* No se pone nada entre parentesis porque lo heredan de la Clasepadre */
        double areaCirc = Math.PI * (Math.pow(radio,2));
        return areaCirc;
        
        
    }
}
