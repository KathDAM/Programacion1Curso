package Repaso3Ev.Ej6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Tester {
    public static void main(String[] args) {
        List<Ficha> fichas = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            int numero1 = random.nextInt(6) + 1;
            int numero2 = random.nextInt(6) + 1;
            Ficha ficha = new Ficha(numero1, numero2);
            fichas.add(ficha);
        }

        System.out.println("Sin ordenar:");
        System.out.println("fichas(" + fichas.size() + "): " + fichas);

        Collections.sort(fichas);
        System.out.println("sort():");
        System.out.println("fichas(" + fichas.size() + "): " + fichas);

        Collections.reverse(fichas);
        System.out.println("reverseOrder:");
        System.out.println("fichas(" + fichas.size() + "): " + fichas);
   
   //Tester casa
        List<Casa> casas = new ArrayList<>();
        casas.add(new Casa("Casa A", 100));
        casas.add(new Casa("Casa B", 80));
        casas.add(new Casa("Casa C", 120));
        casas.add(new Casa("Casa D", 90));

        // Sin ordenar
        System.out.println("Casas sin ordenar:");
        System.out.println(casas);

        // Orden ascendente
        Collections.sort(casas);
        System.out.println("Casas ordenadas ascendentemente:");
        System.out.println(casas);

        // Orden descendente
        Collections.reverse(casas);
        System.out.println("Casas ordenadas descendente:");
        System.out.println(casas);

        // Verificar si una casa está en la lista
        Casa nuevaCasa = new Casa("Casa E", 110);
        System.out.println("La casa " + nuevaCasa + " está en la lista: " + casas.contains(nuevaCasa));
  
    
    }
} 

