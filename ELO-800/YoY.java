// 1703A - Yes or Yes?

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YoY {

    static boolean charac(String s) {

        String newS = s.toLowerCase();

        if(newS.equals("yes")) return true;
        else return false;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            String s = br.readLine();

            if(charac(s)) System.out.println("YES");
            else System.out.println("NO");

        }

    }
}
