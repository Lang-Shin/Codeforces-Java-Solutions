import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CFCheck {

    static String codeforces(char c) {

        char[] cfs = {'c', 'o', 'd', 'e', 'f', 'r', 's'};

        for(char cf : cfs) {
            if(c == cf) return "Yes";
        }

        return "No";

    }

    public static void main(String[] args) throws Exception {

        StringBuilder st = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            char c = br.readLine().charAt(0);

            st.append(codeforces(c) + "\n");
        }

        System.out.println(st);

    }
}
