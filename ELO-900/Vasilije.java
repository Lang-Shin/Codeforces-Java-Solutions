// 1878C - Vasilije in Cacak

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Vasilije {

    static StringBuilder isEqualX(long n, long k, long x) {

        StringBuilder sb = new StringBuilder();

        long min_sum = k*(k+1) / 2;
        long max_sum = k*n - k*(k-1) / 2;
        sb.append(((min_sum <= x)&&(x <= max_sum)) ? "YES" : "NO");

        return sb;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());

            System.out.println(isEqualX(n, k, x));
        }

        
    }
}
