package Repaso3Ev.Ej2A;

public class Main {
    public static void main(String[] args) {
        Puntobidimensional p1 = new Puntobidimensional(1.0, 1.0);
        System.out.println("p1: " + p1.toString());
        System.out.println("p1: " + p1.toStringPolar());

        p1 = new Puntobidimensional(1.0, 1.0);
        System.out.println("p1: " + p1.toString());
        System.out.println("p1: " + p1.toStringPolar());

        p1 = new Puntobidimensional(0.0, 1.0);
        System.out.println("p1: " + p1.toString());
        System.out.println("p1: " + p1.toStringPolar());

        p1 = new Puntobidimensional(-1.0, 1.0);
        System.out.println("p1: " + p1.toString());
        System.out.println("p1: " + p1.toStringPolar());

        p1 = new Puntobidimensional(-1.0, 0.0);
        System.out.println("p1: " + p1.toString());
        System.out.println("p1: " + p1.toStringPolar());

        p1 = new Puntobidimensional(-1.0, -1.0);
        System.out.println("p1: " + p1.toString());
        System.out.println("p1: " + p1.toStringPolar());

        p1 = new Puntobidimensional(0.0, -1.0);
        System.out.println("p1: " + p1.toString());
        System.out.println("p1: " + p1.toStringPolar());

        p1 = new Puntobidimensional(1.0, -1.0);
        System.out.println("p1: " + p1.toString());
        System.out.println("p1: " + p1.toStringPolar());}
}
