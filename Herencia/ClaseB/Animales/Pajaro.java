package Herencia.ClaseB.Animales;

public class Pajaro extends Animal {

    //ATRIBUTOS
    protected String sonido;
    
    //CONSTRUCTOR
    public Pajaro(String sonido) {
       this.sonido = sonido;
    }

    //MÉTODO
    public String() { /* No se pone nada entre parentesis porque lo heredan de la Clasepadre */
       System.out.println("pio pio");
        return sonido;
        
        
    }
    
}
