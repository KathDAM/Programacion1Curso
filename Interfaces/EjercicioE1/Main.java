package Interfaces.EjercicioE1;

public class Main {
    
    public static void main(String[] args) {
  
        VectorInt vector1 = new VectorInt(5);
        vector1.random(0, 5);
        System.out.println(vector1.toString());
        System.out.println( "Mínimo: " + vector1.getMinimo());
        System.out.println( "Máximo: " + vector1.getMaximo());
        System.out.println( "Media: " + vector1.getMedia());
        System.out.println( "Mediana: " + vector1.getMediana());
        System.out.println( "Moda: " + vector1.getModa());
    
        System.out.println();

        VectorInt vector2 = new VectorInt(3);
        vector2.random(-20, 20);
        System.out.println(vector2);
        System.out.println("¿Es igual? " + vector1.esIgual(vector2.getVector()));
        //System.out.println("¿Es mayor? " + vector1.esMayor(vector2.getVector()));
        System.out.println("¿Es menor? " + vector1.esMenor(vector2.getVector()));

    }
}
