package RetoPoov2;

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

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws IllegalArgumentException {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public static int setCantidad(int cantidad) throws IllegalArgumentException {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        return cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    
    // MÉTODO TOSTRING PARA MOSTRAR INFORMACIÓN DEL ARTÍCULO
    public String toString() {
        return "Articulo [nombre=" + nombre + ", precio=" + precio + ", iva=" + iva + ", cantidad=" + cantidad + "]";
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    // MÉTODO AUMENTAR PARA MOSTRAR INFORMACIÓN DEL ARTÍCULO SUBIDO
    public void aumentar (int cantidad) throws  IllegalArgumentException{
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa");
        }
        this.cantidad += cantidad;
    }

//-----------------------------------------------------------------------------------------------------------

    // MÉTODO DISMINUIR PARA MOSTRAR INFORMACIÓN DEL ARTÍCULO BAJADO
    public void disminuir (int cantidad) throws IllegalArgumentException{
        if (cantidad < 0 || cantidad > this.cantidad) {
            throw new IllegalArgumentException("La cantidad es inválida");
        }
        this.cantidad -= cantidad;
    }
    
}
