import java.util.Scanner;

public class CandiesSister{

    static long[] numOfDistribution(long[] candies, int n) {

        long[] distributions = new long[n];

        for(int i = 0; i < n; i++) {
            if(candies[i] <= 2) distributions[i] = 0;
            else {
                long totalDistribute = Math.round(candies[i] / 2.0) - 1;
                distributions[i] = totalDistribute;
            }
        }

        return distributions;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        long[] candies = new long[n];

        for(int i = 0; i < candies.length; i++) {
            candies[i] = s.nextLong();
        }

        for(int i = 0; i < n; i++) {
            System.out.println(numOfDistribution(candies, n)[i]);
        }

        s.close();

    }
}