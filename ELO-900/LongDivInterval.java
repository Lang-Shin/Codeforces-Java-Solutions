import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LongDivInterval {

    static int longestDivisorInterval(long n) {
        int k = 1;

        while (n%k == 0) k++;

        return k-1;
    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());

            sb.append(longestDivisorInterval(n) + "\n");
        }

        System.out.println(sb);

    }
}
