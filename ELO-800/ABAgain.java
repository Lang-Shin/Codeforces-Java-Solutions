// 1999A - A+B Again

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ABAgain {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());
            int lastDigit = n%10;
            n /= 10;

            sb.append((n+lastDigit) + "\n");

        }
        System.out.println(sb);
    }
}
