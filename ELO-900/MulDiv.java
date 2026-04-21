// 1374B - Multiply by 2, divide by 6

import java.util.Scanner;

public class MulDiv {

    static int[] numOfMoves(int t, int[] n) {

        int[] outputs = new int[t];

        for(int i = 0; i < t; i++) {
            int xCount = 0;
            int yCount = 0;
            int num = n[i];

            while(num%2 == 0 || num%3 == 0) {

                if(num%2 == 0) {
                    xCount++;
                    num/=2;
                }

                if(num%3 == 0){
                    yCount++;
                    num/=3;
                }

            }

            if(num != 1) outputs[i] = -1;
            else if(xCount <= yCount) outputs[i] = (2*yCount) - xCount;
            else outputs[i] = -1;

        }

        return outputs;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int[] n = new int[t];

        for(int i = 0; i < t; i++) {
            n[i] = s.nextInt();
        }

        System.out.println("\n\n\n");
        int[] results = numOfMoves(t, n);
        for(int i = 0; i < t; i++) {
            System.out.println(results[i]);
        }

        s.close();
    }
}
