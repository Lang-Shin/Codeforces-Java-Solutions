// 1900A - Cover in Water

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoverWater {
    static int totalCovered(int n, String s) {
        int dotCount = 0;
        int longestDot = 0;
        boolean dotContToThree = false;

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.') {
                dotCount++;
                longestDot++;

                if(longestDot >= 3) dotContToThree = true;
            } else longestDot = 0;
        }

        return dotContToThree ? 2 : dotCount;
    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int minFill = totalCovered(n, s);
            sb.append(minFill + "\n");
        }

        System.out.println(sb);
    }
}
