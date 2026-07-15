// 1343A - Candies

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Candies {

    static long numOfCandies(long n) {

        for(int k = 2; k <= 31; k++) {

            long divisor = (1L << k) - 1;

            if(divisor > n) break;

            if(n%divisor == 0) return n / divisor;

        }

        return -1;

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < t; i++) {
            long n = Long.parseLong(br.readLine());

            sb.append(numOfCandies(n) + "\n");
        }

        System.out.println(sb);
        
    }
}
