import java.util.ArrayList;

public class Almacen {

    public int indice,cantidad;
    private static final int maxArticulos = 100;
    private ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>(maxArticulos);

    public Almacen() {
      
    }

    public Almacen(int maxArticulos) {
        this.listaArticulos = new ArrayList<Articulo>(maxArticulos);
    }

    public void mostrarArticulos() {
        
        if (listaArticulos.isEmpty()) {
            System.out.println("El almacén está vacío.");
        } else {
            System.out.println("Lista de artículos en el almacén:");
            for (Articulo articulo : listaArticulos) {
                System.out.println("- " + articulo.getNombre());
            }
        }
    }

    public void buscarArticulo(String nombre){
        for (Articulo articulo : listaArticulos) {
            if (articulo.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El artículo " + nombre + " se encuentra en el almacen.");
                return;
            }
        }
        System.out.println("El artículo " + nombre + " no se encuentra en el almacen.");
    }
    
    public boolean agregarArticulo(Articulo articulo) {
        if (listaArticulos.size() < maxArticulos) {
            listaArticulos.add(articulo);
            System.out.println("Artículo " + articulo.getNombre() + " agregado al almacén.");
            return true;
        } else {
            System.out.println("El almacén está lleno, no se pueden agregar más artículo.");
            return false;
        }
    }


    public boolean recibirArticulo(int indice, int cantidad) {
        Articulo articulo = listaArticulos.get(indice);
        if (articulo == null) {
            System.out.println("El artículo " + indice + " no existe en el almacen.");
        } else {
            articulo.aumentar(cantidad);
            System.out.println("Se han recibido " + cantidad + " unidades del artículo " + articulo.getNombre() + ".");
        }
        return false;
       
    }


    public boolean devolverArticulo(int indice, int cantidad) {
        Articulo articulo = listaArticulos.get(indice);
        if (articulo == null) {
            System.out.println("El artículo " + indice + " no existe en el almacén.");
            return false;
        } else {
            if (articulo.getCantidad() >= cantidad) {
                articulo.disminuir(cantidad);
                System.out.println("Se han devuelto " + cantidad + " unidades del artículo " + articulo.getNombre() + ".");
                return true;
            } else {
                System.out.println("No hay suficientes unidades del artículo " + articulo.getNombre() + " para devolver.");
                return false;
            }
        }                  
    }
}