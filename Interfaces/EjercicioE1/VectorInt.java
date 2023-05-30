//Catherine Alventosa Manyewu
package Interfaces.EjercicioE1;

import java.util.Arrays;

public class VectorInt implements IMinMax, IEstaticas{

    //ATRIBUTO
    private int[] vector;

    //CONSTRUCTOR
    public VectorInt(int tamaño) {
        vector = new int[tamaño];
    }

    //GET,SET
    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    @Override
    public int getMinimo() {
        int min = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
       }
        return min;
    }

    @Override
    public int getMaximo() {
        int max = vector[0];
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
       }
        return max;
    }

    //MÉTODOS

    @Override
    public String toString() {
        return Arrays.toString(vector);
    }

    public void random(int min, int max) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        Arrays.sort(vector);
    }
    

  

    @Override
    public int getModa() {
        int devuelve = 0;
        int moda = 0;
        for (int i = 0; i < vector.length; i++) { // recorremos el array primero
            for (int j = 0; j < vector.length; j++) { //recorremos el mismo array con otra variable para comparar arrays
                if (vector[i] == vector[j]) {  // == para comparar dos vectores
                   devuelve ++;
                }
                if(devuelve > moda){
                    devuelve = moda;
                    moda = vector[i];
                }
            }
        }
        return moda;
    }

    @Override
    public double getMedia() {
        double media = 0;
        for (int i = 0; i < vector.length; i++) {
            media = (media + vector[i])/2;
        }
        return media;
    }

    @Override
    public double getMediana() {
        Arrays.sort(vector);
        int mediana = vector.length / 2;
        if (vector.length % 2 == 0) {
            return (double) (vector[mediana - 1] + vector[mediana]) / 2;
        } else {
            return vector[mediana];
        }
    }

    public boolean esMayor(int[] vector2) {
        int[] vector1 = vector;

        if (vector1 > vector2) {
            return true;
        } else {
            return false;
            
        }
    }

    public boolean esMenor(int[] vector2) {
        return null;
    }

    public boolean esIgual(int[] vector2) {
        return null;
        //return thisNumber.equals(otherNumber);
    }
}
