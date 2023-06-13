package Repaso3Ev.Ej4;

public class DadoTester {
    public static void main(String[] args) {
        Dado[] dados = new Dado[4];

        // Inicializar los dados
        dados[0] = new Dado();
        dados[1] = new Dado(4);
        dados[2] = new Dado(3, 8);
        dados[3] = new Dado(2);

        // Realizar lanzamientos de los dados
        for (int i = 0; i < 4; i++) {
            System.out.println("---");
            for (int j = 0; j < dados[i].getCaraSuperior(); j++) {
                System.out.print("o ");
            }
            System.out.println();
            for (int j = dados[i].getCaraSuperior(); j < dados[i].getCaras(); j++) {
                System.out.print("o ");
            }
            System.out.println();
        }
        System.out.println("---");
    }
}
       /* 
        // Realizar lanzamientos de los dados
        for (int i = 1; i <= 5; i++) {
            System.out.println("Lanzamiento " + i + ":");

            for (Dado dado : dados) {
                dado.tirarDado();
                System.out.println(dado);
            }

            System.out.println();
        }
    }
}

  */

