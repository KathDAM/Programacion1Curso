package Pruebas;
import java.util.Scanner;
public class MenuySubmenu {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("----- MENÚ PRINCIPAL -----");
            System.out.println("1. Submenú 1");
            System.out.println("2. Submenú 2");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    menuSubmenu1();
                    break;
                case 2:
                    menuSubmenu2();
                    break;
                case 3:
                    System.out.println("Gracias por usar este programa. ¡Hasta pronto!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción del 1 al 3.");
                    break;
            }
        }
    }

    private static void menuSubmenu1() {
        boolean salir = false;

        while (!salir) {
            System.out.println("----- SUBMENÚ 1 -----");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Volver al menú principal");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opción 1 del submenú 1.");
                    break;
                case 2:
                    System.out.println("Ha elegido la opción 2 del submenú 1.");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción del 1 al 3.");
                    break;
            }
        }
    }

    private static void menuSubmenu2() {
        boolean salir = false;

        while (!salir) {
            System.out.println("----- SUBMENÚ 2 -----");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Volver al menú principal");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ha elegido la opción 1 del submenú 2.");
                    break;
                case 2:
                    System.out.println("Ha elegido la opción 2 del submenú 2.");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción del 1 al 3.");
                    break;
            }
        }
    }
}



public class Menu2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    opcion1();
                    break;
                case 2:
                    opcion2();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }

    public static void opcion1() {
        Scanner scanner = new Scanner(System.in);
        int subopcion;

        do {
            System.out.println("Submenú de la opción 1");
            System.out.println("1. Subopción 1");
            System.out.println("2. Subopción 2");
            System.out.println("3. Volver al menú principal");
            System.out.print("Ingrese una opción: ");
            subopcion = scanner.nextInt();

            switch (subopcion) {
                case 1:
                    System.out.println("Ejecutando la subopción 1");
                    break;
                case 2:
                    System.out.println("Ejecutando la subopción 2");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (subopcion != 3);
    }

    public static void opcion2() {
        Scanner scanner = new Scanner(System.in);
        int subopcion;

        do {
            System.out.println("Submenú de la opción 2");
            System.out.println("1. Subopción 1");
            System.out.println("2. Subopción 2");
            System.out.println("3. Volver al menú principal");
            System.out.print("Ingrese una opción: ");
            subopcion = scanner.nextInt();

            switch (subopcion) {
                case 1:
                    System.out.println("Ejecutando la subopción 1");
                    break;
                case 2:
                    System.out.println("Ejecutando la subopción 2");
                    break;
                case 3:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (subopcion != 3);
    }
}


public class Menu3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            ejecutarOpcion(opcion);
        } while (opcion != 4);

        scanner.close();
    }
    
    public static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("4. Salir");
        System.out.print("Ingrese una opción: ");
    }
    
    public static void ejecutarOpcion(int opcion) {
        switch(opcion) {
            case 1:
                submenu1();
                break;
            case 2:
                submenu2();
                break;
            case 3:
                submenu3();
                break;
            case 4:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
        }
    }
    
    public static void submenu1() {
        System.out.println("Submenú 1");
        // Código de la opción 1
    }
    
    public static void submenu2() {
        System.out.println("Submenú 2");
        // Código de la opción 2
    }
    
    public static void submenu3() {
        System.out.println("Submenú 3");
        // Código de la opción 3
    }
}
