import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;

public class ICPCBallons {

    static int totalBalloons(int n, String s) {

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        int ballons = 0;
        for(int i = 0; i < n; i++) {
            if(!set.contains(s.charAt(i))) set.add(s.charAt(i));
            else ballons++;
        }

        ballons += set.size()*2;

        return ballons;

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            sb.append(totalBalloons(n, s) + "\n");
        }

        System.out.print(sb);
    }
}
