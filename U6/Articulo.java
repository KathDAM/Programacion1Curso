package U6;

public class Articulo {

    private String nombre;
    private double precio;
    private int iva = 21;
    private int cuantosQuedan;

    
    public Articulo(String n, double p, int i, int c) {
        this.nombre = n;
        this.precio = p;
        this.iva = i;
        this.cuantosQuedan = c;
    }


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
        if(precio<= 0)
            System.out.println("ERROR: El precio no puede ser negativo");
        else
            this.precio = precio;
    }


    public int getIva() {
        return iva;
    }


    public void setIva(int iva) {
        this.iva = iva;
    }


    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public String toString() {
        return ("Nombre: " + nombre + " Precio: " + precio);
       
    }

    public void vender(int cuantosVender){
        if (cuantosVender <= cuantosQuedan){
            cuantosQuedan -= cuantosVender;
            System.out.println("Se ha vendido. Salen de almacen");
        }
        else
            System.out.println("Error: No se pueden vender. No quedan tantos");
        
    }
    
}
