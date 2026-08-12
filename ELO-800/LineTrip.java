import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class LineTrip {

    static int minVol(int[] a, int x) {
        int n = a.length;

        if(a.length <= 1) return a[0];

        int point = a[n-1] - a[n-2];
        int max = x-point;

        return max;
    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int[] a = new int[n];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) a[j] = Integer.parseInt(st2.nextToken());

            sb.append(minVol(a, x) + "\n");
        }

        System.out.println("\n\n" + sb);

    }
}