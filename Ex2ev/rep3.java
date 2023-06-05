//Catherine AM
package Ex2ev;

//3.Función int[] impares (int[] v) que devuelve un nuevo vector que contiene solo los números en posiciones impares de v
public class rep3 {
    //ATRIBUTOS
    int[] v;
    int impares;

    //MÉTODO
    public int[] impares (int[] v) {
        for (int i = 0; i < v.length; i++) {
            if ( i % 2 == 0 ){
                impares = v[i];
            } 
        }
        return v;
    }
}
