//Catherine Alventosa Manyewu
package Herencia.ClaseD.SistemaSolar;

import java.util.ArrayList;

public class SistemaSolar {

    //ATRIBUTOS
    private ArrayList<Planeta> planetas;
    private String nombre;

    //CONSTRUCTOR
    public SistemaSolar(String nombre) {
        this.nombre = nombre;
        this.planetas = new ArrayList<>();
    }

    //MÉTODO
    public void agregarPlaneta(Planeta planeta) {
        planetas.add(planeta);
    }

    public void eliminarPlaneta(Planeta planeta) {
        planetas.remove(planeta);
    }
    
    public void mostrarInformacion() {
        System.out.println("Sistema Solar: " + nombre);
        System.out.println("------------------------------");
        System.out.println("Planetas:");
        for (Planeta planeta : planetas) {
            planeta.mostrarInformacion();
            System.out.println();
        }
    }
}

