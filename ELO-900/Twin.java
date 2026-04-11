// 160A - Twins

import java.util.Scanner;
import java.util.stream.*;
import java.util.Arrays;

public class Twin {

    static int numOfCoins(int n, int[] a) {

        Arrays.sort(a);
        int coins = 0;
        int total = 0;

        for(int i = 0; i < n; i++) {

            coins++;
            total += a[a.length-(i+1)];
            a[a.length-(i+1)] = 0;
            int sum = IntStream.of(a).sum();

            if(total > sum) break;
        }

        return coins;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println(numOfCoins(n, a));

        s.close();

    }
}
