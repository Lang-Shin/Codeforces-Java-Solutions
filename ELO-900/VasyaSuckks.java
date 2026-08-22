import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VasyaSuckks {
    
    static int runOutOfSocks(int n, int m) {

        int daysSurvive = 0;

        int i = 1;
        while(true) {
            if(n <= 0) break;
            if(i%m == 0) n++;

            n--;
            daysSurvive++;
            i++;
        }

        return daysSurvive;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        System.out.println(runOutOfSocks(n, m));

    }
}
