import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ILoveUser {

    static int amazingScore(int n, int[] points) {

        int amazingTen = 0;
    
        int best = points[0], worst = points[0];

        for(int i = 1; i < points.length; i++) {

            if(points[i] > best) {

                amazingTen++;
                best = points[i];

            } else if(points[i] < worst) {

                amazingTen++;
                worst = points[i];

            }

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
