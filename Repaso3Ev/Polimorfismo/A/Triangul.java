package Repaso3Ev.Polimorfismo.A;

public class Triangul extends Figura {
     private Punto2D punto1;
    private Punto2D punto2;
    private Punto2D punto3;

    public Triangul(Punto2D punto1, Punto2D punto2, Punto2D punto3) {
        super("Triangulo");
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto2D getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto2D punto1) {
        this.punto1 = punto1;
    }

    public Punto2D getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto2D punto2) {
        this.punto2 = punto2;
    }

    public Punto2D getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto2D punto3) {
        this.punto3 = punto3;
    }

    @Override
    public double calculateArea() {
        // Cálculo del área del triángulo
        double base = punto2.getX() - punto1.getX();
        double altura = Math.abs(punto3.getY() - punto1.getY());
        return (base * altura) / 2.0;
    }

    @Override
    public double calculatePerimeter() {
        // Cálculo del perímetro del triángulo
        double lado1 = Math.sqrt(Math.pow(punto2.getX() - punto1.getX(), 2) + Math.pow(punto2.getY() - punto1.getY(), 2));
        double lado2 = Math.sqrt(Math.pow(punto3.getX() - punto2.getX(), 2) + Math.pow(punto3.getY() - punto2.getY(), 2));
        double lado3 = Math.sqrt(Math.pow(punto1.getX() - punto3.getX(), 2) + Math.pow(punto1.getY() - punto3.getY(), 2));
        return lado1 + lado2 + lado3;
    }
}
