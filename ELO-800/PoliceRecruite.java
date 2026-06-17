import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class PoliceRecruite {

    static int unsolvedCrime(int[] car) {

        int unsolved = 0;
        int recruited = 0;

        for(int i = 0; i < car.length; i++) {
            if((car[i] == -1) && (recruited == 0)) {
                unsolved++;
                continue;
            } else if((car[i] == -1) && (recruited > 0)) recruited--; 
            else recruited += car[i];

        }

        return unsolved;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] car = new int[n];

        for(int i = 0; i < n; i++) {
            int cor = Integer.parseInt(st.nextToken());

            car[i] = cor;
        }

        System.out.println(unsolvedCrime(car));
    }
}