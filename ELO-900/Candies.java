import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Candies {

    static int numOfCandies(long n) {

        int x = 1;
        int k = 1;
        long output = 0;

        while(output != n) {

            output = 0;
            k = 1;

            while(output < n) {
                output = output + ((1L << (k-1)) * x);
                k++;
            }

            if((output == n) && (k > 1)) break;
            x++;

        }

        return x;

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < t; i++) {
            long n = Long.parseLong(br.readLine());

            sb.append(numOfCandies(n) + "\n");
        }

        System.out.println(sb);
        
    }
}
