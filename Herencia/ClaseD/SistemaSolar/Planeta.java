//Catherine Alventosa Manyewu
package Herencia.ClaseD.SistemaSolar;

import java.util.ArrayList;


public class Planeta extends Astro {

    //ATRIBUTOS
    private double distanciaSol;
    private ArrayList<Satelite> satelites;

    //CONSTRUCTOR
    public Planeta(String nombre, double masa, double temperaturaMedia, double distanciaSol) {
        super(nombre, masa, temperaturaMedia);
        this.distanciaSol = distanciaSol;
        this.satelites = new ArrayList<>();
    }

    //GETTER,SETTER
    public double getDistanciaSol() {
        return distanciaSol;
    }

    public ArrayList<Satelite> getSatelites() {
        return satelites;
    }

    //MÉTODO
    public void agregarSatelite(Satelite satelite) {
        satelites.add(satelite);
    }

    public void eliminarSatelite(Satelite satelite) {
        satelites.remove(satelite);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Planeta: " + getNombre());
        System.out.println("Masa: " + getMasa());
        System.out.println("Temperatura Media: " + getTemperaturaMedia());
        System.out.println("Distancia al Sol: " + distanciaSol);
        System.out.println("Satélites:");
        for (Satelite satelite : satelites) {
             satelite.mostrarInformacion(); //o se puede asi tambien: System.out.println("- " + satelite.getNombre());
        }
    }
}


