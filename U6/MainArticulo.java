package U6;

import java.net.SocketTimeoutException;

public class MainArticulo {
    public static void main(String[] args) {

        Articulo a1 = new Articulo("TV",300.0,21,10);
        Articulo a2 = new Articulo("Zapas",30.0,21,5);
        Articulo a3 = new Articulo("Camisa",20.0,21,100);
        
        System.out.println(a1);
        /*System.out.println(a2);
        System.out.println(a3);*/

        a1.vender(0);

        System.out.println(a1);

    }
}
