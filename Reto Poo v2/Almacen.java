import java.util.ArrayList;

public class Almacen {

    private int indice;
    private final int maxArticulos = 100;
    private Articulo[] listaArticulos = new Articulo[maxArticulos];


    public Almacen() {
        this.listaArticulos = new Articulo[maxArticulos];
    }

    public void mostrarArticulos() {
        if (listaArticulos.) {
            System.out.println("El almacén está vacío.");
        } else {
            System.out.println("Lista de artículos en el almacén:");
            for (Articulo articulo : listaArticulos) {
                System.out.println("- " + articulo);
        }
    }

    public Articulo buscarArticulo(String nombre) {
        for () {
            if (articulo.getNombre().equalsIgnoreCase(nombre)) {
                return articulo;
            }
        }
        return null;
    }
    
    public void agregarArticulo(Articulo articulo) {
        listaArticulos.add(TienDAM.PedirNombreArticulo());
        System.out.println("Artículo " + articulo.getNombre() + " agregado al almacen.");
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
