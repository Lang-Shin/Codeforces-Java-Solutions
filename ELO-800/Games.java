// 268A - Games

import java.util.Scanner;

public class Games{

    static int hostGuessUni(int[] h, int[] a) {

        int guess = 0;

        for(int i = 0; i < h.length; i++) {
            int homeJersey = h[i];

            for(int j = 0; j < a.length; j++) {
                if(homeJersey == a[j]) guess++;
            }
        }

        return guess;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] h = new int[n];
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            h[i] = s.nextInt();
            a[i] = s.nextInt();
        }

        System.out.println(hostGuessUni(h, a));

        s.close();

    }
}