import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HalloumiBox {

    static String halloumiBoxes(int[] arr, int k) {

        if(k >= 2) return "Yes";
        
        for(int i = 0; i < arr.length-1; i++) {

            if(arr[i] <= arr[i+1]) continue;
            else return "No";

        }

        return "Yes";

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < t; i++) {

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());

            int[] arr = new int[n];
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) arr[j] = Integer.parseInt(st2.nextToken());

            sb.append(halloumiBoxes(arr, k) + "\n");
        }

        System.out.println(sb);
    }
}
