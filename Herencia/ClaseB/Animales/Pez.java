package Herencia.ClaseB.Animales;

public class Pez extends Animal {
    
    //ATRIBUTOS
    protected String sonido;
    
    //CONSTRUCTOR
    public Pez(String sonido) {
       this.sonido = sonido;
    }

    //MÉTODO
    public String() { /* No se pone nada entre parentesis porque lo heredan de la Clasepadre */
        System.out.println("glu glu");
        return sonido;   
    }
}
