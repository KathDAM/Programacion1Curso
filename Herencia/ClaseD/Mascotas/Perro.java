package Herencia.ClaseD.Mascotas;

public class Perro extends Mascota {
    
    //ATRIBUTOS
    protected static boolean pulgas;
    protected static int edad;
   
    //CONSTRUCTOR (es lo unico que no heredan de la clase padre)
    public Perro(boolean pulgas) {
        super(pulgas);
     
    }

    //MÉTODO
    public void habla(){
        System.out.println(" Guau Guau ");
    }

    public String toString(){
        return "Perro [nombre=" + nombre + ", edad=" + edad + ", pulgas=" + pulgas + "]";
    }

}
