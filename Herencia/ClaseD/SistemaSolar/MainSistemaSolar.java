//Catherine Alventosa Manyewu
package Herencia.ClaseD.SistemaSolar;

public class MainSistemaSolar {
    public static void main(String[] args) {
        // CREAR SISTEMA SOLAR
        SistemaSolar sistemaSolar = new SistemaSolar("La Vía Lactea");

        // CREAR PLANETAS
        Planeta Tierra = new Planeta("Tierra", 5.97, 14.6, 149.6);
        Planeta Júpiter = new Planeta("Júpiter", 0.64171, -46, 227.9);

        // CREAR SATÉLITES
        Satelite Luna = new Satelite("Luna", 0.07342, -39.2, 384.4);
        Satelite Calisto = new Satelite("Calisto", 0.000015, -90.2, 9377);
        Satelite Titán = new Satelite("Titán", 0.000002, -75.1, 23458);

        // AGREGAR SATÉLITES A LOS PLANETAS
        Tierra.agregarSatelite(Luna);
        Júpiter.agregarSatelite(Calisto);
        Júpiter.agregarSatelite(Titán);

        // AGREGAR PLANETAS AL SISTEMA SOLAR
        sistemaSolar.agregarPlaneta(Tierra);
        sistemaSolar.agregarPlaneta(Júpiter);

         // MOSTRAR INFORMACIÓN DEL SISTEMA SOLAR
        sistemaSolar.mostrarInformacion();
    }
}

