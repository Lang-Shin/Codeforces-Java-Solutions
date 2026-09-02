// 1873A - Short Sort

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShortSort {

    static String swapTwoCards(String cards) {

        return (('a' != cards.toCharArray()[0]) && ('b' != cards.toCharArray()[1]) && ('c' != cards.toCharArray()[2])) ? "NO" : "YES";

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String cards = br.readLine();

            sb.append(swapTwoCards(cards) + "\n");
        }

        System.out.println(sb);
    }
}
