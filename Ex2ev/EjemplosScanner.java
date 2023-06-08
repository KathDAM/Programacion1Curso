package Ex2ev;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EjemplosScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del vector: ");
        int longitud = scanner.nextInt();

        int[] v = new int[longitud];

        // Solicitar al usuario ingresar los valores del vector
        for (int i = 0; i < longitud; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            v[i] = scanner.nextInt();
        }

        // Obtener la última posición y el último elemento del vector
        int ultimaPosicion = v.length - 1;
        int ultimoElemento = v[ultimaPosicion];

        System.out.println("Última posición: " + ultimoElemento + " " + Arrays.toString(v));

        scanner.close();
    }
}


