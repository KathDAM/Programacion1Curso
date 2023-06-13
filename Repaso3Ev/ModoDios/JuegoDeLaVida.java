package Repaso3Ev.ModoDios;

import java.util.Random;
import java.util.Scanner;

public class JuegoDeLaVida {

    private static final int DIM = 20; // Tamaño de la matriz
    private static final double PORCENTAGE_INICIAL = 0.3; // Porcentaje inicial de células vivas
    private static final int MAX_GENERACIONES = 100; // Número máximo de generaciones
    private static final int INTERVALO_MILISEGUNDOS = 1000; // Intervalo de tiempo entre generaciones (en milisegundos)

    private static boolean[][] matriz;

    public static void main(String[] args) {
        inicializarMatriz();
        mostrarMatriz(0);

        // Versión 1: Generación manual al presionar "Enter"
        System.out.println("Presiona Enter para generar la siguiente generación...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        int generacion = 1;
        while (generacion <= MAX_GENERACIONES && !esEstable()) {
            generarSiguienteGeneracion();
            mostrarMatriz(generacion);
            generacion++;

            System.out.println("Presiona Enter para generar la siguiente generación...");
            scanner.nextLine();
        }

        // Versión 2: Generación automática cada cierto intervalo de tiempo
//        int generacion = 1;
//        while (generacion <= MAX_GENERACIONES && !esEstable()) {
//            generarSiguienteGeneracion();
//            mostrarMatriz(generacion);
//            generacion++;
//
//            try {
//                Thread.sleep(INTERVALO_MILISEGUNDOS);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
    }

    private static void inicializarMatriz() {
        matriz = new boolean[DIM][DIM];
        Random random = new Random();

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                matriz[i][j] = random.nextDouble() < PORCENTAGE_INICIAL;
            }
        }
    }

    private static void generarSiguienteGeneracion() {
        boolean[][] nuevaMatriz = new boolean[DIM][DIM];

        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                int vecinasVivas = contarCeldasVecinasVivas(i, j);
                if (matriz[i][j]) {
                    // Célula viva
                    nuevaMatriz[i][j] = vecinasVivas == 2 || vecinasVivas == 3;
                } else {
                    // Célula muerta
                    nuevaMatriz[i][j] = vecinasVivas == 3;
                }
            }
        }

        matriz = nuevaMatriz;
    }

    private static int contarCeldasVecinasVivas(int fila, int columna) {
        int count = 0;

        for (int i = fila - 1; i <= fila + 1; i++) {
            for (int j = columna - 1; j <= columna + 1; j++) {
                if (i >= 0 && i < DIM && j >= 0 && j < DIM && !(i == fila && j == columna) && matriz[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean esEstable() {
        // Compara la matriz actual con la generación anterior
        // Si son iguales, se considera que la matriz se ha estabilizado

        // Añade código aquí para implementar la verificación de estabilidad
        return false;
    }

    private static void mostrarMatriz(int generacion) {
        int poblacion = 0;

        System.out.println("Generación: " + generacion);
        for (int i = 0; i < DIM; i++) {
            for (int j = 0; j < DIM; j++) {
                if (matriz[i][j]) {
                    System.out.print("O ");
                    poblacion++;
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }

        System.out.println("Población: " + poblacion);
        System.out.println();
    }
}
  
