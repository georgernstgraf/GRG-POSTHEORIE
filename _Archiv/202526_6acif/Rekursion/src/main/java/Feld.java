import java.util.LinkedList;
import java.util.Queue;

public class Feld {

    private boolean[][] feld;
    private static int zaehler;
    private Queue<Knoten> warteschlange;


    public Feld() {
        feld = new boolean[][]{


                {false ,false ,false ,true ,true ,true ,false ,false ,true ,true ,false , false },
                {false ,true ,true ,true ,false ,true ,true ,true ,true ,false ,false , false },
                {true ,false ,true ,true ,false ,false ,true ,true ,false ,false ,true , true },
                {true ,false ,false ,false ,true ,true ,true ,false ,false ,true ,true , true },
                {true ,true ,true ,false ,false ,false ,false ,true ,true ,true ,false , false },
                {true ,true ,false ,true ,true ,false ,false ,true ,false ,false ,true , true },
                {false ,false ,false ,true ,false ,false ,true ,false ,true ,true ,true , false },
                {false ,false ,false ,false ,false ,true ,true ,true ,true ,false ,false , false }

        };
        warteschlange = new LinkedList<>();
    }
    public void findeNachbarknoten(Knoten k){

        if (k.getSpalte() < feld[0].length-1 && feld[k.getZeile()][k.getSpalte()+1]){
            feld[k.getZeile()][k.getSpalte()+1] = false;
            zaehler++;
            warteschlange.add(new Knoten(k.getZeile(),k.getSpalte()+1));
        }
        //

        if (k.getZeile() < feld.length-1 && feld[k.getZeile()+1][k.getSpalte()]){
            feld[k.getZeile()+1][k.getSpalte()] = false;
            zaehler++;
            warteschlange.add(new Knoten(k.getZeile()+1,k.getSpalte()));
        }
        if (k.getSpalte() > 0 && feld[k.getZeile()][k.getSpalte()-1]){
            feld[k.getZeile()][k.getSpalte()-1] = false;
            zaehler++;
            warteschlange.add(new Knoten(k.getZeile(),k.getSpalte()-1));
        }
        if (k.getZeile() > 0 && feld[k.getZeile()-1][k.getSpalte()]){
            feld[k.getZeile()-1][k.getSpalte()] = false;
            zaehler++;
            warteschlange.add(new Knoten(k.getZeile()-1,k.getSpalte()));
        }
    }
    public int maxBaum(){
        Knoten k;
        int max = 0;
        for (int zeile = 0; zeile < feld.length; zeile++){
            for (int spalte = 0; spalte < feld[0].length; spalte++){
                if (feld[zeile][spalte]){
                    zaehler = 1;
                    feld[zeile][spalte] = false;
                    findeNachbarknoten(new Knoten(zeile,spalte));
                   // System.out.println(Arrays.deepToString(feld));
                    //System.out.println(zaehler);
                   // System.out.println(warteschlange);
                    while (!warteschlange.isEmpty()){

                        k = warteschlange.poll();// poll=Älertste
                        //System.out.println(warteschlange);


                        findeNachbarknoten(k);
                        //System.out.println(Arrays.deepToString(feld));
                    }
                    if (zaehler > max){
                        System.out.println("-------zähler: " + zaehler);
                        max = zaehler;
                    }

                }
            }
        }

        return max;
    }
    public static void main(String[] args) {
        Feld feld = new Feld();
        System.out.println(feld.maxBaum());
    }
}
