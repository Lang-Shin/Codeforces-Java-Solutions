import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrepApp {

    static int stripBin(int n, String s) {
        char[] bins = s.toCharArray();
        boolean shouldContinue = true;

        int i = 0;
        int endI = bins.length-1;
        while(shouldContinue) {
            if((bins.length < 2) || (n <= 2)) shouldContinue=false;

            if((bins[i] == '0' && bins[endI]=='1') || (bins[i] == '1' && bins[endI] == '0')) {
                n-=2;
                i++;
                endI--;
            } else shouldContinue = false;
        }

        return n;
    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();

            sb.append(stripBin(n, s) + "\n");
        }

        System.out.println(sb);

    }
}
