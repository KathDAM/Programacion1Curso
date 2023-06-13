package Repaso3Ev.Polimorfismo.B;

import java.util.Scanner;

public class Humano extends Jugador {
     public Humano(String nombre) {
        super(nombre);
    }

    @Override
    public String obtenerMovimiento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elige tu movimiento (piedra, papel, tijeras): ");
        return scanner.nextLine().toLowerCase();
    }   
}
