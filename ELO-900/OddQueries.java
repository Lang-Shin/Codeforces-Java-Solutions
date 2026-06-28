import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class OddQueries {

    static String oddQuery(int[] prefix, int totalSum, int l, int r, int k) {

        int rangeSum = prefix[r] - prefix[l-1];
        int newTotalSum = totalSum - rangeSum + k * (r-l+1);

        if(newTotalSum%2 == 0) return "No";

        return "Yes";

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st1.nextToken());
            int q = Integer.parseInt(st1.nextToken());

            int[] arr = new int[n];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) arr[j] = Integer.parseInt(st2.nextToken());

            int[] prefix = new int[n+1];
            for(int j = 0; j < n; j++) prefix[j+1] = prefix[j] + arr[j];
            int totalSum = prefix[n];

            for(int m = 0; m < q; m++) {
                StringTokenizer st3 = new StringTokenizer(br.readLine());

                int l = Integer.parseInt(st3.nextToken());
                int r = Integer.parseInt(st3.nextToken());
                int k = Integer.parseInt(st3.nextToken());

                System.out.println(oddQuery(prefix, totalSum, l, r, k));

            }

        }

    }
}