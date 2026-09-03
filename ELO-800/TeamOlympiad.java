// 490A - Team Olympiad

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class TeamOlympiad {

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] t = new int[n];
        for(int i = 0; i < n; i++) t[i] = Integer.parseInt(st.nextToken());

        ArrayList<Integer> ones = new ArrayList<>();
        ArrayList<Integer> twos = new ArrayList<>();
        ArrayList<Integer> threes = new ArrayList<>();

        for(int i = 0; i < t.length; i++) {
            if(t[i] == 1) ones.add(i+1);
            else if(t[i] == 2) twos.add(i+1);
            else if(t[i] == 3) threes.add(i+1);
        }

        if(ones.size() == 0 || twos.size() == 0 || threes.size() == 0) System.out.println(0);
        else {
            int totalGroup = Math.min(ones.size(), Math.min(twos.size(), threes.size()));

            for(int i = 0; i < totalGroup; i++) {
                sb.append(ones.get(i) + " " + twos.get(i) + " " + threes.get(i) + "\n");
            }

            System.out.println(totalGroup);
            System.out.println(sb);
        }

    }   
}
