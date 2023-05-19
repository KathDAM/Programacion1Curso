package Herencia.ClaseB.Animales;

public class Gallo extends Pajaro {
    
    //ATRIBUTOS
    protected String sonido;
    
    //CONSTRUCTOR
    public Gallo(String sonido) {
       this.sonido = sonido;
    }
    //MÉTODO
    public String() { /* No se pone nada entre parentesis porque lo heredan de la Clasepadre */
        System.out.println("quiquiriqui");
        return sonido;   
    } 
}
