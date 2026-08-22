import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JellyTale {

    static int maxTime(int a, int b, int[] x) {

        int overallTimer = b;

        for(int i = 0; i < x.length; i++) {
            if(x[i] > a) continue;

            overallTimer += x[i];
        }

        return (a+overallTimer) -1;

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());
            int n = Integer.parseInt(st1.nextToken());

            int[] x = new int[n];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) x[j] = Integer.parseInt(st2.nextToken());

            sb.append(maxTime(a, b, x) + "\n");
        }

        System.out.println(sb);

    }
}
