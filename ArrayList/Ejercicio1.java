/*Ejercicio 1. ArrayList de colores*/
package ArrayList;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[]args) {
    /*1.Crear un ArrayList de cadenas de texto (String). */
        ArrayList<String> colores = new ArrayList();

    /*2.Añadir varios String con diferentes colores (Rojo, Azul, Verde, Naranja y Blanco). */
        colores.add("Rojo");
        colores.add("Azul");
        colores.add("Verde");
        colores.add("Naranja");
        colores.add("Blanco");

    /*3.Recorrer/iterar el ArrayList y mostrar por pantalla todos los colores. */
        imprimirAL(colores);
    
    /*4.Añadir dos colores más al final de la lista (Negro y Cyan). */
        colores.add("Negro");
        colores.add("Cyan");

    /*5. Añadir dos colores más en la 1ª y 2ª posición (Amarillo y Magenta). */
        colores.add(0,"Amarillo");
        colores.add(1,"Magenta");
        imprimirAL(colores);

    /*6.Eliminar los colores de la 3ª y 4ª posición (Rojo y Azul). */
        colores.remove(3);
        colores.remove(4);

    /*7.Volver a mostrar todos los colores por pantalla. */
        imprimirAL(colores);

       /* colores.clear(); //para eliminar dentro del array

        imprimirAL(colores); */ 

    }

    public static void imprimirAL(ArrayList<String> al) {
        System.out.println("LISTA COLORES");
        for(int i = 0; i < al.size(); i++) {
            System.out.println("Posicion : " + i + " Item: " + al.get(i));
        }
    }

}





