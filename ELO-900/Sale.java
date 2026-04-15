// 34B - Sale

import java.util.Scanner;
import java.util.Arrays;

public class Sale {

    static int sumOfMoney(int n, int m, int[] a) {

        int earnings = 0;

        Arrays.sort(a);

        for(int i = 0; i < n; i++) {

            if(m == 0) break;

            if(a[i] >= 0) continue;

            earnings = earnings + (a[i] * -1);
            m--;

        }

        return earnings;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println(sumOfMoney(n, m, a));

        s.close();

    }
}
