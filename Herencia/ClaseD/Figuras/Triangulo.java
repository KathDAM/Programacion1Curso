package Herencia.ClaseD.Figuras;

public class Triangulo extends Figura{
    //ATRIBUTOS
    protected double base;
    protected double altura;

     //CONSTRUCTOR (es lo unico que no heredan de la clase padre)
    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }
    
     //GET,SET
     public double getAltura() {
         return altura;
     }
     public double getBase() {
         return base;
     }

     public void setAltura(double altura) {
         this.altura = altura;
     }
     public void setBase(double base) {
         this.base = base;
     }

     //MÉTODO
      public double area() { /* No se pone nada entre parentesis porque lo heredan de la Clasepadre */
        double areaTri = (base * altura)/2;
        return areaTri;
        
    }

}
