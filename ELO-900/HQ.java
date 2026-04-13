// 133A - HQ9+

import java.util.Scanner;

public class HQ {

    static boolean hq9(String p) {

        for(int i = 0; i < p.length(); i++) {
            if(p.charAt(i) == 'H' || p.charAt(i) == 'Q' || p.charAt(i) == '9') return true;
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String p = s.nextLine();

        System.out.println(hq9(p) ? "YES" : "NO");

        s.close();

    }
}
