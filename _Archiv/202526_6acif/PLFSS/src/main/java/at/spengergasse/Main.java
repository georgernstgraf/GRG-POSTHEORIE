package at.spengergasse;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(checkBrackets("{[()]}")); // (a)
        System.out.println(checkBrackets("([)]"));              // (b)
        System.out.println(checkBrackets("((())"));             // (c)
        System.out.println(checkBrackets("(a + [b * {c}])"));   // (d)
        System.out.println(checkBrackets());                  // (e)
        System.out.println(checkBrackets(")test("));            // (f)

    }
    public static boolean checkBrackets() {return true;}
    public static boolean checkBrackets(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        String validChars = "(){}[]";
        String openers = "[({";
        String closers = ")]}";
        HashMap<Character, Character> mymap = new HashMap<>();
        mymap.put('(', ')');
        mymap.put('[', ']');
        mymap.put('{', '}');

        for (char c : input.toCharArray()) {
            String cs = String.valueOf(c);
            if (!validChars.contains(cs)) continue;
            // nur mehr Klammer sind da.

            // TODO 1: Oeffnende Klammern auf den Stack legen
            if (openers.contains(cs)) {
                stack.push(c);
                continue;
            }

            // TODO 2: Bei schliessender Klammer pruefen:
            // wir haben als c / cs nur mehr schließende Klammern
            if (stack.isEmpty()) return false;
            if (!mymap.get(stack.pop()).equals(c)) return false;

            // TODO 3: Am Ende pruefen, ob alle Klammern
            //          geschlossen wurden
            // ... Ihre Loesung ...
        }
        return stack.isEmpty();
    }
}