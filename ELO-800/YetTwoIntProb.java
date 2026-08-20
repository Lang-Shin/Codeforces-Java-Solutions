import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YetTwoIntProb {

    static long minNumOfMoves(long a, long b) {
        long result = Math.abs(a-b);

        long lastDigit = result % 10;
        result /= 10;

        return (lastDigit==0) ? result : result+1;
    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());

            sb.append(minNumOfMoves(a, b) + "\n");
        }

        System.out.println(sb);

    }
}
