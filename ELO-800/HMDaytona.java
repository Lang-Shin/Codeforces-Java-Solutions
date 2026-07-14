import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// import java.util.LinkedHashSet;

public class HMDaytona {

    static String daytonaCost(int[] elem, int k) {

        // LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        boolean isFound = false;

        for(int i = 0; i < elem.length; i++) {

            if(elem[i] == k) isFound = true;

            // lhs.add(elem[i]);
        }

        // if(lhs.size() < elem.length) return "Yes";
        if(isFound) return "Yes";

        return "No";

    }

    public static void main(String[] args) throws Exception {
        
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int[] elem = new int[n];
            for(int j = 0; j < n; j++) elem[j] = Integer.parseInt(st2.nextToken());

            sb.append(daytonaCost(elem, k) + "\n");
        }

        System.out.println(sb);

    }
}
