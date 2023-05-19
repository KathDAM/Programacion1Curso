package Herencia.ClaseB.Animales;

public class Carpinteros extends Pajaro{

    //ATRIBUTOS
    protected String sonido;
    
    //CONSTRUCTOR
    public Carpinteros(String sonido) {
       this.sonido = sonido;
    }

    //MÉTODO
    public String() { /* No se pone nada entre parentesis porque lo heredan de la Clasepadre */
        System.out.println("picomadera");
        return sonido;   
    }
}
