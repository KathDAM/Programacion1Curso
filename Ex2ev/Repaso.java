//Catherine AMç
package Ex2ev;

import java.util.Arrays;

public class Repaso {
    //ATRIBUTOS
    int[] v;
    
    //MÉTODO

    //1.Función int mediana (int [] v) que devuelve la mediana de v

    public static int mediana(int[] v) {
        Arrays.sort(v);
        int mediana = v.length / 2;
        if (v.length % 2 == 0) {
            return (v[mediana - 1] + v[mediana]) / 2;
        } else {
            return v[mediana];
        }
    }

    //2.Función boolean iguales (int[]a,int[]b) que devuelve "true" si a y b son identicos

        public static boolean iguales(int[] a, int[] b) {
            
            if (Arrays.equals(a,b)){
                return true;
            } else {
                return false;
            }
        }

    //3.Función int[] impares (int[] v) que devuelve un nuevo vector que contiene solo los números en posiciones impares de v

        public static int[] impares (int[] v) {

            int [] res = new int[v.length/2];

            for (int i = 0; i < v.length; i++) {
                if ( i % 2 != 0 ){
                    int res = v[i];
                } 
            }
            return res;
        }


    //4.Función int[] vectorRango(int[]v, int min,int max) que devuelve un nuevo vector formado por todos los números de v cuyo valor este comprendido entre min y max.


    //5.Función void invertir (int[]v) que invierte v


    //6.Función eliminar(...) que recibe como parámetros un vector de enteros (v) y una posición (p) y elimina la posición p de v desplazando los elementos a la derecha una posición a la izquierda.


    //7.Función verificarFecha(...) que recibe como parametro un String s y devuelve "true" si s es una fecha válida con formato dia/mes/año. Supón que todos los meses tienen 30 días.


    //Función generaCodigo(...) que recibe como parámetro un String s y devuelve un String formado por la concatenación de la primera letra de cadsa palabra y el número de letras de dicha palabra.

    
}












