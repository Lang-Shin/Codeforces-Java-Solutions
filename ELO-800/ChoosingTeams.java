// 432A - Choosing Teams

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class ChoosingTeams {

    static int totalTeams(int k, int[] y) {
        Arrays.sort(y);

        int count = 0; 
        for(int i = 0; i < y.length; i++) {
            if(y[i] + k <= 5) count++;
            else break;
        }
        return count/3;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] y = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int j = 0; j < n; j++) y[j] = Integer.parseInt(st2.nextToken());

        System.out.println(totalTeams(k, y));
    }
}
