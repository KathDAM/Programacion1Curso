//Catherine AMç
package Ex2ev;
import java.util.Scanner;

import java.util.Arrays;

public class Repaso {
    //ATRIBUTOS
    int[] v;
    Scanner scanner = new Scanner(System.in);

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

//-----------------------------------------------------------------------------------------

    //2.Función boolean iguales (int[]a,int[]b) que devuelve "true" si a y b son identicos

    public static boolean iguales(int[] a, int[] b) {
        
        if (Arrays.equals(a,b)){
            return true;
        } else {
            return false;
        }
    }

//-----------------------------------------------------------------------------------------

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
 
//-----------------------------------------------------------------------------------------

    //4.Función int[] vectorRango(int[]v, int min,int max) que devuelve un nuevo vector formado por todos los números de v cuyo valor este comprendido entre min y max.

    public static int[] vectorRango(int[]v, int min,int max) {
        int cont = 0;
        for (int i = 0; i < v.length; i++) { // recorre v
            if (v[i] >= min && v[i] <= max) { //verifica si el elemento actual v[i] está dentro del rango especificado por min y max
                cont++; //incremento en 1
            }
        }
    
        int[] res = new int[cont]; //alamcena los elementros dentro del rango en un nuevo vecto
        int pos = 0; //uso de control de la posicion de res
        for (int i = 0; i < v.length; i++) { // se recorre de nuevo el arreglo v
            if (v[i] >= min && v[i] <= max) { // se verifica que el nuevo vector esta dentro de rango
                res[pos] = v[i]; //si esta en rango, se asigna el vector a res en la posicion pos
                pos++;
            }
        }
    
        return res;
    }

//-----------------------------------------------------------------------------------------

    //5.Función void invertir (int[]v) que invierte v
    public static void invertir(int[] v) {
        int i = 0; // representa el índice inicial del arreglo v.
        int j = v.length - 1; // representa el índice final del arreglo v
    
        while (i < j) {
            int cambio = v[i]; //Se guarda el valor del elemento en la posición i en la variable cambio.
            v[i] = v[j]; //Se asigna el valor del elemento en la posición j al elemento en la posición i, lo que realiza el intercambio.
            v[j] = cambio; // Se asigna el valor almacenado en cambio al elemento en la posición j, completando el intercambio.
            i++; //avanza elemento a la derecha
            j--; // avanza a la izquierda
        }
//tambien una de estas opciones:
        /*public static void invertir(int[] v) {
            int n = v.length; // la longitud del vector
            for (int i = 0; i < n / 2; i++) { // se ejecuta desde i = 0 hasta n / 2 - 1. Esto garantiza que solo se invierta la mitad de los elementos del arreglo
                int temp = v[i]; //almacena el valor para realizar el intercambio
                v[i] = v[n - 1 - i]; //realiza el intercambio, moviendo el elemento del final al comienzo del arreglo.
                v[n - 1 - i] = temp; //completa el intercambio, moviendo el elemento del comienzo al final del arreglo.
            }
        }
 */
        /*import java.util.Collections;

        public static void invertir(int[] v) {
            List<Integer> lista = Arrays.asList(v);
            Collections.reverse(lista);
            for (int i = 0; i < v.length; i++) {
                v[i] = lista.get(i);
            }
        }
 */
    }
    
//-----------------------------------------------------------------------------------------

    //6.Función eliminar(...) que recibe como parámetros un vector de enteros (v) y una posición (p) y elimina la posición p de v desplazando los elementos a la derecha una posición a la izquierda.
    public static int[] eliminar(int[] v, int pos) {
        int cont = 0;
        int[] res = new int[v.length - 1]; //se debe a que el elemento en la posición pos se eliminará del arreglo original v
        for (int i = pos; i < v.length - 1 ; i++) { //asegura que se desplace cada elemento hacia la izquierda, sobrescribiendo
            v[i] = v[i + 1]; //desplaza los elementos a la izquierda en una posición.
            if (i != pos) { //se verifica si el índice actual i es diferente de la posición pos 
                res[cont] = v[i];
                cont++;
            }
        }

        v[v.length - 1] = 12; // Opcional: Asignar 0 al último elemento después del desplazamiento
        return res;
    }

    /*  otra forma
    public static void eliminar(int[] v, int p) {
        for (int i = p; i < v.length - 1; i++) {
            v[i] = v[i + 1];
        }
        v[v.length - 1] = 0;
    }
 */

 //-----------------------------------------------------------------------------------------

    //7.Función verificarFecha(...) que recibe como parametro un String s y devuelve "true" si s es una fecha válida con formato dia/mes/año. Supón que todos los meses tienen 30 días.
    public static boolean verificarFecha(String s) {
    /*   public static boolean verificarFecha(String s) {
    int firstSlashIndex = s.indexOf('/');
    int lastSlashIndex = s.lastIndexOf('/');
    
    if (firstSlashIndex == -1 || firstSlashIndex == lastSlashIndex) {
        return false;
    }
    
    String diaStr = s.substring(0, firstSlashIndex);
    String mesStr = s.substring(firstSlashIndex + 1, lastSlashIndex);
    String anioStr = s.substring(lastSlashIndex + 1);
    
    int dia = Integer.parseInt(diaStr);
    int mes = Integer.parseInt(mesStr);
    int anio = Integer.parseInt(anioStr);
    
    return dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && anio >= 0;
}
*/
        String[] fragm = s.split("/"); //divide la cadena s en subcadenas más pequeñas utilizando el carácter "/" como delimitador
        if (fragm.length != 3) {
            return false;
        }
        
        int dia = Integer.parseInt(fragm[0]);
        int mes = Integer.parseInt(fragm[1]);
        int anyo = Integer.parseInt(fragm[2]);
        
        // return dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && anyo >= 0;
        if (dia < 1 || dia > 30 || mes < 1 || mes > 12 || anyo < 0) {
            return false;
        }
        
        return true;
    }

//-----------------------------------------------------------------------------------------

    //8.Función generaCodigo(...) que recibe como parámetro un String s y devuelve un String formado por la concatenación de la primera letra de cada palabra y el número de letras de dicha palabra.
    public static String generaCodigo(String s) {
        String res = "";
        String[] palabras = s.split(" ");
    
        for (String palabra : palabras) {
            res += palabra.charAt(0); // Concatenar la primera letra de la palabra
    
            int numeroLetras = palabra.length(); // Obtener el número de letras de la palabra
            res += numeroLetras; // Concatenar el número de letras de la palabra
        }
    
        return res;
    }

    // con esta opcion cuenta solo la primera palabra y muestra el mismo num en todas
   /*  public static String generaCodigo(String s) {
        String res = "";
        int contador = 0;
        String[] palabra = s.split(" ");
        
        //Recorre array palabra por palabra
        for (int i = 0; i < palabra.length; i++) {
            res += palabra[i].charAt(0);
            //recorre la palabra de la posicion i
            for (int j = 0; j < palabra.length; j++) {
                contador++;
            }
            res += Integer.toString(contador);
            contador = 0;
        }
        return res;
    } */

//-----------------------------------------------------------------------------------------

    //9. Función void sumasDeFilas(int[][] m) que imprime por pantalla la suma de valores de cada fila. 

    public static void sumasDeFilas(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < m[i].length; j++) {
                suma += m[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + suma);
        }
    }
    
//-----------------------------------------------------------------------------------------

    //10.Función void sumasDeColumnas(int[][] m) que imprime por pantalla la suma de valores de cada columna.
    public static void sumasDeColumnas(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;

        for (int j = 0; j < columnas; j++) {
            int suma = 0;
            for (int i = 0; i < filas; i++) {
                suma += m[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + suma);
        }
    }

//-----------------------------------------------------------------------------------------

    //11. Función boolean compruebaSudoku3(int[][] m) que recibirá como parámetro una matriz de tamaño 3x3, y devolverá ‘true’ si m es un sudoku3. Es decir, si las filas y columnas solo contienen los valores 1,2,3 y dentro de cada fila y columna no se repite ningún valor.
   
    public static boolean compruebaSudoku3(int[][] m) {
        // Verificar filas
        for (int i = 0; i < 3; i++) {
            boolean[] numeros = new boolean[4];
            for (int j = 0; j < 3; j++) {
                int valor = m[i][j];
                if (valor < 1 || valor > 3 || numeros[valor]) {
                    return false;
                }
                numeros[valor] = true;
            }
        }
        
        // Verificar columnas
        for (int j = 0; j < 3; j++) {
            boolean[] numeros = new boolean[4];
            for (int i = 0; i < 3; i++) {
                int valor = m[i][j];
                if (valor < 1 || valor > 3 || numeros[valor]) {
                    return false;
                }
                numeros[valor] = true;
            }
        }
        
        return true;
    }
    
//-----------------------------------------------------------------------------------------
/* EXTRA EXB: Necesitamos un programa en lenguaje Java que cree una matriz de tamaño F x C (valores
introducidos por teclado) y la rellene con números enteros aleatorios entre 1 y 20. Luego pedirá
por teclado un número N y mostrará por pantalla, para cada fila, la suma de los valores que son
múltiplos de N.
 */
    public static void matrizExB() {

        Scanner scanner = new Scanner(System.in);

        // Ingreso de tamaño de la matriz
        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        // Creación de la matriz y relleno con números aleatorios
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 20) + 1;
            }
        }

        // Ingreso del número N
        System.out.print("Ingrese un número: ");
        int numeroN = scanner.nextInt();

        // Calcular la suma de los valores múltiplos de N para cada fila
        for (int i = 0; i < filas; i++) {
            int suma = 0;
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] % numeroN == 0) {
                    suma += matriz[i][j];
                }
            }
            System.out.println("Suma de múltiplos de " + numeroN + " en la fila " + (i + 1) + ": " + suma);
        }
    }

    //-----------------------------------------------------------------------------------------
    /* EXTRA EXA: Haz un programa que cree una matriz de tamaño F x C (valores introducidos por teclado) y la
    rellene con números enteros aleatorios entre -5 y 5. Luego calculará y mostrará por pantalla la
    suma de valores de cada fila, de cada columna y de toda la matriz.*/

    public static void matrizExA(){

            Scanner scanner = new Scanner(System.in);
    
            // Ingreso de tamaño de la matriz
            System.out.print("Ingrese el número de filas: ");
            int filas = scanner.nextInt();
            System.out.print("Ingrese el número de columnas: ");
            int columnas = scanner.nextInt();
    
            // Creación de la matriz y relleno con números aleatorios entre -5 y 5
            int[][] matriz = new int[filas][columnas];
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    matriz[i][j] = (int) (Math.random() * 11) - 5;
                }
            }
    
            // Mostrar la matriz
            System.out.println("Matriz generada:");
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println();
            }
    
            // Calcular la suma de cada fila
            System.out.println("\nSuma de cada fila:");
            for (int i = 0; i < filas; i++) {
                int sumaFila = 0;
                for (int j = 0; j < columnas; j++) {
                    sumaFila += matriz[i][j];
                }
                System.out.println("Fila " + (i + 1) + ": " + sumaFila);
            }
    
            // Calcular la suma de cada columna
            System.out.println("\nSuma de cada columna:");
            for (int j = 0; j < columnas; j++) {
                int sumaColumna = 0;
                for (int i = 0; i < filas; i++) {
                    sumaColumna += matriz[i][j];
                }
                System.out.println("Columna " + (j + 1) + ": " + sumaColumna);
            }
    
            // Calcular la suma de toda la matriz
            int sumaTotal = 0;
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    sumaTotal += matriz[i][j];
                }
            }
            System.out.println("\nSuma total de la matriz: " + sumaTotal);
        }
    }
    









    













