import java.util.ArrayList;
import java.util.Scanner;

public class Almacen {

    private Scanner lector = new Scanner(System.in);
    private int max = 100;
    private Articulo[] listaArticulos = new Articulo[max];

    public Almacen() {
        listaArticulos = new Articulo[max];
    }

    public String PedirNombreArticulo(){ //PIDE NOMBRE DEL ARTICULO AL CLIENTE
        lector.nextLine();
        System.out.println();
        System.out.print("Dime el nombre del articulo: ");
        String valor = lector.nextLine();
    
        return valor;
    }

    public void agregarArticulo(Articulo articulo) {
        listaArticulos.add(PedirNombreArticulo);
        System.out.println("Artículo " + articulo.getNombre() + " agregado al almacen.");
    }

    public Articulo buscarArticulo(String nombre) {
        for () {
            if (articulo.getNombre().equalsIgnoreCase(nombre)) {
                return articulo;
            }
        }
        return null;
    }

    public void mostrarArticulos() {
        if (this.listaArticulos.isEmpty) {
            System.out.println("El almacén está vacío.");
        } else {
            System.out.println("Lista de artículos en el almacén:");
            for (String articulo : this.listaArticulos) {
                System.out.println("- " + articulo);
        }
    }

    public void recibirArticulo(String nombre, int cantidad) {
        Articulo articulo = buscarArticulo(nombre);
        if (articulo == null) {
            System.out.println("El artículo " + nombre + " no existe en el almacen.");
        } else {
         
            System.out.println("Se han recibido " + cantidad + " unidades del artículo " + nombre + ".");
        }
    }

    public void devolverArticulo(String nombre, int cantidad) {
        Articulo articulo = buscarArticulo(nombre);
        if (articulo == null) {
            System.out.println("El artículo " + nombre + " no existe en el almacen.");
        } else {
        
            System.out.println("Se han devuelto " + cantidad + " unidades del artículo " + nombre + ".");
        }
    }
}
