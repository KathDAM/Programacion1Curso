package Repaso3Ev.Herencia.B;

public class Punto {
 private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanceToZero() {
        return distance(new Punto(0, 0));
    }

    public double distance(Punto other) {
        double dx = other.x - this.x;
        double dy = other.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double squaredDistanceToZero() {
        double dx = this.x;
        double dy = this.y;
        return dx * dx + dy * dy;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
