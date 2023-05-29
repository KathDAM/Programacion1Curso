//Catherine Alventosa Manyewu
package Interfaces.EjercicioE1;

import java.util.Arrays;

public class VectorInt implements IMinMax, IEstaticas{

    //ATRIBUTO
    private int[] vector;
    int tamaño;
    int max;
    int min;

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

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public int getMinimo() {
        /*int minimo = (int) Math.min(min, max);
        return minimo;*/
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < min) {
                min = vector[i];
            }
       }
        System.out.println(min);
        return min;
    }

    @Override
    public int getMaximo() {
        for (int i = 0; i > vector.length; i++) {
            if (vector[i] > max) {
                max = vector[i];
            }
       }
        System.out.println(max);
        return max;
    }

    //MÉTODOS

    @Override
    public String toString() {
        return "Números" + vector + "]";
    }

    public int random(int min, int max) {
        for (int i = 0; i < vector.length; i++) {
            int random = (int)( Math.random() * (max-min+1)+ min);
        }
        Arrays.sort(vector);
        return max;
    }

  

    @Override
    public int getModa() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getModa'");
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMediana'");
    }

}
