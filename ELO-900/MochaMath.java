import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MochaMath {

    static int bitAndOpe(int[] a) { 
        int result = a[0];

        for(int i = 1; i < a.length; i++) result &= a[i];

        return result;
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

            sb.append(bitAndOpe(a) + "\n");
        }

        System.out.println(sb);

    }
}
