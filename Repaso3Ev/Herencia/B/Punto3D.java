package Repaso3Ev.Herencia.B;

public class Punto3D extends Punto {
    private double z;

    public Punto3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double distanceToZero() {
        return distance(new Punto3D(0, 0, 0));
    }

    public double distance(Punto3D other) {
        double dx = other.getX() - this.getX();
        double dy = other.getY() - this.getY();
        double dz = other.z - this.z;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public double squaredDistanceToZero() {
        double dx = this.getX();
        double dy = this.getY();
        double dz = this.z;
        return dx * dx + dy * dy + dz * dz;
    }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}