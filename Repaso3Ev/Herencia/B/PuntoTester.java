package Repaso3Ev.Herencia.B;

public class PuntoTester {
     public static void main(String[] args) {
        Punto punto2D = new Punto(3, 4);
        Punto3D punto3D = new Punto3D(1, 2, 3);

        System.out.println("Punto 2D: " + punto2D);
        System.out.println("Distancia al origen: " + punto2D.distanceToZero());
        System.out.println("Distancia a otro punto: " + punto2D.distance(new Punto(6, 8)));
        System.out.println("Distancia al cuadrado al origen: " + punto2D.squaredDistanceToZero());

        System.out.println();

        System.out.println("Punto 3D: " + punto3D);
        System.out.println("Distancia al origen: " + punto3D.distanceToZero());
        System.out.println("Distancia a otro punto: " + punto3D.distance(new Punto3D(4, 5, 6)));
        System.out.println("Distancia al cuadrado al origen: " + punto3D.squaredDistanceToZero());
    }
}
