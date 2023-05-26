//Catherine Alventosa Manyewu
package Herencia.ClaseD.SistemaSolar;

public class Astro {
   
    //ATRIBUTOS
    protected string nombre;
    protected double masa;
    protected 
   
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
