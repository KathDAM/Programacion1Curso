package Repaso3Ev.Polimorfismo.B;

public abstract class Jugador {
      private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String obtenerMovimiento();
}
