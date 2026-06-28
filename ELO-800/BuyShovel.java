// 732A - Buy a Shovel

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuyShovel {

    static int numOfShovel(int k, int r) {

        int shovel = 1;

        while(true) {

            if(((k*shovel)%10 == 0) || (((k*shovel)-r)%10 == 0)) break;

            shovel++;

        }

        return shovel;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int shovel = numOfShovel(k, r);
        System.out.println(shovel);

    }
}
