import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SPNeither {

    static String stairPeakNeither(int a, int b, int c) {
        if(a < b && b < c) return "STAIR";
        else if (a < b && b > c) return "PEAK";
        else return "NONE";
    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            sb.append(stairPeakNeither(a, b, c)).append("\n");

        }
        System.out.print(sb);
    }
}
