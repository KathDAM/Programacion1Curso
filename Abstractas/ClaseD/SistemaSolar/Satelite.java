//Catherine Alventosa Manyewu
package Abstractas.ClaseD.SistemaSolar;

public class Satelite extends Astro{

    //ATRIBUTOS
    private double distanciaPlaneta;

    //CONSTRUCTOR
    public Satelite(String nombre, double masa, double temperaturaMedia, double distanciaPlaneta) {
        super(nombre, masa, temperaturaMedia);
        this.distanciaPlaneta = distanciaPlaneta;
    }

    //GETTER,SETTER
    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Satélite: " + getNombre());
        System.out.println("Masa: " + getMasa());
        System.out.println("Temperatura Media: " + getTemperaturaMedia());
        System.out.println("Distancia al Planeta: " + getDistanciaPlaneta());
    }
    
    
}
