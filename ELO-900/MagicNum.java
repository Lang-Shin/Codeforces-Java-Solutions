// 320A - Magic Numbers

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MagicNum {
    
    static String isMagic(int n) {
        int chance = 2;
        while((n > 0) && (chance >= 0)) {
            int lastDigit = n%10;
            if(lastDigit == 1) {
                chance = 2;
                n /= 10;
            } else if(lastDigit == 4) {
                chance--;
                n /= 10;
            } else return "NO";
        }

        return ((n==0) && (chance==2)) ? "YES" : "NO";

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(isMagic(n));

    }
}
