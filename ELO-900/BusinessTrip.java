import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class BusinessTrip {

    static int minMonthToWater(int k, int[] months) {
        Arrays.sort(months);

        int minMonth = 0;
        int result = 0;

        for(int i = months.length-1; i >= 0; i--) {
            if(result >= k) break;
            result += months[i];
            minMonth++;
        }

        return minMonth;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] months = new int[12];
        for(int i = 0; i < 12; i++) months[i] = Integer.parseInt(st.nextToken());

        System.out.println(minMonthToWater(k, months));

    }
}
