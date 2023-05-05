import java.util.Scanner;

public class TienDAM {
    private static Scanner scanner = new Scanner(System.in);
    private static Almacen almacen = new Almacen(); //llama al almacen

    //main
    public static void main(String[] args) {

        TienDAM TiendaDAM = new TienDAM();
        TiendaDAM.iniciar();  
    }

/*  private static void mostrarMenuPrincipal() {
        System.out.println("\n=== MENÚ PRINCIPAL ===");
        System.out.println("1. Almacen");
        System.out.println("2. Pedido");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");
    }*/

    //INICIA TODO
    //Comienza a ejecutarse el menu principal
    public void iniciar(){
   
        int opcion = 0;
        
        while (opcion != 3) {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Almacen");
            System.out.println("2. Pedido");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    menuAlmacen();
                    break;
                case 2:
                    menuPedido();
                    break;
                case 3:
                    System.out.println("Gracias por utilizar nuestro sistema.");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 3.");
                    break;
            }
        } while (opcion != 3);
    }

    //MUESTRA EL SUBMENU DE PEDIDOS
    private static void mostrarMenuPedido() {
        System.out.println("----- MENÚ PEDIDO -----");
        System.out.println("1. Agregar artículo");
        System.out.println("2. Modificar artículo");
        System.out.println("3. Eliminar artículo");
        System.out.println("4. Aplicar descuento");
        System.out.println("5. Realizar venta");
        System.out.println("6. Volver al menú principal");
        System.out.print("Ingrese una opción: ");
    }

    //ENTRA AL SUBMENU DE PEDIDOS
    private static void menuPedido() {
        boolean salir = false;
        while (!salir) {
            mostrarMenuPedido();
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    agregarArticuloPedido();
                    break;
                case 2:
                    quitarArticuloPedido();
                    break;
                case 3:
                    modificarCantidadArticuloPedido();
                    break;
                case 4:
                    aplicarDescuentoPedido();
                    break;
                case 5:
                    hacerVenta();
                    salir = true;
                    break;
                case 6:
                    cancelarVenta();
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 6.");
                    break;
            }
        }
    }
    
    //MUESTRA EL SUBMENU DE ALMACEN
    private static void mostrarMenuAlmacen() {
        System.out.println("----- MENÚ ALMACEN -----");
        System.out.println("1. Ver artículos");
        System.out.println("2. Buscar artículo");
        System.out.println("3. Añadir nuevo artículo");
        System.out.println("4. Recibir artículo");
        System.out.println("5. Devolver artículo");
        System.out.println("6. Volver al menú principal");
        System.out.print("Ingrese una opción: ");
    }

    //ENTRA AL SUBMENU DE PEDIDOS
    private static void menuAlmacen() {
        int opcion = 0;
        mostrarMenuAlmacen();
        opcion = scanner.nextInt();
        while (opcion != 6) {
            switch (opcion) {
                case 1:
                    almacen.mostrarArticulos();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del artículo a buscar: ");
                    String nombre = scanner.next();
                    Articulo articulo = almacen.buscarArticulo(nombre);
          TienDAM TiendaDAM = new TienDAM();
        TiendaDAM.iniciar()            if (articulo == null) {
                        System.out.println("Artículo no encontrado.");
                    } else {
                        System.out.println(articulo);
                    }
                    break;
                case 3:
                    agregarArticulo();
                    break;
                case 4:
                    recibirArticulo();
                    break;
                case 5:
                    devolverArticulo();
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 6.");
                    break;
            }
            mostrarMenuAlmacen();
            opcion = scanner.nextInt();
        }
        System.out.println("Volviendo al menú principal.");
    }

    public String PedirNombreArticulo(){ //PIDE NOMBRE DEL ARTICULO AL CLIENTE
        lector.nextLine();
        System.out.println();
        System.out.print("Dime el nombre del articulo: ");
        String valor = lector.nextLine();

        return valor;  
    }


    private static void agregarArticulo() {
        System.out.print("Ingrese el nombre del artículo: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el precio del artículo: ");
        double precio = scanner.nextDouble();
        System.out.print("Ingrese el tipo de IVA (general, reducido o exento): ");
        String tipoIva = scanner.next();
        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = scanner.nextInt();
        almacen.agregarArticulo(new Articulo(nombre, precio, tipoIva, cantidad));
        System.out.println("Artículo agregado correctamente.");
    }

    private static void recibirArticulo() {
        System.out.print("Ingrese el nombre del artículo a recibir: ");
        String nombre = scanner.next();
        System.out.print("Ingrese la cantidad a recibir: ");

            System.out.println("Se han recibido " + cantidad + " unidades del artículo " + articulo.getNombre() + ".");
    }
}
