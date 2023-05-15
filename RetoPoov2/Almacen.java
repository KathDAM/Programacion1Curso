package RetoPoov2;

import java.util.ArrayList;

public class Almacen {

    private ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>();

    public Almacen() {
      
    }
    // MUESTRA LOS ARTÍCULOS EN EL ALMACÉN
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

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // DEVUELVE LA CANTIDAD DE ARTÍCULOS EN EL ALMACÉN
    public int cuantosArticulos(){
        return listaArticulos.size();
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // BUSCA UN ARTÍCULO POR NOMBRE
    public void buscarArticulo(String nombre){
        for (Articulo articulo : listaArticulos) {
            if (articulo.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                System.out.println("El artículo " + nombre + " se encuentra en el almacen.");
                return;
            }
        }
        System.out.println("El artículo " + nombre + " no se encuentra en el almacen.");
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // AGREGA UN ARTÍCULO AL ALMACÉN
    public boolean agregarArticulo(Articulo articulo) {
        listaArticulos.add(articulo);
        System.out.println("Artículo " + articulo.getNombre() + " agregado al almacén.");
        return true;
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // RETIRA UN ARTÍCULO DEL ALMACÉN 
    public boolean retirarArticulo(int indice){
        listaArticulos.remove(indice);
        System.out.println("Articulo" + indice + "eliminado.");
        return true;
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // MODIFICA EL PRECIO DE UN ARTÍCULO 
    public void modificarPrecio(String nombre, double nuevoPrecio) {
        boolean encontrar = false;
    
        for (Articulo articulo : listaArticulos) {
            if(articulo.getNombre().toLowerCase().contains(nombre.toLowerCase())) {
                articulo.setPrecio(nuevoPrecio);
                encontrar = true;
                break;
            }
        }
    
        if (encontrar) {
            System.out.println("Precio del artículo '" + nombre + "' modificado correctamente.");
            System.out.println("Precio actual: " + nuevoPrecio);
        } else {
            System.out.println("No se encontró el artículo '" + nombre + "'.");
        }
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // RECIBE UNA CANTIDAD DE UNIDADES DE UN ARTÍCULO
    public boolean recibirArticulo(int indice, int cantidad) {
        listaArticulos.get(indice).aumentar(cantidad);
        System.out.println("Se han recibido " + cantidad + " unidades del artículo " + listaArticulos.get(indice).getNombre() + ".");
        return true;
       
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // DEVUELVE UNA CANTIDAD DE UNIDADES A DEVOLVER
    public boolean devolverArticulo(int indice, int cantidad) {
        listaArticulos.get(indice).disminuir(cantidad);
        System.out.println("Se han devuelto " + cantidad + " unidades del artículo " + listaArticulos.get(indice).getNombre() + ".");
        return true;
              
    }
}

    /*// METODO PARA PEDIDO
    public void devolverArticulo(Articulo articulo) {
    }
    // DEVUELVE EL STOCK ACTUAL DEL ALMACEN
    public boolean verificarStock(String nombre, int cantidad) {
        for (Articulo articulo : listaArticulos) {
            devolverArticulo(articulo);
        }
        return false;*
    }
} */