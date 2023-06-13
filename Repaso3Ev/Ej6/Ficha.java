package Repaso3Ev.Ej6;

import java.util.*;

class Ficha implements Comparable<Ficha> {
    private int numero1;
    private int numero2;

    public Ficha(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public int pesoPonderado() {
        int maxNumero = Math.max(numero1, numero2);
        return maxNumero * 6 + Math.min(numero1, numero2);
    }

    @Override
    public int compareTo(Ficha otraFicha) {
        return Integer.compare(this.pesoPonderado(), otraFicha.pesoPonderado());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Ficha otraFicha = (Ficha) obj;
        return numero1 == otraFicha.numero1 && numero2 == otraFicha.numero2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero1, numero2);
    }

    @Override
    public String toString() {
        return numero1 + ":" + numero2 + "|";
    }
}
