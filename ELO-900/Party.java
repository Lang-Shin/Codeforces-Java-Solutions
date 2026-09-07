import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Party {

    static int superiorComplexity(int[] emp) {
        int maxDepth = 0;

        for(int i = 0; i < emp.length; i++) {
            int depth = 1;
            int current = i;

            while(emp[current] != -1) {
                current = emp[current] - 1;
                depth++;
            }

            maxDepth = Math.max(maxDepth, depth);
        }

        return maxDepth;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] emp = new int[n];
        for(int i = 0; i < n; i++) emp[i] = Integer.parseInt(br.readLine());

        System.out.println(superiorComplexity(emp));

    }
}
