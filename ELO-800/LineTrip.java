import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class LineTrip {

    static int minVol(int[] a, int x) {

        int n = a.length;
        int gap;
        int stretched;

        if(n <= 1) {
            gap = a[n-1];
            stretched = 2 * (x-gap);

            return stretched>=gap ? stretched : gap;
        }

        gap = a[n-1] - a[n-2];
        stretched = 2*(x-a[n-1]);

        return stretched>=gap ? stretched : gap;
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

        System.out.println(sb);

    }
}