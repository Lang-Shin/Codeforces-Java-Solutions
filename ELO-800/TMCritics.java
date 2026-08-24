// 1850A - To My Critics

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TMCritics {

    static String isGreaterTen(int a, int b, int c) {

        return ((a+b >= 10) || (a+c >= 10) || (b+c >= 10)) ? "Yes" : "No";

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append(isGreaterTen(a, b, c) + "\n");
        }

        System.out.println(sb);

    }
}
