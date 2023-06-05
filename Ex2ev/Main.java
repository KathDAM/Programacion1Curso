package Ex2ev;

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
        int[] v3 = {1,2,3,4,5};
        int[] res3 = Repaso.impares(v3);
        System.out.println("Ejercicio 3: " + res3);
      
    }
 
}
