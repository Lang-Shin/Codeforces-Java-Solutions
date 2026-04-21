// 1850D - Balanced Round

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;

public class BalanceRound {

    static int balancedProbs(int n, int k, int[] a) {

        if(n <= 1) return 0;

        Arrays.sort(a);

        ArrayList<ArrayList<Integer>> probSets = new ArrayList<>();
        int set = 0;
        boolean isAdded = false;

        probSets.add(new ArrayList<Integer>());

        for(int i = 0; i < n-1; i++) {
            if(Math.abs(a[i] - a[i+1]) <= k) {
                
                if(!isAdded) {
                    probSets.get(set).add(a[i]);
                    probSets.get(set).add(a[i+1]);

                    isAdded = true;
                } else {
                    probSets.get(set).add(a[i+1]);
                }

            } else {

                if(probSets.get(set).size() > 0) {
                    set++;
                    isAdded = false;
                    probSets.add(new ArrayList<Integer>());
                }

            }
        }

        int max = 0;
        for(ArrayList<Integer> row : probSets) {
            if(row.size() > max) max = row.size();
        }

        return  n - max;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        for(int i = 0; i < t; i++)  {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for(int j = 0; j < n; j++) a[j] = Integer.parseInt(st2.nextToken());

            System.out.println(balancedProbs(n, k, a));

        }

    }
}
