package Herencia.ClaseD.Figuras;

public class Cuadrado  extends Figura{

    //ATRIBUTOS
    protected double lado;
   
    //CONSTRUCTOR (es lo unico que no heredan de la clase padre)
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
     //GET,SET
     public double getLado() {
         return lado;
     }
     public void setLado(double lado) {
         this.lado = lado;
     }

     //MÉTODO
      public double area() { /* No se pone nada entre parentesis porque lo heredan de la Clasepadre */
        double areaCuad = lado*lado;
        return areaCuad;
        
    }
}
