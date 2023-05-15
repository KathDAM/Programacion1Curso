package RetoPoov1;

import java.util.ArrayList;

public class Almacen {

    private ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();

    public Almacen() {
      
    }

    public void mostrarArticulos() {
        
        if (listaArticulos.isEmpty()) {
            System.out.println("El almacén está vacío.");
        } else {
            System.out.println("Lista de artículos en el almacén:");
            for (Articulo articulo : listaArticulos) {
                System.out.println(articulo.toString());   
            }
        }
    }

    public int cuantosArticulos(){
        return listaArticulos.size();
         /*if (listaArticulos.contains(listaArticulos)) {
            mostrarArticulos();
            return true;
         } else {
            System.out.println("No hay articulos, porfavor añada articulos al almacen");
            
         }
        return false;*/
    }

    public void buscarArticulo(String nombre){
        for (Articulo articulo : listaArticulos) {
            if (articulo.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println("El artículo " + nombre + " se encuentra en el almacen.");
                return;
            }
        }
        System.out.println("El artículo " + nombre + " no se encuentra en el almacen.");
    }
    
    public boolean agregarArticulo(Articulo articulo) {
        listaArticulos.add(articulo);
        System.out.println("Artículo " + articulo.getNombre() + " agregado al almacén.");
        return true;
    }

    public boolean retirarArticulo(int indice){
        listaArticulos.remove(indice);
        System.out.println("Articulo" + indice + "eliminado.");
        return true;
    }

   /* public void modificarPrecioArticulo(String nombre, double nuevoPrecio) {
                listaArticulos.
                System.out.println("El precio del artículo '" + articulo.getNombre() + "' ha sido modificado. Nuevo precio: " + nuevoPrecio);
                return;
            }
        }
  */

    public boolean recibirArticulo(int indice, int cantidad) {
        listaArticulos.get(indice).aumentar(cantidad);
        System.out.println("Se han recibido " + cantidad + " unidades del artículo " + listaArticulos.get(indice).getNombre() + ".");
        return true;
       
    }

    public boolean devolverArticulo(int indice, int cantidad) {
        listaArticulos.get(indice).disminuir(cantidad);
        System.out.println("Se han devuelto " + cantidad + " unidades del artículo " + listaArticulos.get(indice).getNombre() + ".");
        return true;
              
    }
}