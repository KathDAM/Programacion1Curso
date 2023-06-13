package Repaso3Ev.Ej6;

class Casa implements Comparable<Casa> {
    private String tipo;
    private int tamaño;

    public Casa(String tipo, int tamaño) {
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    public int getTamaño() {
        return tamaño;
    }

    @Override
    public int compareTo(Casa otraCasa) {
        return Integer.compare(this.tamaño, otraCasa.getTamaño());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Casa otraCasa = (Casa) obj;
        return tamaño == otraCasa.getTamaño();
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(tamaño);
    }

    @Override
    public String toString() {
        return tipo;
    }
}
