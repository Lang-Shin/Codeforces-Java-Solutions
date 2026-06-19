import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ILoveUser {

    static int amazingScore(int n, int[] points) {

        int amazingTen = 0;

        int score = 0;
        int health = 2;

        for(int i = 1; i < points.length; i++) {

            int cScore = points[i];

            if(cScore > score) {

                if(health < 1) {
                    amazingTen++;
                    health = 2;
                }

                amazingTen++;
                score = cScore;
            } else if(cScore < score) health--;
        }

        return amazingTen;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] points = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) points[i] = Integer.parseInt(st.nextToken());

        System.out.println(amazingScore(n, points));

    }
}
