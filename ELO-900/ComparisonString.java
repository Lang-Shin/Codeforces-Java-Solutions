// 1837B - Comparison String

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ComparisonString {

    static int totalCost(int n, String s) {

        char[] operator = s.toCharArray();
        int peak = 1;
        int cumsum = 1 ;
        
        for(int i = 0; i < n-1; i++) {
            if(operator[i] == operator[i+1]){
                cumsum++;
                if(cumsum > peak) peak = cumsum;
            }
            else cumsum=1;

        }
        return peak+1;

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            sb.append(totalCost(n, s) + "\n");
        }

        System.out.println(sb);

    }
}
