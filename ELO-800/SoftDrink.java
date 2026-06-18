// 151A - Soft Drinking

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SoftDrink {

    static int totalToast(int n, int k, int l, int c, int d, int p, int nl, int np) {

        int nlOfDrink = (k * l) / nl;
        int totalSlice = c * d;
        int npOfSalt = p / np;

        return Math.min(nlOfDrink, Math.min(totalSlice, npOfSalt)) / n;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int nl = Integer.parseInt(st.nextToken());
        int np = Integer.parseInt(st.nextToken());

        System.out.println(totalToast(n, k, l, c, d, p, nl, np));

    }
}
