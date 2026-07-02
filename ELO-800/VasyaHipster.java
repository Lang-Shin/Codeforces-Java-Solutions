import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VasyaHipster {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int diff, pair;
        if(a < b) {
            diff = a;
            pair = (b-diff) / 2;

            System.out.println(diff + " " + pair);
        } else if(a > b) {
            diff = b;
            pair = (a-diff) / 2;

            System.out.println(diff + " " + pair);
        } else System.out.println(a + " " + 0);


    }
}
