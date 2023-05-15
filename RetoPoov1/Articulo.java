package RetoPoov1;


public class Articulo {
   
    private final String nombre;
    private double precio;
    private final double iva;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public int getCantidad() {
        return cantidad;
    }

    // Método toString para mostrar información del artículo
    public String toString() {
        return "Articulo [nombre=" + nombre + ", precio=" + precio + ", iva=" + iva + ", cantidad=" + cantidad + "]";
    }

    // Método aumentar para mostrar información del artículo subido
    public void aumentar (int cantidad){
        this.cantidad += cantidad;
    }

    // Método disminuir para mostrar información del artículo bajado
    public void disminuir (int cantidad){
        this.cantidad -= cantidad;
    }
    
}
