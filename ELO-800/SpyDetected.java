import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SpyDetected {

    static int indicesOfDiff(int[] a) {
        int num = (a[0] == a[1]) ? a[0] : a[2];

        for(int i = 0; i < a.length; i++) {
            if(a[i] != num) return (i+1);
        }

        return -1;

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            int[] a = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) a[j] = Integer.parseInt(st.nextToken());

            sb.append(indicesOfDiff(a) + "\n");
        }

        System.out.println(sb);

    }
}
