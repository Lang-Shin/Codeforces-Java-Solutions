// 318A - Even Odds

import java.util.Scanner;

public class EvenOdds {

    static long target(long n, long k) {

        long oddCount = (n+1) / 2;

        if(k <= oddCount) return 2 * k - 1;
        else return 2 * (k - oddCount);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        long n = s.nextLong();
        long k = s.nextLong();

        System.out.println(target(n, k));

        s.close();

    }
}
