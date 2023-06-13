package Repaso3Ev.Ej2A;

public class Puntobidimensional {
    private double x;
    private double y;

    public Puntobidimensional(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getR() {
        return Math.sqrt(x * x + y * y);
    }

    public double getAngulo() {
        double angulo = Math.toDegrees(Math.atan2(y, x));
        if (angulo < 0) {
            angulo += 360;
        }
        return angulo;
    }

    @Override
    public String toString() {
        return "(x=" + x + ",y=" + y + ")";
    }

    public String toStringPolar() {
        return "(r=" + getR() + ",angulo=" + getAngulo() + ")";
    }
}
/* Atributos nuevos r y a
public class Punto {
    private double r;
    private double a;

    public Punto(double r, double a) {
        this.r = r;
        this.a = a;
    }

    public double getR() {
        return r;
    }

    public double getA() {
        return a;
    }

    public double getX() {
        return r * Math.cos(Math.toRadians(a));
    }

    public double getY() {
        return r * Math.sin(Math.toRadians(a));
    }

    public void setX(double x) {
        double y = getY();
        r = Math.sqrt(x * x + y * y);
        a = Math.toDegrees(Math.atan2(y, x));
    }

    public void setY(double y) {
        double x = getX();
        r = Math.sqrt(x * x + y * y);
        a = Math.toDegrees(Math.atan2(y, x));
    }

    @Override
    public String toString() {
        return "(x=" + getX() + ",y=" + getY() + ")";
    }

    public String toStringPolar() {
        return "(r=" + r + ",angulo=" + a + ")";
    }
}


//la última versión de la clase Punto donde los atributos son x, y, a y r:

public class Punto {
    private double x;
    private double y;
    private double a;
    private double r;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        this.a = Math.toDegrees(Math.atan2(y, x));
        this.r = Math.sqrt(x * x + y * y);
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getA() {
        return a;
    }

    public double getR() {
        return r;
    }

    public void setX(double x) {
        this.x = x;
        this.a = Math.toDegrees(Math.atan2(y, x));
        this.r = Math.sqrt(x * x + y * y);
    }

    public void setY(double y) {
        this.y = y;
        this.a = Math.toDegrees(Math.atan2(y, x));
        this.r = Math.sqrt(x * x + y * y);
    }

    public void setA(double a) {
        this.a = a;
        double rad = Math.toRadians(a);
        this.x = r * Math.cos(rad);
        this.y = r * Math.sin(rad);
    }

    public void setR(double r) {
        this.r = r;
        double rad = Math.toRadians(a);
        this.x = r * Math.cos(rad);
        this.y = r * Math.sin(rad);
    }

    @Override
    public String toString() {
        return "(x=" + x + ",y=" + y + ")";
    }

    public String toStringPolar() {
        return "(r=" + r + ",angulo=" + a + ")";
    }
}

 */