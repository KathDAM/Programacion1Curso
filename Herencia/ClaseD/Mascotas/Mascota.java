package Herencia.ClaseD.Mascotas;

public abstract class Mascota extends ProgramaMascotas {

    //ATRIBUTOS
    protected static String nombre;
    protected int edad;
   
    //CONSTRUCTOR (es lo unico que no heredan de la clase padre)
    public Mascota(String nombre, int edad) {
        super();
    }

    //MÉTODO
    public abstract String toString();
    
    public abstract void habla();

    public void cumpleaños(){ //tambien se puede realizar poniendo el metodo en abstracto, si en cada clase hacemos cambios diferentes en cada uno.
        edad = edad + 1 ;
    }

}


