import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeAP {

    static String isAP(double a, double b, double c) {

        double m1, m2, m3;

        m1 = (a+c) / (2*b);
        m2 = (2*b-c) / a;
        m3 = (2*b-a) / c;

        if((m1%1==0 && m1>0) || (m2%1==0 && m2>0) || (m3%1==0 && m3>0)) return "Yes";

        return "No";

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());

            System.out.println(isAP(a, b, c));
        }


    }
}
