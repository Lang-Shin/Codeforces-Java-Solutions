// 977B - Two-gram

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoGram{

    static String subStrMaxing(int n, String s) {
        int[][] comb = new int[26][26];

        for(int i = 0; i < n-1; i++) {
            int first = s.charAt(i) - 'A';
            int second = s.charAt(i+1) - 'A';
            comb[first][second]++; 
        }

        int maxCount = -1;
        int bestFirst = 0;
        int bestSecond = 0;

        for(int i = 0; i < 26; i++) {
            for(int j = 0; j < 26; j++) {
                if(comb[i][j] > maxCount) {
                    maxCount = comb[i][j];
                    bestFirst = i;
                    bestSecond = j;
                }
            }
        }

        char c1 = (char) (bestFirst + 'A');
        char c2 = (char) (bestSecond + 'A');

        return "" + c1 + c2;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        System.out.println(subStrMaxing(n, s));

    }
}