import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class RemoveSmallest {

    static String removeSmallest(int[] a) {

        Arrays.sort(a);

        if(a.length == 1) return "Yes";

        for(int i = 0 ; i < a.length-1; i++) {
            if(Math.abs(a[i]-a[i+1]) <= 1) continue;
            else return "No";
        }

        return "Yes";

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for(int j = 0; j < n; j++) a[j] = Integer.parseInt(st.nextToken());

            sb.append(removeSmallest(a) + "\n");

        }

        System.out.println(sb);

    }
}
