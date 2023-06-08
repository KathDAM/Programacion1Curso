package Ex2ev;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Ej1
        int[] v = {1,2,3,4,5};
        int res1 = Repaso.mediana(v);
        System.out.println("Ejercicio 1: " + res1);
        //Ej2
        int[] v1 = {1,2,3,4,5};
        int[] v2 = {1,2,3,7,5};
        boolean res2 = Repaso.iguales(v1,v2);
        System.out.println("Ejercicio 2: " + res2);

        //Ej3
        int[] v3 = {1,2,3,4,5,6,7,8,9};
        int[] res3 = Repaso.impares(v3);
        System.out.println("Ejercicio 3: " +  Arrays.toString(res3));
      
        //Ej4
        int min = 2;
        int max = 4;
        int[] v4 = {1,2,3,4,5,6,7,8,9};
        int[] res4 = Repaso.vectorRango(v4,min,max);
        System.out.println("Ejercicio 4: " +  Arrays.toString(res4));


        //Ej5
        int[] v5 = {1,2,3,4,5,6,7,8,9,10};
        Repaso.invertir(v5);
        System.out.println("Ejercicio 5: " +   Arrays.toString(v5));
        /* tambien se puede ver recorriendo el array:
        *    System.out.print("Ejercicio 4: ");
            for (int i = 0; i < v4.length; i++) {
                System.out.print(v4[i] + " ");
            }
        */

        //Ej6
        int[] v6 = {1,2,3,4,5,6,7,8,9,10,11};
        Repaso.eliminar(v6,4);
        System.out.println("Ejercicio 6: " +   Arrays.toString(v6));

        System.out.println(" ");

        //Ej7
        String fecha1 = "31/12/2022";
        String fecha2 = "29/02/2023";
        

        System.out.println("Ejercicio 7: ");
        System.out.println("  - Fecha 1: " + Repaso.verificarFecha(fecha1));
        System.out.println("  - Fecha 2: " + Repaso.verificarFecha(fecha2));
        
        System.out.println(" ");

        //Ej8
        String frase1 = "Hoy se gana";
        String frase2 = "Se vive como se puede";
        

        System.out.println("Ejercicio 8: ");
        System.out.println("  - Frase 1: " + Repaso.generaCodigo(frase1));
        System.out.println("  - Frase 2: " + Repaso.generaCodigo(frase2));

        System.out.println(" ");

        //Ej9
        System.out.println("Ejercicio 9: ");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Repaso.sumasDeFilas(matriz);

        System.out.println(" ");

        //Ej10
        System.out.println("Ejercicio 10: ");
        int[][] matriz2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Repaso.sumasDeColumnas(matriz2);
        System.out.println(" ");

        //Ej11
        System.out.println("Ejercicio 11: ");
        int[][] matriz3 = {
            {1, 2, 3},
            {2, 3, 1},
            {3, 1, 2}
        };
        
        boolean esSudoku3 = Repaso.compruebaSudoku3(matriz3);
        System.out.println("¿Es un sudoku3? " + esSudoku3);
        System.out.println(" ");

        //Extra1
        System.out.println("Ejercicio Extra Examen A: ");
        Repaso.matrizExA();

        //Extra2
        System.out.println("Ejercicio Extra Examen B: ");
        Repaso.matrizExB();











    }


 
}
