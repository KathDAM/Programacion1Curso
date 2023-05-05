/*Ejercicio 3. ArrayList de precios */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {

    static Scanner lect = new Scanner(System.in);
    static ArrayList<Double> precios = new ArrayList();
    static ArrayList<Double> preciosBaratos = new ArrayList();
    static ArrayList<Double> preciosCaros = new ArrayList();
    static double i;
    public static void main(String[]args) {
 
        imprimirNotas();
    }

    public static void imprimirNotas (){

        System.out.println(" ----------- LISTADO PRECIOS ----------- ");
        System.out.println("(para parar BUCLE añadir numero negativo)");
        double precus = lect.nextDouble();   

        if (precus>0) {
            precios.add(precus);
            System.out.println("Precio añadido " + precus);

        } else {
            System.out.println(" ----------- FIN LISTADO PRECIOS ----------- ");
            System.out.println("LISTADO PRECIOS: " + precios);
        
        }
        
    }

    /*Crear dos nuevos ArrayLists para precios de productos. El primero se usará para los
productos baratos (precio menor de 100 euros) y el segundo para los productos
caros (precio de 100 euros o superior). */

    public static double preBaratos() {
        
        if (i = 0, i<100,i++) {
            preciosBaratos(i);
        }
    }

    public static double preCaros() {
        
        if (i = 0, i>100,i++) {
            preciosCaros(i);
        }
    }



}




