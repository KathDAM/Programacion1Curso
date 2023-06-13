package Repaso3Ev.Ej5;

import java.util.Scanner;

public class FraccionTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Numerador de la primera fraccion: ");
        int numerador1 = input.nextInt();

        System.out.println("Denominador de la primera fraccion: ");
        int denominador1 = input.nextInt();

        System.out.println("Numerador de la segunda fraccion: ");
        int numerador2 = input.nextInt();

        System.out.println("Denominador de la segunda fraccion: ");
        int denominador2 = input.nextInt();

        Fraccion fraccion1 = new Fraccion(numerador1, denominador1);
        Fraccion fraccion2 = new Fraccion(numerador2, denominador2);

        Fraccion suma = fraccion1.sumar(fraccion2);
        Fraccion resta = fraccion1.restar(fraccion2);
        Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);
        Fraccion division = fraccion1.dividir(fraccion2);

        System.out.println(fraccion1 + " + " + fraccion2 + " = " + suma);
        System.out.println(fraccion1 + " - " + fraccion2 + " = " + resta);
        System.out.println(fraccion1 + " * " + fraccion2 + " = " + multiplicacion);
        System.out.println(fraccion1 + " / " + fraccion2 + " = " + division);
        
     input.close();
    }
   
}
        /* poniendo nosotros los valore
        Fraccion fraccion1 = new Fraccion(3, 4);
        Fraccion fraccion2 = new Fraccion(2, 5);

        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);

        Fraccion suma = fraccion1.sumar(fraccion2);
        Fraccion resta = fraccion1.restar(fraccion2);
        Fraccion multiplicacion = fraccion1.multiplicar(fraccion2);
        Fraccion division = fraccion1.dividir(fraccion2);

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println( "Multiplicacion: " + multiplicacion);
        System.out.println("Dividision: " + division);
    }
}
*/