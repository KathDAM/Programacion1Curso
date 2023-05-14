public class Pedido {
    private int max = 100;
    private Articulo[] listaArticulos = new Articulo[max];
    private double descuento;
    private double subtotal;

public void agregarArticuloPedido(Articulo articulo, int cantidad) {
    if (articulo != null && cantidad > 0) {
        for (int i = 0; i < articulos.size(); i++) {
            Articulo a = articulos.get(i);
            if (a.getNombre().equals(articulo.getNombre())) {
                a.aumentarExistencias(cantidad);
                return;
            }
        }
        Articulo nuevoArticulo = new Articulo(articulo.getNombre(), articulo.getPrecio(), cantidad);
        articulos.add(nuevoArticulo);
    } else {
        System.out.println("Error al agregar el artículo al pedido.");
    }
}

public double calcularTotal() {
    double total = 0;
    for (Articulo a : articulos) {
        total += a.getPrecio() * a.getExistencias();
    }
    return total;
}

public void mostrarDetalle() {
  
    System.out.println("Artículos:");
    for (Articulo a : articulos) {
        System.out.println(a.getNombre() + " - Precio unitario: $" + a.getPrecio() + " - Cantidad: " + a.getExistencias());
    }
    System.out.println("Total del pedido: $" + calcularTotal());
}
}
