//Catherine AMç
package Ex2ev;

import java.util.Arrays;

//1.Función int mediana (int [] v) que devuelve la mediana de v
public class rep1 {
    //ATRIBUTOS
    int[] v;
    
    //MÉTODO
    public int mediana(int[] v) {
        Arrays.sort(v);
        int mediana = v.length / 2;
        if (v.length % 2 == 0) {
            return (v[mediana - 1] + v[mediana]) / 2;
        } else {
            return v[mediana];
        }
    }

  /*  public static void main(String[] args) {
        rep1 v = new rep1();
        System.out.println(v.toString());

    } */ 
}

