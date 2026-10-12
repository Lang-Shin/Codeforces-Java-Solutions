// 1858A - Buttons

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Buttons {

    static String winner(int a, int b, int c) {
        int shared = c%2;
        if(shared == 1) b -= 1;

        return (a > b) ? "First" : "Second";
    }

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append(winner(a, b, c) + "\n");
        }
        System.out.print(sb);
    }
}
