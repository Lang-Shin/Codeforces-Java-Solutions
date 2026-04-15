// 451A - Game with Sticks

import java.util.Scanner;

public class GStick {

    static String gameWinner(int n, int m) {

        int count = 0;

        while(true) {
            n -= 1;
            m -= 1;

            count++;

            if(n <= 0 || m <= 0) break;
        }

        if(count%2 == 0) return "Malvika";

        return "Akshat";

    }

    public static void main(String[] args)  {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        System.out.println(gameWinner(n, m));

        s.close();

    }
}
