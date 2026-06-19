// 750A - New Year and Hurry

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NYHurry {

    static int numOfProb(int n, int k) {

        int totalProbs = 0;
        int timeAvail = 240 - k;

        for(int i = 0; i < n; i++) {

            int timeTook = 5 * (i+1);
            timeAvail -= timeTook;
            if(timeAvail >= 0) totalProbs++;
            else break;

        }

        return totalProbs;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(numOfProb(n, k));

    }
}
