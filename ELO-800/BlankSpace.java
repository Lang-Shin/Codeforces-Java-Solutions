// 1829B - Blank Space

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlankSpace {

    static int consecutiveZero(int[] bits) {

        int cumsum = 0;
        int largest = 0;

        for(int i = 0; i < bits.length; i++) {
            if(bits[i] == 0) {
                cumsum++;
                if(cumsum > largest) largest = cumsum;
            }
            else cumsum = 0;
        }

        return largest;

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] bits = new int[n];

            for(int j = 0; j < n; j++) bits[j] = Integer.parseInt(st.nextToken());
            sb.append(consecutiveZero(bits) + "\n");
        }

        System.out.println("\n\n" + sb);

    } 
}
