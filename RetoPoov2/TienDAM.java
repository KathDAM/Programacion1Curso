package RetoPoov2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TienDAM {
    private static Scanner lector = new Scanner(System.in);
    private static Almacen almacen = new Almacen(); 
    private static boolean reiniciar = true;
    //private static Pedido pedido = new Pedido();

    //MAIN
    public static void main(String[] args) {

        while(reiniciar){ 
            try {   
                iniciar();  
            } catch (Exception inicio) {
                System.out.println("Argumento inválido, porfavor introduzca un número del 1 al 3 ");
                continue;
            }
        }
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //INICIA EL PROGRAMA, SE EJECUTA EL MENU PRINCIPAL
    public static void iniciar() throws Exception{
        int opcion = 0;

        System.out.println("                           ");
        System.out.println("¡ BIENVENIDO A TIENDA DAM !");
        System.out.println("                           ");

        while (opcion != 3) {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("                           ");
            System.out.println("1. Almacen");
            System.out.println("2. Pedido");
            System.out.println("3. Salir");
            System.out.println("");
            System.out.print("Selecciona la opción deseada: ");
             
            opcion = lector.nextInt();
            lector.nextLine();
        
            switch (opcion) {
                case 1:
                    menuAlmacen();
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("En mantenimiento, vuelva a probar en unas horas.");
                    System.out.println("");
                    //menuPedido();
                    break;
                case 3:
                    System.out.println("Gracias por la visita, vuelva pronto.");
                    reiniciar = false;
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 3.");
                    break;
            }
        } 
    }
/* 
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
       
        int opcion = 0;
        boolean salir = false;

        do {
            mostrarMenuPedido();
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    pedido.agregarArticuloPedido(null);
                    break;
                case 2:
                    int indiceart=0;
                    pedido.quitarArticuloPedido(indiceart);
                    break;
                case 3:
                    pedido.modificarCantidadArticuloPedido();
                    break;
                case 4:
                    pedido.aplicarDescuentoPedido();
                    break;
                case 5:
                    pedido.hacerVenta();
                    salir = true;
                    break;
                case 6:
                    pedido.cancelarVenta();
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 6.");
                    break;
            }
        }while (!salir); 

        System.out.println("Volviendo al menú principal.");
    }
 */
    //MUESTRA EL SUBMENU DE ALMACEN
    private static void mostrarMenuAlmacen() {
        System.out.println("----- MENÚ ALMACEN -----");
        System.out.println("1. Ver artículos");
        System.out.println("2. Buscar artículo");
        System.out.println("3. Añadir nuevo artículo");
        System.out.println("4. Recibir artículo");
        System.out.println("5. Devolver artículo");
        System.out.println("6. Modificar precio artículo");
        System.out.println("7. Volver al menú principal");
        System.out.print("Ingrese una opción: ");
    }

    //ENTRA AL SUBMENU DE ALMACEN
    private static void menuAlmacen() {
        int opcion = 0;
        
        do {
            mostrarMenuAlmacen();
            opcion = lector.nextInt();

            switch (opcion) {
                case 1:
                    almacen.mostrarArticulos();
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del artículo a buscar: ");
                    String nombre = lector.next();
                    almacen.buscarArticulo(nombre);   
                    almacen.mostrarArticulos();      
                    break;
                case 3:
                    try {
                        agregarArticulo();
                    } catch (Exception agreg){
                        System.out.println("Error al agregar el artículo: " + agreg.getMessage());
                    }
                    break;
                case 4:
                    if(almacen.cuantosArticulos() == 0){
                        System.out.println("No es posible realizar la operacion, almacen vacio");
                    } else {
                        try {
                            almacen.mostrarArticulos();
                            System.out.println("Ingrese el nombre del artículo a recibir:");
                            int indice = lector.nextInt();
                            System.out.println("Ingrese la cantidad a recibir:");
                            int cantidad = lector.nextInt();
                            almacen.recibirArticulo(indice, cantidad);
                        } catch (InputMismatchException mostrar){
                            System.out.println("Valor inválido, por favor ingrese un número entero.");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Índice inválido, por favor ingrese un valor dentro del rango.");
                        }
                    }
                    break;
                case 5:
                    try {
                        almacen.mostrarArticulos();
                        System.out.println("Ingrese el índice del artículo a devolver:");
                        int indice2 = lector.nextInt();
                        System.out.println("Ingrese la cantidad a devolver:");
                        int cantidad2 = lector.nextInt();
                        almacen.devolverArticulo(indice2, cantidad2);
                    } catch (InputMismatchException devol) {
                        System.out.println("Valor inválido, por favor ingrese un número entero.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Índice inválido, por favor ingrese un valor dentro del rango.");
                    }
                    break;
                case 6:
                    try {
                        almacen.mostrarArticulos();
                        System.out.println("Ingrese el nombre del artículo que desea modificar:");
                        String nombre2 = lector.next();
                        System.out.println("Ingrese el nuevo precio:");
                        double nuevoPrecio = lector.nextDouble();
                        almacen.modificarPrecio(nombre2, nuevoPrecio);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido, por favor ingrese un número.");
                    }
                    break;
                case 7:
                System.out.println(" ");
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 6.");
                    break;
            }
        }while (opcion != 7); 
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    public static String PedirNombreArticulo() {
        try {
            lector.nextLine();
            System.out.println();
            System.out.print("Dime el nombre del articulo: ");
            String valor = lector.nextLine();

            return valor;
        } catch (Exception e) {
            System.out.println("No es correcto, dime un nombre válido");
            return null;
        }
    }


    private static void agregarArticulo() throws Exception {
        try {
            System.out.print("Ingrese el nombre del artículo: ");
            String nombre = lector.next();
            System.out.print("Ingrese el precio del artículo: ");
            double precio = lector.nextDouble();
            System.out.print("Seleccione el tipo de IVA (1. general, 2. reducido o 3. exento): ");
            int tipoIva = lector.nextInt();
            double iva = 0;
            switch (tipoIva) {
                case 1:
                    iva = 0.21; // GENERAL
                    break;
                case 2:
                    iva = 0.10; // REDUCIDO
                    break;
                case 3:
                    iva = 0.04; // EXENTO
                    break;
                default:
                    throw new Exception("No es una opción válida");
            }
            System.out.print("Ingrese la cantidad de unidades: ");
            int cantidad = lector.nextInt();
            Articulo articulo = new Articulo(nombre, precio, iva, cantidad);
            almacen.agregarArticulo(articulo);
        } catch (Exception e) {
            System.out.println("El nombre no es valido, vuelve a intentarlo ");
        }
    }
}
