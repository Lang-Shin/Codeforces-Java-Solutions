// 318A - Even Odds

import java.util.Scanner;

public class EvenOdds {

    static int target(int n, int k) {

        int[] nums = new int[n];
        int c = 0;

        for(int i = 1; i <= n; i+=2) {
            nums[c] = i;
            c++;
        }
        for(int i = 2; i <= n; i+=2) {
            nums[c] = i;
            c++;
        }

        return nums[k-1];

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int k = s.nextInt();

        System.out.println(target(n, k));

        s.close();

    }
}
