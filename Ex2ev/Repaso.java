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

    public static int[] impares(int[] v) {
        int[] res = new int[v.length / 2];
        int cont = 0;
    
        for (int i = 0; i < v.length; i++) {
            if (i % 2 != 0) {
                res[cont] = v[i];
                cont++;
            }
        }
    
        return res;
    }
    
    //4.Función int[] vectorRango(int[]v, int min,int max) que devuelve un nuevo vector formado por todos los números de v cuyo valor este comprendido entre min y max.

    public static int[] vectorRango(int[]v, int min,int max) {
        int[] res = new int[v.length / 2];
        int cont = 0;
    
        for (int i = 0; i < v.length; i++) {
            if (i % 2 != 0) {
                res[cont] = v[i];
                cont++;
            }
        }
    
        return res;
    }



    //5.Función void invertir (int[]v) que invierte v
    public static void invertir(int[] v) {
        int i = 0;
        int j = v.length - 1;
    
        while (i < j) {
            int cambio = v[i];
            v[i] = v[j];
            v[j] = cambio;
            i++;
            j--;
        }
    }
    

    //6.Función eliminar(...) que recibe como parámetros un vector de enteros (v) y una posición (p) y elimina la posición p de v desplazando los elementos a la derecha una posición a la izquierda.


    //7.Función verificarFecha(...) que recibe como parametro un String s y devuelve "true" si s es una fecha válida con formato dia/mes/año. Supón que todos los meses tienen 30 días.


    //8.Función generaCodigo(...) que recibe como parámetro un String s y devuelve un String formado por la concatenación de la primera letra de cadsa palabra y el número de letras de dicha palabra.

    //9. Función void sumasDeFilas(int[][] m) que imprime por pantalla la suma de valores de cada fila. 
    
    //10.Función void sumasDeColumnas(int[][] m) que imprime por pantalla la suma de valores de cada columna.

    //11. Función boolean compruebaSudoku3(int[][] m) que recibirá como parámetro una matriz de tamaño 3x3, y devolverá ‘true’ si m es un sudoku3. Es decir, si las filas y columnas solo contienen los valores 1,2,3 y dentro de cada fila y columna no se repite ningún valor.
   
    public static boolean compruebaSudoku3(int[][] m) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            boolean[] fila = new boolean[4]; 
            for (int j = 0; j < 3; j++) {
                int valor = m[i][j];
                if (valor < 1 || valor > 3 || fila[valor]) {
                    return false; // repetido en la fila
                }
                fila[valor] = true;
            }
        }
        return true;
    
    }
    


    
}












