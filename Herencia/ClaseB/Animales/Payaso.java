package Herencia.ClaseB.Animales;

public class Payaso extends Pez {
    
    //ATRIBUTOS
    protected String sonido;
    
    //CONSTRUCTOR
    public Payaso(String sonido) {
       this.sonido = sonido;
    }

    //MÉTODO
    public String() { /* No se pone nada entre parentesis porque lo heredan de la Clasepadre */
        System.out.println("chorprecha");
        return sonido;   
    }   
}
