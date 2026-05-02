// Codeforces Round 1096 (Div. 3)
// 2227A - Koshary
// Estimated ELO : 800 - 900

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Koshary{

    static boolean[] plateOfKoshary(int t, int[] x, int[] y) {

        boolean[] results = new boolean[t];

        for(int i = 0; i < t; i++) {

            int a = x[i]%2;
            int b = y[i]%2;

            if(a == 1 && b == 1) results[i] = false;
            else results[i] = true;

        }

        return results;

    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        int[] x = new int[t];
        int[] y = new int[t];
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        boolean[] results = plateOfKoshary(t, x, y);

        for(int i = 0; i < t; i++) {
            System.out.println(results[i] ? "Yes" : "No");
        }

    }
}