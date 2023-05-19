package RetoPoov2;

import java.util.ArrayList;

public class Pedido {
    
    private ArrayList<Articulo> listaPedidArticulos = new ArrayList<Articulo>();
    private double descuento;
    private double subtotal;
    private Almacen almacen;

    public Pedido() {
       
    }

    public Pedido(Almacen almacen) {
        this.almacen = almacen;
        this.listaPedidArticulos = new ArrayList<>();
        this.descuento = 0;
    }

    // AGREGAR ARTÍCULO AL PEDIDO
    public boolean agregarArticuloPedido(Articulo articulo) {
        listaPedidArticulos.add(articulo);
        System.out.println("Artículo " + articulo.getNombre() + " agregado al pedido.");
        return true;
    }

    // QUITAR ARTÍCULO DEL PEDIDO
    public boolean quitarArticuloPedido(int indice){
        listaPedidArticulos.remove(indice);
        System.out.println("Articulo" + indice + "eliminado.");
        return true;
    }

    // MODIFICAR CANTIDAD DE UN ARTÍCULO EN EL PEDIDO
    public void modificarCantidadArticuloPedido(String nombre, int cantidad) {
    
        for (Articulo articulo : listaPedidArticulos) {
            if(articulo.getNombre().toLowerCase().equals(nombre.toLowerCase())) {
                articulo.setPrecio(cantidad);   
            }
        }
    
        if (almacen.verificarStock(nombre, cantidad)) {
            Articulo.setCantidad(cantidad);
            System.out.println("Cantidad modificada correctamente.");
            System.out.println("Cantidad actual: " + cantidad);
        } else {
            System.out.println("No se encontró el artículo '" + nombre + "'.");
        }
        return;
            }
        System.out.println("El artículo no está en el pedido.");
    

    // APLICAR DESCUENTO AL PEDIDO
    public void aplicarDescuentoPedido(double descuento) {
        if (descuento >= 0 && descuento <= 100) {
            this.descuento = descuento;
            System.out.println("Descuento aplicado correctamente.");
        } else {
            System.out.println("El descuento debe ser un valor entre 0 y 100.");
        }
    }

    // REALIZAR LA VENTA
    public void hacerVenta() {
        double subtotal = 0;
        double iva = 0;
        double total = 0;

        System.out.println("----- TICKET DE VENTA -----");
        for (Articulo articulo : listaPedidArticulos) {
            double precio = articulo.getPrecio() * articulo.getCantidad();
            double ivaArticulo = precio * articulo.getIva();
            subtotal += precio;
            iva += ivaArticulo;
            total += precio + ivaArticulo;

            System.out.println(articulo.getNombre() + " x " + articulo.getCantidad() + " = " + precio);
     
        System.out.println("---------------------------");
        System.out.println("Subtotal: " + subtotal);
        System.out.println("IVA: " + iva);
        System.out.println("Descuento: " + (subtotal * descuento / 100));
        System.out.println("Total a pagar: " + (total - (subtotal * descuento / 100)));
        System.out.println("---------------------------");
        }
    }
        // ACTUALIZA INFORMACIÓN DEL ALMACEN
        public void actualizaPedido() {
            for (Articulo articulo : listaPedidArticulos) {
                almacen.devolverArticulo(articulo);
            }
        }
        // ELIMINA LA LISTA DEL PEDIDO
        public void cancelarVenta() {
            listaPedidArticulos.clear();
            descuento = 0;
        }
    }


