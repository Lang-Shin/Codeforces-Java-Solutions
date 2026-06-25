// 141A - Amusing Joke

import java.io.BufferedReader;
import java.io.InputStreamReader;
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

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        
        String guess = br.readLine();
        String host = br.readLine();
        String pile = br.readLine();

        boolean prank = pileLetter(guess, host, pile);

        if(prank) System.out.println("YES");
        else System.out.println("NO");


    }
}