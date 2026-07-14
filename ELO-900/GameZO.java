import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GameZO {

    static String winner(String bit) {

        char[] bits = bit.toCharArray();

        int zeros = 0;
        int ones = 0;

        for(int i = 0; i < bits.length; i++) {
            if(bits[i] == '0') zeros++;
            else ones++;
        }

        int min = Math.min(zeros, ones);

        return min%2 == 0 ? "NET" : "DA";

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < t; i++) {
            String bit = br.readLine();

            sb.append(winner(bit) + "\n");
        }

        System.out.println(sb);

    }   
}
