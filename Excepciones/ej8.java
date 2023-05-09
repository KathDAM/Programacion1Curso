/*8.Implementa un programa que pida al usuario un valor entero A utilizando un nextInt() (de
Scanner) y luego muestre por pantalla el mensaje “Valor introducido: ...”. Se deberá tratar la
excepción InputMismatchException que lanza nextInt() cuando no se introduce un entero
válido. En tal caso se mostrará el mensaje “Valor introducido incorrecto”. */

package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;


public class ej8 {
    static int A;
    static int valor=0;
    static Scanner lect = new Scanner(System.in);

    public static void main(String[]args) {


    try{
        System.out.println("Dame un valor entero");
        A = lect.nextInt();
    } catch(InputMismatchException a) {
        System.err.println(correctorInt(null));
    }
    
    System.out.println("Valor introducido: " + A);
 
    }   
    
    public static int correctorInt(String mensaje) {
        boolean repetir = true;

        while (repetir) {
            System.out.println("Valor introducido incorrecto");
            if (repetir = false) {
                System.out.println(mensaje = "Valor introducido : ");
                valor = lect.nextInt();
            }
        }
        lect.nextInt();
        /*do{
            System.out.println(mensaje = "Valor introducido : ");
            try{
                valor = lect.nextInt();
                repetir = false;
            } catch (InputMismatchException a){
                System.out.println("Valor introducido incorrecto");
            }
            lect.nextInt();
            
        } while (repetir);
*/
         return valor;
    }
}

