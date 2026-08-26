// 556A - Case of the Zeros and Ones

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CaseZeroOne {

    static int lengthOfBits(int n, String s) {

        int ones = 0;
        int zeros = 0;

        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') ones++;
            else zeros++;
        }

        return (int) Math.abs(ones-zeros);
    
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        System.out.println(lengthOfBits(n, s));
    }
}
