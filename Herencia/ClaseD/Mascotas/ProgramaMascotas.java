package Herencia.ClaseD.Mascotas;

import java.util.ArrayList;

public class ProgramaMascotas {

    public static void main(String[] args) {
        ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
        mascotas.add(new Perro(false)); 
        mascotas.add(new Gato(null)); 
        mascotas.add(new Canario(true));

        for (Mascota f: mascotas){
            System.out.println("Mascota: " + f.toString());
            f.cumpleaños();
            f.habla();
        }
    }  
}



