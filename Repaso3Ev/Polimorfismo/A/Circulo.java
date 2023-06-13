package Repaso3Ev.Polimorfismo.A;

public class Circulo extends Figura {
    private Punto2D centro;
    private double radio;

    public Circulo(Punto2D centro, double radio) {
        super("Circulo");
        this.centro = centro;
        this.radio = radio;
    }

    public Punto2D getCentro() {
        return centro;
    }

    public void setCentro(Punto2D centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        // Cálculo del área del círculo
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calculatePerimeter() {
        // Cálculo del perímetro del círculo
        return 2 * Math.PI * radio;
    }
}
