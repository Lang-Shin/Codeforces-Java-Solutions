import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArrColor {

    static String arrColoring(int[] arr) {

        int total = 0;

        for(int i = 0; i < arr.length; i++) total += arr[i];

        return (total%2 == 0) ? "Yes" : "No";

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];

            for(int j = 0; j < n; j++) arr[j] = Integer.parseInt(st.nextToken());

            sb.append(arrColoring(arr) + "\n");
        }

        System.out.println(sb);

    }
}