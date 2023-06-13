package Repaso3Ev.Polimorfismo.A;

public abstract class Figura {
     private final String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Tipo: " + tipo + ", Área: " + calculateArea() + ", Perímetro: " + calculatePerimeter();
    }
}

