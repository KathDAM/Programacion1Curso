package Abstractas.ClaseD.Mascotas;


public class Canario extends Mascota{

    //ATRIBUTOS
    protected boolean volando;
    protected int edad;
   
    //CONSTRUCTOR (es lo unico que no heredan de la clase padre)
    public Canario(boolean volando) {
       super(volando);
    }
 

    //MÉTODO
    public void habla(){
        System.out.println(" Pio Pio ");
    }

    public String toString(){
        return "Canario [nombre=" + nombre + ", edad=" + edad + ", volando=" + volando + "]";
    }
    public void cumpleaños(){
        edad = edad + 2;
    }


}


