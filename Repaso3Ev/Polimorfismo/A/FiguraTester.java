package Repaso3Ev.Polimorfismo.A;

public class FiguraTester {
     public static void main(String[] args) {
        Punto2D punto1 = new Punto2D(0, 0);
        Punto2D punto2 = new Punto2D(3, 0);
        Punto2D punto3 = new Punto2D(0, 4);

        Triangul triangulo = new Triangul(punto1, punto2, punto3);
        System.out.println(triangulo);

        Punto2D centro = new Punto2D(0, 0);
        double radio = 5;

        Circulo circulo = new Circulo(centro, radio);
        System.out.println(circulo);

        Punto2D punto4 = new Punto2D(0, 0);
        Punto2D punto5 = new Punto2D(2, 2);

        Rectangulo rectangulo = new Rectangulo(punto4, punto5);
        System.out.println(rectangulo);
    }
}

/**Segundo tester
 * 
 * public class FiguraArrayTester {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        figuras[0] = new Triangulo(new Punto2D(0, 0), new Punto2D(3, 0), new Punto2D(0, 4));
        figuras[1] = new Circulo(new Punto2D(0, 0), 5);
        figuras[2] = new Rectangulo(new Punto2D(0, 0), new Punto2D(2, 2));
        figuras[3] = new Circulo(new Punto2D(2, 2), 3);
        figuras[4] = new Triangulo(new Punto2D(1, 1), new Punto2D(5, 1), new Punto2D(3, 4));

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura " + i + ": " + figuras[i]);
            System.out.println("Área: " + figuras[i].calculateArea());
            System.out.println("Perímetro: " + figuras[i].calculatePerimeter());

            if (figuras[i] instanceof Circulo) {
                System.out.println("Es una instancia de Circulo");
            }

            if (figuras[i] instanceof Figura) {
                System.out.println("Es una instancia de Figura");
            }

            System.out.println("Nombre de la clase: " + figuras[i].getClass().getSimpleName());

            if (figuras[i] instanceof Triangulo) {
                Triangulo triangulo = (Triangulo) figuras[i];
                double lado1 = Math.sqrt(Math.pow(triangulo.getPunto2().getX() - triangulo.getPunto1().getX(), 2) +
                        Math.pow(triangulo.getPunto2().getY() - triangulo.getPunto1().getY(), 2));
                double lado2 = Math.sqrt(Math.pow(triangulo.getPunto3().getX() - triangulo.getPunto2().getX(), 2) +
                        Math.pow(triangulo.getPunto3().getY() - triangulo.getPunto2().getY(), 2));
                double lado3 = Math.sqrt(Math.pow(triangulo.getPunto1().getX() - triangulo.getPunto3().getX(), 2) +
                        Math.pow(triangulo.getPunto1().getY() - triangulo.getPunto3().getY(), 2));
                System.out.println("Distancia punto1-punto2: " + lado1);
                System.out.println("Distancia punto2-punto3: " + lado2);
                System.out.println("Distancia punto3-punto1: " + lado3);
            }

            System.out.println();
        }
    }
}

 */