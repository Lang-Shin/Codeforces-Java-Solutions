// 1475A - Odd Divisor

import java.util.Scanner;

public class OddDivisor {

    static String[] oddDivisors(int t, long[] n) {

        String[] isOddDivisors = new String[t];

        for(int i = 0; i < t; i++) {
            long num = n[i];

            while(num%2 == 0) num /= 2;

            if(num > 1) isOddDivisors[i] = "YES";
            else isOddDivisors[i] = "NO";
        }

        return isOddDivisors;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        long[] n = new long[t];

        for(int i = 0; i < t; i++) {
            n[i] = s.nextLong();
        }

        String[] results = oddDivisors(t, n);

        for(int i = 0; i < t; i++) System.out.println(results[i]);

        s.close();

    }
}
