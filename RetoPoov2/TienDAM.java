//Catherine AM
package RetoPoov2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TienDAM {

    // ATRIBUTOS
    private static Scanner lector = new Scanner(System.in);
    private static Almacen almacen = new Almacen(); 
    //private static Pedido pedido = new Pedido();

    // MAIN
    public static void main(String[] args) throws Exception {
        iniciar();  
    }
    
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // PIDE UN INT, VERIFICA CORRECTO FUNCIONAMIENTO
    public static int pedirNum(String texto) {
       int num = 0;
        boolean verificar = false;

        do { 
            try {
                System.out.print(texto);
                num = lector.nextInt();
                verificar = true;
            } catch (Exception e) {
                System.out.println("Vuelve a intentarlo (ô_ô) ");
                //System.out.println("Argumento inválido, porfavor introduzca un número del 1 al 3 ");
                // VACIAR EL BUFFER
                lector.nextLine();
            }
            
        } while (!verificar);
        return num;
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // INICIA EL PROGRAMA, SE EJECUTA EL MENU PRINCIPAL
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
             
            opcion = pedirNum( "Selecciona la opción deseada: ");
        
            switch (opcion) {
                case 1: // MENU ALMACEN
                    menuAlmacen();
                    System.out.println(" ");
                    break;
                case 2: // MENU PEDIDO
                    System.out.println(" ");
                    System.out.println("En mantenimiento (T-T), vuelva a probar en unas horas.");
                    System.out.println(" ");
                    //menuPedido();
                    break;
                case 3: // SALE DEL PROGRAMA
                    System.out.println(" ");
                    System.out.println("(o ^O^)o --- Gracias por la visita, vuelva pronto --- o(^O^ o)");
                    System.out.println(" ");
                    break;
                default: 
                    System.out.println(" ");
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 3.");
                    break;
            }
        } 
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

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

//----------------------------------------------------------------------------------------------------------- 
 
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
        System.out.println("                           ");
        System.out.println("----- MENÚ ALMACEN -----");
        System.out.println("                           ");
        System.out.println("1. Ver artículos");
        System.out.println("2. Buscar artículo");
        System.out.println("3. Añadir nuevo artículo");
        System.out.println("4. Recibir artículo");
        System.out.println("5. Devolver artículo");
        System.out.println("6. Modificar precio artículo");
        System.out.println("7. Volver al menú principal");
    }
    
//----------------------------------------------------------------------------------------------------------

    //ENTRA AL SUBMENU DE ALMACEN
    private static void menuAlmacen() throws Exception {
        int opcion = 0;

        do {
            mostrarMenuAlmacen();
            System.out.println(" ");
            opcion = pedirNum( "Selecciona la opción deseada: ");
            System.out.println(" ");

            switch (opcion) {
                case 1: // 1. VER ARTÍCULOS
                    almacen.mostrarArticulos();
                    break;
                case 2: // 2. BUSCAR ARTÍCULO
                if ( almacen.listaArticulos.size() == 0) {
                    System.out.println("No hay artículos actualmente en el almacen");
                } else {
                    almacen.mostrarArticulos();
                    System.out.print("Ingrese el nombre del artículo a buscar: ");
                    String nombre = lector.next();
                    almacen.buscarArticulo(nombre);  
                }          
                    break;
                case 3: // 3. AÑADIR NUEVO ARTÍCULO
                    try {
                        agregarArticulo();
                    } catch (Exception agreg){
                        System.out.println("Error al agregar el artículo: " + agreg.getMessage());
                        lector.nextLine();// VACIAR EL BUFFER
                    }
                    break;
                case 4: // 4. RECIBIR ARTÍCULO
                    if(almacen.cuantosArticulos() == 0){
                        System.out.println("No es posible realizar la operación, almacen vacío");
                    } else {
                        try {
                            almacen.mostrarArticulos();
                            System.out.println("Ingrese el índice del artículo a recibir:");
                            int indice = lector.nextInt();
                            System.out.println("Ingrese la cantidad a recibir:");
                            int cantidad = lector.nextInt();
                            almacen.recibirArticulo(indice, cantidad);
                        } catch (InputMismatchException mostrar){
                            System.out.println("Valor inválido, por favor ingrese un número entero.");
                            lector.nextLine();// VACIAR EL BUFFER
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Índice inválido, por favor ingrese un valor dentro del rango.");
                            lector.nextLine();// VACIAR EL BUFFER
                        }
                    }
                    break;
                case 5: // 5. DEVOLVER ARTÍCULO
                    if(almacen.cuantosArticulos() == 0){
                        System.out.println("No es posible realizar la operación, almacen vacío");
                    } else {
                        try {
                            almacen.mostrarArticulos();
                            System.out.println("Ingrese el índice del artículo a devolver:");
                            int indice2 = lector.nextInt();
                            System.out.println("Ingrese la cantidad a devolver:");
                            int cantidad2 = lector.nextInt();
                            almacen.devolverArticulo(indice2, cantidad2);
                        } catch (InputMismatchException devol) {
                            System.out.println("Valor inválido, por favor ingrese un número entero.");
                            lector.nextLine();// VACIAR EL BUFFER
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Índice inválido, por favor ingrese un valor dentro del stock actual.");
                            lector.nextLine();// VACIAR EL BUFFER
                        }
                    }
                    break;
                case 6: // 6. MODIFICAR PRECIO ARTÍCULO
                    if(almacen.cuantosArticulos() == 0){
                        System.out.println("No es posible realizar la operación, almacen vacío");
                    } else {
                    try {
                        almacen.mostrarArticulos();
                        System.out.println("Ingrese el nombre del artículo que desea modificar:");
                        String nombre2 = lector.next();
                        System.out.println("Ingrese el nuevo precio:");
                        double nuevoPrecio = lector.nextDouble();
                        almacen.modificarPrecio(nombre2, nuevoPrecio);
                    } catch (InputMismatchException e) {
                        System.out.println("Valor inválido, por favor ingrese un número.");
                        lector.nextLine();// VACIAR EL BUFFER
                    }
                    }
                    break;
                case 7: // 7. VUELVE AL MENÚ PRINCIPAL
                System.out.println(" ");
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 7.");
                    break;
            }
        }while (opcion != 7); 
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // SOLICITAR AL USUARIO EL NOMBRE DE UN ARTÍCULO
    public static String PedirNombreArticulo() {
        try {
            lector.nextLine();
            System.out.println();
            System.out.print("Dime el nombre del articulo: ");
            String valor = lector.nextLine();
            // VACIAR EL BUFFER
            lector.nextLine();
            return valor;
        } catch (Exception e) {
            System.out.println("No es correcto, dime un nombre válido");
            return null;
        }
    }

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    // SOLICITAR AL USUARIO DATOS DEL ARTÍCULO
    private static void agregarArticulo() throws Exception {
        boolean agregar = true;
        do{
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
                agregar = false;
        } catch (Exception e) {
            System.out.println("El argumento no es valido, vuelve a intentarlo ");
            // VACIAR EL BUFFER
            lector.nextLine();
        }
        } while (agregar);
    }
}
