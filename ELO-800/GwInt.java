// 1899A - Game with Integers

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GwInt {

    static String winner(int t, int n) {

        if((n%3 != 0) && (n%3 <= 10)) return "First";
        
        return "Second";

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            System.out.println(winner(t, n));
        }

    }
}
