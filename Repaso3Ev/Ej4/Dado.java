package Repaso3Ev.Ej4;

import java.util.Random;

public class Dado {
    private int caras;
    private int caraSuperior;
    private Random random;

    // Constructor por defecto
    public Dado() {
        this.caras = 6;
        this.random = new Random();
        tirarDado();
    }

    // Constructor con cara superior
    public Dado(int caraSuperior) {
        this.caras = 6;
        this.random = new Random();
        if (caraSuperior >= 1 && caraSuperior <= caras) {
            this.caraSuperior = caraSuperior;
        } else {
            throw new IllegalArgumentException("Número de cara superior inválido");
        }
    }

    // Constructor con cara superior y número de caras
    public Dado(int caraSuperior, int caras) {
        if (caras >= 2) {
            this.caras = caras;
            this.random = new Random();
            if (caraSuperior >= 1 && caraSuperior <= caras) {
                this.caraSuperior = caraSuperior;
            } else {
                throw new IllegalArgumentException("Número de cara superior inválido");
            }
        } else {
            throw new IllegalArgumentException("Número de caras inválido");
        }
    }

    // Getter para cara superior
    public int getCaraSuperior() {
        return caraSuperior;
    }

    // Getter para número de caras
    public int getCaras() {
        return caras;
    }

    // Método para tirar el dado al azar
    public void tirarDado() {
        caraSuperior = random.nextInt(caras) + 1;
    }

    // Representación en cadena del dado
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("---\n");
        
        for (int i = 1; i <= caras; i++) {
            if (i == caraSuperior) {
                builder.append(" o ");
            } else {
                builder.append("   ");
            }

            if (i % 3 == 0) {
                builder.append("\n");
            }
        }

        builder.append("---");
        return builder.toString();
        
        //return "Dado[Cara Superior=" + caraSuperior + ", Caras=" + caras + "]";
    }
}

