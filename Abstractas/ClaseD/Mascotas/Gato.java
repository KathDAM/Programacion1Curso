package Abstractas.ClaseD.Mascotas;


public class Gato extends Mascota{
    
    //ATRIBUTOS
    protected String color;
    protected int edad;
    
    //CONSTRUCTOR (es lo unico que no heredan de la clase padre)
    public Gato(String color) {
        super(color);
    }

    //MÉTODO
    public void habla(){
        System.out.println(" Miau Miau ");
    }

    public String toString(){
        return "Gato [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
    }

}
