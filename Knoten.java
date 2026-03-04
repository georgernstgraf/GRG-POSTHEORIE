public class Knoten {
    private int zeile;
    private int spalte;

    public Knoten(int zeile, int spalte) {
        setZeile(zeile);
        setSpalte(spalte);
    }

    public int getZeile() {
        return zeile;
    }

    public void setZeile(int zeile) {
        this.zeile = zeile;
    }

    public int getSpalte() {
        return spalte;
    }

    public void setSpalte(int spalte) {
        this.spalte = spalte;
    }
    public String toString() {
        return zeile + " " + spalte;
    }
}
