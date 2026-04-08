package at.spengergasse;

public class App {
    final static boolean[][] werte = {
            {false, false, false, true, true, true, false, false, true, true, false, false},
            {false, true, true, true, false, true, true, true, true, false, false, false},
            {true, false, true, true, false, false, true, true, false, false, true, true},
            {true, false, false, false, true, true, true, false, false, true, true, true},
            {true, true, true, false, false, false, false, true, true, true, false, false},
            {true, true, false, true, true, false, false, true, false, false, true, true},
            {false, false, false, true, false, false, true, false, true, true, true, false},
            {false, false, false, false, false, true, true, true, true, false, false, false}
    };
    private static boolean korrd;

    public static void main(String[] args) {
        int max = 0;
        for (int line = 0; line < werte.length; line++) {
            for (int column = 0; column< werte[line].length; column++) {
                int gr = gebietsgroesse(new Koord(line,column));
                if (gr > max) {
                    max = gr;
                }
            }
        }
        System.out.println(max);
    }

    static int gebietsgroesse(Koord koord) {
        if (!getWert(koord)) return 0;
        // wir sind auf einer wahren stelle
        int count = 1;
        setfalse(koord);
        koord.line -= 1;
        if (valid(koord)) {

        }
                if (line < 0 || line >= werte.length || column < 0 || column >= werte[0].length) {
                    // ungültig
                    continue;
                }
                koord = new Koord(line, column);
                if (!getWert(koord)) continue;
                count += gebietsgroesse(koord);
        return count;
    }

    static void setfalse(Koord koord) {
        werte[koord.line][koord.column] = false;
    }

    static boolean getWert(Koord koord) {
        return werte[koord.line][koord.column];
    }

    static boolean valid(Koord koord) {
        if (koord.line < 0 || koord.line>= werte.length) return false;
        if (koord.column < 0 || koord.column >= werte[koord.line].length) return false;
        return true;
    }
}
