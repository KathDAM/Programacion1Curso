//Catherine Alventosa Manyewu
package Herencia.ClaseD.SistemaSolar;

public abstract class Astro {
   
    //ATRIBUTOS
    private String nombre;
    private double masa;
    private double temperaturaMedia;

    //CONSTRUCTOR
    public Astro(String nombre, double masa, double temperaturaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
    }

    //GETTER,SETTER
    public String getNombre() {
        return nombre;
    }

    public double getMasa() {
        return masa;
    }

    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }

    //MÉTODO
    public abstract void mostrarInformacion();
}
 




