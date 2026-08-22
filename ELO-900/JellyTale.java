// 1875A - Jellyfish and Undertale

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JellyTale {

    static long maxTime(long a, long b, long[] x) {

        long overallTimer = b;

        for(int i = 0; i < x.length; i++) {
            overallTimer += Math.min(x[i], a-1);
        }

        return overallTimer;

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st1.nextToken());
            long b = Long.parseLong(st1.nextToken());
            int n = Integer.parseInt(st1.nextToken());

            long[] x = new long[n];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) x[j] = Long.parseLong(st2.nextToken());

            sb.append(maxTime(a, b, x) + "\n");
        }

        System.out.println(sb);

    }
}
