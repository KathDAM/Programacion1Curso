package Repaso3Ev.Ej3;

public class RectanguloTester {
    public static void main(String[] args) {
        Punto punto1 = new Punto(3.0,2.0);
        Punto punto2 = new Punto(0, 0);

        Rectangulo rectangulo = new Rectangulo(punto1, punto2);

        System.out.println("Rectangulo: " + rectangulo);
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());
    }
}

