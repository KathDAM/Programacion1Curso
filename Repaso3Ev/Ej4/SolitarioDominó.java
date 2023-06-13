package Repaso3Ev.Ej4;

import java.util.ArrayList;

class SolitarioDominó {
    private static final int MAX_NUM = 2;
    public static void main(String[] args) {
        ArrayList<Ficha> mano = generarFichas();
        ArrayList<Ficha> mesa = new ArrayList<>();

        int turno = 1;

        while (!mano.isEmpty()) {
            System.out.println("mano(" + turno + "): " + mano);
            System.out.println("mesa(" + mesa.size() + "): " + mesa);

            Ficha fichaATirar = null;
            int indiceFichaATirar = -1;

            if (mesa.isEmpty()) {
                // Si la mesa está vacía, se tira el doble más grande
                fichaATirar = buscarDobleMasGrande(mano);
                indiceFichaATirar = mano.indexOf(fichaATirar);
            } else {
                // Buscar una ficha que pueda ser colocada en alguno de los extremos
                for (int i = 0; i < mano.size(); i++) {
                    Ficha ficha = mano.get(i);
                    if (puedeColocarse(ficha, mesa)) {
                        fichaATirar = ficha;
                        indiceFichaATirar = i;
                        break;
                    }
                }
            }

            if (fichaATirar != null) {
                mano.remove(indiceFichaATirar);
                mesa.add(fichaATirar);
                turno++;
            } else {
                break; // No se puede tirar ninguna ficha más
            }
        }

        System.out.println("mano(0):");
        System.out.println("mesa(" + mesa.size() + "): " + mesa);
    }
//A partir de aqui lo podemos cambiar a link
    private static ArrayList<Ficha> generarFichas() {
        ArrayList<Ficha> fichas = new ArrayList<>();

        for (int i = 0; i <= MAX_NUM; i++) {
            for (int j = i; j <= MAX_NUM; j++) {
                Ficha ficha = new Ficha(i, j);
                fichas.add(ficha);
            }
        }

        return fichas;
    }

    private static Ficha buscarDobleMasGrande(ArrayList<Ficha> fichas) {
        Ficha dobleMasGrande = null;

        for (Ficha ficha : fichas) {
            if (ficha.esUnDoble()) {
                if (dobleMasGrande == null || ficha.getLado1() > dobleMasGrande.getLado1()) {
                    dobleMasGrande = ficha;
                }
            }
        }

        return dobleMasGrande;
    }

    private static boolean puedeColocarse(Ficha ficha, ArrayList<Ficha> mesa) {
        Ficha primeraFicha = mesa.get(0);
        Ficha ultimaFicha = mesa.get(mesa.size() - 1);

        return ficha.getLado1() == primeraFicha.getLado1()
                || ficha.getLado1() == ultimaFicha.getLado2()
                || ficha.getLado2() == primeraFicha.getLado1()
                || ficha.getLado2() == ultimaFicha.getLado2();
    }
}

/* private static LinkedList<Ficha> generarFichas() {
        LinkedList<Ficha> fichas = new LinkedList<>();

        for (int i = 0; i <= MAX_NUM; i++) {
            for (int j = i; j <= MAX_NUM; j++) {
                Ficha ficha = new Ficha(i, j);
                fichas.add(ficha);
            }
        }

        return fichas;
    }

    private static Ficha buscarDobleMasGrande(LinkedList<Ficha> fichas) {
        Ficha dobleMasGrande = null;

        for (Ficha ficha : fichas) {
            if (ficha.esUnDoble()) {
                if (dobleMasGrande == null || ficha.getLado1() > dobleMasGrande.getLado1()) {
                    dobleMasGrande = ficha;
                }
            }
        }

        return dobleMasGrande;
    }

    private static boolean puedeColocarse(Ficha ficha, ArrayList<Ficha> mesa) {
        Ficha primeraFicha = mesa.get(0);
        Ficha ultimaFicha = mesa.get(mesa.size() - 1);

        return ficha.getLado1() == primeraFicha.getLado1()
                || ficha.getLado1() == ultimaFicha.getLado2()
                || ficha.getLado2() == primeraFicha.getLado1()
                || ficha.getLado2() == ultimaFicha.getLado2();
    }
} */