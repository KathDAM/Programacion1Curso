package RetoPoov2;

import java.util.ArrayList;
import java.util.Scanner;

public class TienDAM {
    private static Scanner lector = new Scanner(System.in);
    private static Almacen almacen = new Almacen(); //llama al almacen
   
    //MAIN
    public static void main(String[] args) {

        TienDAM TiendaDAM = new TienDAM();
        TiendaDAM.iniciar();  
    }

    //INICIA EL PROGRAMA
    //Comienza a ejecutarse el menu principal
    public void iniciar(){

        int opcion = 0;
        
        while (opcion != 3) {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Almacen");
            System.out.println("2. Pedido");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            
            opcion = lector.nextInt();
            lector.nextLine();

            switch (opcion) {
                case 1:
                    menuAlmacen();
                    break;
                case 2:
                   // menuPedido();
                    break;
                case 3:
                    System.out.println("Gracias por la visita, vuelva pronto.");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 3.");
                    break;
            }
        } 
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
/* 
    //ENTRA AL SUBMENU DE PEDIDOS
    private static void menuPedido() {
       
        int opcion = 0;
        boolean salir = false;

        do {
            mostrarMenuPedido();
            opcion = lector.nextInt();

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
        System.out.println("6. Volver al menú principal");
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
                    break;
                case 3:
                    agregarArticulo();
                    break;
                case 4:
                    if(almacen.cuantosArticulos() == 0){
                        System.out.println("No es posible realizar la operacion, almacen vacio");
                    }
                    else {
                        almacen.mostrarArticulos();
                        System.out.println("Articulo que quieres recibir");
                        int indice = lector.nextInt();
                        System.out.println("Dime la cantidad");
                        int cantidad = lector.nextInt();
                        almacen.recibirArticulo(indice, cantidad);
                    }
                    break;
                case 5:
                    almacen.mostrarArticulos();
                    System.out.println("Articulo que quieres devolver");
                    int indice2 = lector.nextInt();
                    System.out.println("Dime la cantidad");
                    int cantidad2 = lector.nextInt();
                    almacen.devolverArticulo(indice2, cantidad2);
                    break;
                    
                default:
                    System.out.println("Opción inválida, por favor ingrese un número del 1 al 6.");
                    break;
            }
        }while (opcion != 6); 
         System.out.println("Volviendo al menú principal.");
    }

    public static String PedirNombreArticulo(){ //PIDE NOMBRE DEL ARTICULO AL CLIENTE
        lector.nextLine();
        System.out.println();
        System.out.print("Dime el nombre del articulo: ");
        String valor = lector.nextLine();

        return valor;  
    }


    private static void agregarArticulo() {
        System.out.print("Ingrese el nombre del artículo: ");
        String nombre = lector.next();
        System.out.print("Ingrese el precio del artículo: ");
        double precio = lector.nextDouble();
        System.out.print("Ingrese el tipo de IVA en porcentaje: ");
        int tipoIva = lector.nextInt();
        double iva = 0;
        switch (tipoIva) {
            case 1:
                iva = 0.21;
                break;
            case 2:
                iva = 0.10;
                break;
            case 3:
                iva = 0.04;
                break;
            default:
            System.out.println("No es una opcion valida");
                break;
        }

        System.out.print("Ingrese la cantidad de unidades: ");
        int cantidad = lector.nextInt();
        almacen.agregarArticulo(new Articulo(nombre, precio, tipoIva, cantidad));
        System.out.println("Artículo agregado correctamente.");
    }
/*
    private static void recibirArticulo() {
        System.out.print("Ingrese el nombre del artículo a recibir: ");
        String nombre = lector.next();
        System.out.print("Ingrese la cantidad a recibir: ");

            System.out.println("Se han recibido " + cantidad + " unidades del artículo " + articulo.getNombre() + ".");
    } */
}
