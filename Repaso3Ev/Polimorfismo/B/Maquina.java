package Repaso3Ev.Polimorfismo.B;

import java.util.Random;

public class Maquina extends Jugador {
        public Maquina(String nombre) {
        super(nombre);
    }

    @Override
    public String obtenerMovimiento() {
        Random random = new Random();
        int opcion = random.nextInt(3); // Genera un número aleatorio entre 0 y 2

        switch (opcion) {
            case 0:
                return "piedra";
            case 1:
                return "papel";
            case 2:
                return "tijeras";
            default:
                return "";
        }
    }
}
