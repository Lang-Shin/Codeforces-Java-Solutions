// 96A - Football

import java.util.Scanner;

public class Football {

    static boolean Danger(String bin) {

        int zeroCount = 0;
        int oneCount = 0;

        for(int i = 0; i < bin.length(); i++) {

            if(bin.charAt(i) == '0') {
                zeroCount++;
                oneCount = 0;

                if(zeroCount == 7) return true;
            } else if(bin.charAt(i) == '1') {
                oneCount++;
                zeroCount = 0;

                if(oneCount == 7) return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String bin = s.nextLine();

        if(Danger(bin)) System.out.println("YES");
        else System.out.println("NO");

        s.close();

    }
}
