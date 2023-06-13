package Repaso3Ev.Ej5;

public class Fraccion {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    public Fraccion sumar(Fraccion otraFraccion) {
        int nuevoNumerador = (this.numerador * otraFraccion.denominador) + (otraFraccion.numerador * this.denominador);
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    public Fraccion restar(Fraccion otraFraccion) {
        int nuevoNumerador = (this.numerador * otraFraccion.denominador) - (otraFraccion.numerador * this.denominador);
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    public Fraccion multiplicar(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.numerador;
        int nuevoDenominador = this.denominador * otraFraccion.denominador;
        return simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    public Fraccion dividir(Fraccion otraFraccion) {
        int nuevoNumerador = this.numerador * otraFraccion.denominador;
        int nuevoDenominador = this.denominador * otraFraccion.numerador;
        return simplificar(new Fraccion(nuevoNumerador, nuevoDenominador));
    }

    private Fraccion simplificar(Fraccion fraccion) {
        int mcd = calcularMCD(fraccion.numerador, fraccion.denominador);
        fraccion.numerador /= mcd;
        fraccion.denominador /= mcd;
        return fraccion;
    }

    private int calcularMCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calcularMCD(b, a % b);
        }
    }
}

