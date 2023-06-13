package Repaso3Ev.Ej2A;

public class Point {
    //ATRIBUTOS
    private double x;
    private double y;

//CONSTRUCTOR
    public Point(double x, double y) {
       this.x = x;
       this.y = y;
    }

//GETTER Y SETTER
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    //METODOS
    public void invertirCoordinates(){
        double inv = x; //creo variable inv, que guarda x,para luego asignarla a y
            x = y;
            y = inv;
    }

    public String toString() {
        return "(x = " + x + ", y = " + y + ")";
    }
}
