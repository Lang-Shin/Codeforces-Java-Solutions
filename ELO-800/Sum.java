// 1742A - Sum

import java.util.Scanner;

public class Sum {

    static String[] sumOfTwo(int n, int[] a, int[] b, int[] c) {

        String[] declare = new String[n];

        int greatest = 0;

        for(int i = 0; i < n; i++) {

            if(a[i] > greatest) greatest = a[i];
            if(b[i] > greatest) greatest = b[i];
            if(c[i] > greatest) greatest = c[i];

            if(a[i] + b[i] + c[i] != greatest*2) declare[i] = "NO";
            else declare[i] = "YES";

            greatest = 0;

        }

        return declare;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            b[i] = s.nextInt(); 
            c[i] = s.nextInt();
        }

        for(int i = 0; i < n; i++) {
            System.out.println(sumOfTwo(n, a, b, c)[i]);
        }

        s.close(); 

    }
}
