// 141A - Amusing Joke

import java.util.Scanner;
import java.util.Arrays;

public class AmusingJoke {

    static boolean pileLetter(String guess, String host, String pile) {

        char[] pileArr = pile.toCharArray();
        Arrays.sort(pileArr);
        String newPile = new String(pileArr);

        String combine = guess + host;
        char[] combineArr = combine.toCharArray();
        Arrays.sort(combineArr);
        String newCombine = new String(combineArr);

        if(newCombine.equals(newPile)) return true;

        return false;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String guess = s.nextLine();
        String host = s.nextLine();
        String pile = s.nextLine();

        boolean prank = pileLetter(guess, host, pile);

        if(prank) System.out.println("YES");
        else System.out.println("NO");

        s.close();

    }
}