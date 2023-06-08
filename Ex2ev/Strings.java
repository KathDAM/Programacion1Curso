package Ex2ev;
    
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        // variables
        String nom, ap1, ap2, codigoUsuario;

        // Creamos Scanner
        Scanner in = new Scanner(System.in);
        
        // Pedimos nombre y apellidos
        System.out.print("Nombre: ");
        nom = in.nextLine();
        System.out.print("Apellido 1: ");
        ap1 = in.nextLine();
        System.out.print("Apellido 2: ");
        ap2 = in.nextLine();
        
        // Obtenemos el código de usuario
        codigoUsuario = nom.substring(0,3);
        codigoUsuario += ap1.substring(0, 3);
        codigoUsuario += ap2.substring(0, 3);
        
        // Convertimos a mayúsculas
        codigoUsuario = codigoUsuario.toUpperCase();
        
        // Mostramos código de usuario
        System.out.println("Código de usuario: " + codigoUsuario);
        
    //-----------------------------------------------------------------------------------------

     // variables
     String texto;
     // número de vocales de cada tipo
     int na = 0, ne = 0, ni = 0, no = 0, nu = 0;
     
     // Pedimos texto
     System.out.print("Introduce un texto: ");
     texto = in.nextLine();
     
     // Convertimos a mayúsculas para no diferencias
     // entre vocales mayúsculas y minúsculas
     texto = texto.toUpperCase();
     
     // Recorremos el texto buscando y contando vocales
     for (int i = 0; i < texto.length(); i++) {
         char c = texto.charAt(i);
         switch (c) {
             case 'A':
                 na++;
                 break;
             case 'E':
                 ne++;
                 break;
             case 'I':
                 ni++;
                 break;
             case 'O':
                 no++;
                 break;
             case 'U':
                 nu++;
                 break;
         }
     }
     
     // Mostramos nº de vocales de cada tipo
     System.out.println("Nº de A: " + na);
     System.out.println("Nº de E: " + ne);
     System.out.println("Nº de I: " + ni);
     System.out.println("Nº de O: " + no);
     System.out.println("Nº de U: " + nu);


//-----------------------------------------------------------------------------------------


        // variables
        String frase, palabra;

        // Pedimos frase y palabra
        System.out.print("Introduce una frase F: ");
        frase = in.nextLine();
        System.out.print("Introduce una palabra P: ");
        palabra = in.nextLine();

        // Si F contiene P, comprobamos también si empieza o termina por P
        if (frase.indexOf(palabra) >= 0) {
            
            System.out.println("F contiene P");
            
            if (frase.startsWith(palabra))
                System.out.println("F empieza por P");
            else
                System.out.println("F NO empieza por P");

            if (frase.endsWith(palabra))
                System.out.println("F termina por P");
            else
                System.out.println("F NO termina por P");
        }
        // Si NO contiene P, seguro que tampoco empieza ni termina
        else {
            System.out.println("F NO contiene P => tampoco empieza ni termina por P");
        }

//-----------------------------------------------------------------------------------------


        // Variables
        String f, p1, p2;

        // Pedimos frase y dos palabras
        System.out.print("Introduce frase F: ");
        f = in.nextLine();
        System.out.print("Introduce palabra P1: ");
        p1 = in.nextLine();
        System.out.print("Introduce palabra P2: ");
        p2 = in.nextLine();
        
        // Mostramos F tras sustituir P1 por P2
        System.out.println(f.replace(p1, p2));
        
//-----------------------------------------------------------------------------------------

 // Variables
 String p;
 int pos = 0;
 int contador = 0;

 // Pedimos frase y palabra
 System.out.print("Introduce frase F: ");
 f = in.nextLine();
 System.out.print("Introduce palabra P: ");
 p = in.nextLine();

 // Bucle que busca todas las ocurrencias de P en F
 do {
     // Busca 'p' a partir de la posicion 'pos'
     pos = f.indexOf(p, pos);
     
     // Si lo ha encontrado, actualizamos contador y posicion
     if (pos >= 0) {
         contador++;
         pos++;
     }
 } while (pos != -1);

 // Mostramos cuantas veces aparece
 System.out.println("P aparece " + contador + " veces");

//-----------------------------------------------------------------------------------------


// Pedimos frase con 2 palabras
System.out.print("Introduce frase con 2 palabras: ");
f = in.nextLine();

// Buscamos la posición donde está el espacio
pos = f.indexOf(" ");

// Mostramos subcadena desde 0 hasta pos
System.out.println(f.substring(0, pos));

// Mostramos subcadena desde pos+1 hasta el final
System.out.println(f.substring(pos + 1, f.length()));


//-----------------------------------------------------------------------------------------

 // Pedimos frase
 System.out.print("Introduce frase: ");
 f = in.nextLine();

 // Recorremos los caracteres de F, mostrándolos uno a uno.
 // Si encontramos un espacio imprimimos nueva línea
 for (int i = 0; i < f.length(); i++) {
     char c = f.charAt(i);
     if (c == ' ')
         System.out.println("");
     else
         System.out.print(c);
 }

//-----------------------------------------------------------------------------------------


        // Variables
        boolean palindromo;

      
        // Pedimos frase
        System.out.print("Introduce frase: ");
        f = in.nextLine();

        // Pasamos frase a mayúsculas y quitamos espacios
        f = f.toUpperCase();
        f = f.replace(" ", "");
        
        // Comprobamos si es un palíndromo recorriendo el texto y comparando
        // el primer char con el último, el segundo char con el penúltimo, etc.
        palindromo = true;
        for (int i = 0; i < f.length()/2; i++) {
            // Comparamos el char de la posición i con el
            // char en la posición i desde el final
            if (f.charAt(i) != f.charAt(f.length() - i - 1))
                palindromo = false;
        }
        
        // Mostramos si es un palíndromo o no
        if (palindromo)
            System.out.println("¡Es un palíndromo!");
        else
            System.out.println("No es un palíndromo :(");
        
    //----Hay otra forma de hacerlo--------

         // Variables
         String fInv = "";

         // Pedimos frase
         System.out.print("Introduce frase: ");
         f = in.nextLine();
 
         // Pasamos frase a mayúsculas y quitamos espacios
         f = f.toUpperCase();
         f = f.replace(" ", "");
         
         // Obtenemos el inverso de f. Ejemplo: HOLA => ALOH
         for (int i = 0; i < f.length(); i++) {
             fInv = f.charAt(i) + fInv;
         }
         
         // Comparamos si f es igual que su inverso
         palindromo = f.equals(fInv);
         
         // Mostramos si es un palíndromo o no
         if (palindromo)
             System.out.println("¡Es un palíndromo!");
         else
             System.out.println("No es un palíndromo :(");
           

//-----------------------------------------------------------------------------------------



//-----------------------------------------------------------------------------------------


//-----------------------------------------------------------------------------------------




//-----------------------------------------------------------------------------------------








//-----------------------------------------------------------------------------------------




 }





















}
