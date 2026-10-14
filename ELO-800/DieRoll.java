import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class DieRoll {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a%b);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        int favor = 7 - Math.max(y, w);
        int chances = 6;

        int greatest = gcd(favor, chances);

        System.out.println(favor/greatest + "/" + chances/greatest);

    }
}