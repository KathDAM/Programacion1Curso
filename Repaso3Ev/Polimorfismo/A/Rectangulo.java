package Repaso3Ev.Polimorfismo.A;

public class Rectangulo extends Figura{
    private Punto2D punto1;
    private Punto2D punto2;

    public Rectangulo(Punto2D punto1, Punto2D punto2) {
        super("Rectangulo");
        this.punto1 = punto1;
        this.punto2 = punto2;
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

    @Override
    public double calculateArea() {
        // Cálculo del área del rectángulo
        double base = Math.abs(punto2.getX() - punto1.getX());
        double altura = Math.abs(punto2.getY() - punto1.getY());
        return base * altura;
    }

    @Override
    public double calculatePerimeter() {
        // Cálculo del perímetro del rectángulo
        double base = Math.abs(punto2.getX() - punto1.getX());
        double altura = Math.abs(punto2.getY() - punto1.getY());
        return 2 * (base + altura);
    } 
}
