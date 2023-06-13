package Repaso3Ev.Ej3;

public class Rectangulo {
    private Punto punto1;
    private Punto punto2;

    public Rectangulo(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public double calcularArea() {
        double base = Math.abs(punto2.getX() - punto1.getX());
        double altura = Math.abs(punto2.getY() - punto1.getY());
        return base * altura;
    }

    public double calcularPerimetro() {
        double base = Math.abs(punto2.getX() - punto1.getX());
        double altura = Math.abs(punto2.getY() - punto1.getY());
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectangulo[Punto1=" + punto1 + ", Punto2=" + punto2 + "]";
    }
}

/**segunda versión de la clase Rectangulo donde el área y el perímetro se implementan como atributos:
 * 
 * public class Rectangulo {
    private Punto punto1;
    private Punto punto2;
    private double area;
    private double perimetro;

    public Rectangulo(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        calcularArea();
        calcularPerimetro();
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
        calcularArea();
        calcularPerimetro();
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
        calcularArea();
        calcularPerimetro();
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    private void calcularArea() {
        double base = Math.abs(punto2.getX() - punto1.getX());
        double altura = Math.abs(punto2.getY() - punto1.getY());
        area = base * altura;
    }

    private void calcularPerimetro() {
        double base = Math.abs(punto2.getX() - punto1.getX());
        double altura = Math.abs(punto2.getY() - punto1.getY());
        perimetro = 2 * (base + altura);
    }

    @Override
    public String toString() {
        return "Rectangulo[Punto1=" + punto1 + ", Punto2=" + punto2 + "]";
    }
}

public class RectanguloTester {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2, 3);
        Punto punto2 = new Punto(5, 7);

        Rectangulo rectangulo = new Rectangulo(punto1, punto2);

        System.out.println("Rectangulo: " + rectangulo);
        System.out.println("Área: " + rectangulo.getArea());
        System.out.println("Perímetro: " + rectangulo.getPerimetro());
    }
}

 * 
 */