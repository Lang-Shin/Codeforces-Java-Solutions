// 1878A - How much does a Daytona cost?

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HMDaytona {

    static String daytonaCost(int[] elem, int k) {

        boolean isFound = false;

        for(int i = 0; i < elem.length; i++) if(elem[i] == k) isFound = true;

        if(isFound) return "Yes";

        return "No";

    }

    public static void main(String[] args) throws Exception {
        
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] elem = new int[n];
            for(int j = 0; j < n; j++) elem[j] = Integer.parseInt(st2.nextToken());

            sb.append(daytonaCost(elem, k) + "\n");
        }

        System.out.println(sb);

    }
}
