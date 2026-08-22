import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class HolidayEqual {

    static int minBurlesToSpread(int[] a) {

        int max = Arrays.stream(a).max().getAsInt();
        int burles = 0;

        for(int i = 0; i < a.length; i++) {
            burles += Math.abs(a[i] - max);
        }

        return burles;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

        System.out.println(minBurlesToSpread(a));

    }
}
