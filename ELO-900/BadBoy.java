// 1537B - Bad Boy

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BadBoy {

    static int[] coordPos(int n, int m, int i, int j) {

        // i and j, which is Anton's position doesnt really matter.
        // opposite corners
        return new int[] {1, 1, n, m};

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int c = 0; c < t; c++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int[] coords = coordPos(n, m, i, j);
            for(int d = 0; d < 4; d++) sb.append(coords[d] + " ");
            sb.append("\n");
        }

        System.out.println(sb);

    }
}
