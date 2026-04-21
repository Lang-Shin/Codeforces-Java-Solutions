// 313A - Ilya and Bank Account

import java.util.Scanner;

public class BankAcc {

    static long removeLDigit(long n) {

        if (n > 0) return n;

        long positiveN = -1 * n;

        if(positiveN >= 10) {

            long lastDigit = positiveN % 10;
            positiveN /= 10;

            long llastDigit = positiveN % 10;
            positiveN /=10;

            if(lastDigit <= llastDigit) return -1*((positiveN*10)+lastDigit);
            else return -1*((positiveN * 10) + llastDigit);

        }

        return 0;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        long n = s.nextLong();

        System.out.println(removeLDigit(n));

        s.close();

    }
}
