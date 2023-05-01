import java.util.Scanner;
import java.util.ArrayList;

public class Articulo {
    private Scanner lector = new Scanner(System.in);
    private String nombre;
    private double precio;
    private double iva;
    private int cantidad;



    public Articulo(String nombre, double precio, double iva, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.cantidad = cantidad;
    }

    // GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método toString para mostrar información del artículo

    public String toString() {
        return "Articulo [nombre=" + nombre + ", precio=" + precio + ", iva=" + iva + ", cantidad=" + cantidad + "]";
    }

}
