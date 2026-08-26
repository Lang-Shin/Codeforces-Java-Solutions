import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeItIncrease {

    static int minNumOfOperation(int n, int[] a) {
        int operation = 0;
        if(n == 1) return 0;

        if(a[a.length-1] == 1) return -1;

        int i = 0;
        while(true) {
            if(a[i] >= a[i+1]) {
                a[i] /= 2;
                operation++;
                i = 0;
            } else {
                if(i == a.length-2) break;
                i++;
            }
        }

        return operation;
    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for(int j = 0; j < n; j++) a[j] = Integer.parseInt(st.nextToken());

            sb.append(minNumOfOperation(n, a) + "\n");
        }

        System.out.println(sb);

    }
}
