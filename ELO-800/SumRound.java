// 1352A - Sum of Round Numbers

import java.util.Scanner;
import java.util.ArrayList;

public class SumRound{

    static ArrayList<Integer> numOfRounds(int t) {

        ArrayList<Integer> round = new ArrayList<>();

            if(t <= 10) round.add(t);
            else {
                int num = t;
                int multiply = 1;
                while(num > 0) {
                    int lastDigit = num % 10;

                    if(lastDigit != 0) {
                        round.add(lastDigit * multiply);

                        num /= 10;
                        lastDigit = num % 10;
                        multiply *= 10;
                    } else {
                        num /= 10;
                        lastDigit = num % 10;
                        multiply *= 10;
                    }
                }

            }

        return round;

    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] t = new int[n];
        for(int i = 0;  i < n; i++) {
            t[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.println(numOfRounds(t[i]).size());

            for(int j = 0; j < numOfRounds(t[i]).size(); j++) {
                System.out.print(numOfRounds(t[i]).get(j) + " ");
            }
            System.out.println();
        }

        s.close();

    }
}