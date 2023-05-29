package Abstractas.ClaseD.Figuras;

public class Rectangulo extends Figura{

    double base,altura;

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        double areaRec = base*altura;
        return areaRec;
        
    }
    
}
