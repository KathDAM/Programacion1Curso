//Catherine AM
package RetoPoov2;

public class Articulo {

   // ATRIBUTOS
    private String nombre;
    private double precio;
    private final double iva;
    private int cantidad;

    public Articulo(String nombre, double precio, double iva, int cantidad) throws Exception {
        setNombre(nombre);
        setPrecio(precio);
        this.iva = iva;
        setCantidad(cantidad);
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // GETTER Y SETTER

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) throws Exception {
        if (esNumero(nombre)) {
            throw new Exception("El nombre no puede ser un número.");
        }
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws Exception {
        if (precio < 0) {
            throw new Exception("El precio no puede ser negativo.");
        }
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public static int setCantidad(int cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("La cantidad no puede ser negativa.");
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
    
    // VERIFICA SI UN VALOR DADO ES UN NÚMERO VÁLIDO.
    private boolean esNumero(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    // MÉTODO AUMENTAR PARA MOSTRAR INFORMACIÓN DEL ARTÍCULO SUBIDO
    public void aumentar (int cantidad) throws  Exception{
        if (cantidad < 0) {
            throw new Exception("La cantidad no puede ser negativa");
        }else{
        this.cantidad += cantidad;
    }
}

//-----------------------------------------------------------------------------------------------------------

    // MÉTODO DISMINUIR PARA MOSTRAR INFORMACIÓN DEL ARTÍCULO BAJADO
    public void disminuir (int cantidad) throws Exception{
            if (cantidad < 0 || cantidad > this.cantidad) {
                throw new Exception("La cantidad es inválida");
            } else {
                this.cantidad -= cantidad;
        }
  
    }
    
}

