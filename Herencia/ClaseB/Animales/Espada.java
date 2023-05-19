package Herencia.ClaseB.Animales;

public class Espada extends Pez{
    //ATRIBUTOS
    protected String sonido;
    
    //CONSTRUCTOR
    public Espada(String sonido) {
       this.sonido = sonido;
    }

    //MÉTODO
    public String() { /* No se pone nada entre parentesis porque lo heredan de la Clasepadre */
        System.out.println("ríndete");
        return sonido;   
    }
}
