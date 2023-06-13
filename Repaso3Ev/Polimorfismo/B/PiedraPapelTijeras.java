package Repaso3Ev.Polimorfismo.B;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Jugador jugador1 = new Humano("Jugador 1");
        Jugador jugador2 = new Maquina("Jugador 2");

        String movimientoJugador1 = jugador1.obtenerMovimiento();
        String movimientoJugador2 = jugador2.obtenerMovimiento();

        System.out.println(jugador1.getNombre() + " eligió: " + movimientoJugador1);
        System.out.println(jugador2.getNombre() + " eligió: " + movimientoJugador2);

        String resultado = obtenerResultado(movimientoJugador1, movimientoJugador2);
        System.out.println("Resultado: " + resultado);
    }

    public static String obtenerResultado(String movimientoJugador1, String movimientoJugador2) {
        if (movimientoJugador1.equals(movimientoJugador2)) {
            return "Empate";
        }

        if ((movimientoJugador1.equals("piedra") && movimientoJugador2.equals("tijeras")) ||
                (movimientoJugador1.equals("papel") && movimientoJugador2.equals("piedra")) ||
                (movimientoJugador1.equals("tijeras") && movimientoJugador2.equals("papel"))) {
            return "Gana " + movimientoJugador1;
        }

        return "Gana " + movimientoJugador2;
    }
}
