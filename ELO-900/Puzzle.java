// 337A - Puzzles

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Puzzle {

    static int puzzles(int n, int m, int[] f) {

        Arrays.sort(f);

        ArrayList<Integer> lists = new ArrayList<>();

        for(int i = 0; i < m-n+1; i++) {
            int leastDif = f[i+(n-1)] - f[i];
            lists.add(leastDif);
        }

        int min = Collections.min(lists);

        return min;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        int[] f = new int[m];

        for(int i = 0; i < m; i++) {
            f[i] = s.nextInt();
        }

        System.out.println(puzzles(n, m, f));

        s.close();

    }
}