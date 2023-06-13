package Repaso3Ev.Ej7;

import java.util.*;

public class ConjuntosProgram {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 4, 5, 6, 7, 8 };

        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        for (int num : array1) {
            conjunto1.add(num);
        }

        for (int num : array2) {
            conjunto2.add(num);
        }

        // Unión
        Set<Integer> union = new HashSet<>(conjunto1);
        union.addAll(conjunto2);
        System.out.println("Unión: " + union);

        // Intersección
        Set<Integer> interseccion = new HashSet<>(conjunto1);
        interseccion.retainAll(conjunto2);
        System.out.println("Intersección: " + interseccion);

        // Diferencia
        Set<Integer> diferencia = new HashSet<>(conjunto1);
        diferencia.removeAll(conjunto2);
        System.out.println("Diferencia (conjunto1 - conjunto2): " + diferencia);

        // Diferencia simétrica
        Set<Integer> diferenciaSimetrica = new HashSet<>(conjunto1);
        diferenciaSimetrica.addAll(conjunto2);
        Set<Integer> temp = new HashSet<>(conjunto1);
        temp.retainAll(conjunto2);
        diferenciaSimetrica.removeAll(temp);
        System.out.println("Diferencia simétrica: " + diferenciaSimetrica);

        // Ordenar y mostrar los conjuntos ordenados
        List<Integer> conjunto1Ordenado = new ArrayList<>(conjunto1);
        List<Integer> conjunto2Ordenado = new ArrayList<>(conjunto2);
        Collections.sort(conjunto1Ordenado);
        Collections.sort(conjunto2Ordenado);
        System.out.println("Conjunto 1 ordenado: " + conjunto1Ordenado);
        System.out.println("Conjunto 2 ordenado: " + conjunto2Ordenado);

        // Mostrar los primeros y últimos elementos de los conjuntos ordenados
        if (!conjunto1Ordenado.isEmpty()) {
            System.out.println("Primer elemento del conjunto 1 ordenado: " + conjunto1Ordenado.get(0));
            System.out.println("Último elemento del conjunto 1 ordenado: " + conjunto1Ordenado.get(conjunto1Ordenado.size() - 1));
        }

        if (!conjunto2Ordenado.isEmpty()) {
            System.out.println("Primer elemento del conjunto 2 ordenado: " + conjunto2Ordenado.get(0));
            System.out.println("Último elemento del conjunto 2 ordenado: " + conjunto2Ordenado.get(conjunto2Ordenado.size() - 1));
        }
    }
}
