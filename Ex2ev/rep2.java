//Catherine AM
package Ex2ev;

import java.util.Arrays;

//2.Función boolean iguales (int[]a,int[]b) que devuelve "true" si a y b son identicos
public class rep2 {
    
    //ATRIBUTOS
    int[] a, b;

    //MÉTODO
    public boolean iguales(int[] a, int[] b) {
        
        if (Arrays.equals(a,b)){
            return true;
        } else {
            return false;
        }
    }
}
