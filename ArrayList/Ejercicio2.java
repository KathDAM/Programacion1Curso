/*Ejercicio 2. ArrayList de notas */
package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args) {

    ArrayList<Integer> notas = new ArrayList();
    int not;
    Scanner lect = new Scanner(System.in);

    public void imprimirNotas (not){
        
        not = lect.nextInt();

        System.out.println("LISTADO NOTAS(para pararlo añadir -1)");
        for(int i = 0; i <= 10; i++) {
            if (i == -1) {
                System.out.println("Finalizado introducción de notas");
            } else {
                System.out.println("Numero: " + i + " Nota: " + notas.get(i));
            }
        ++i; 
        }
    }
    }
}
