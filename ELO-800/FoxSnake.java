// 510A - Fox and Snake

import java.util.Scanner;

public class FoxSnake{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();

        boolean edge = false;

        for(int i = 0; i < n; i++) {

            if(i%2 == 0) {

                for(int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                System.out.println();

            } else {
                if(!edge) {
                    for(int j = 0; j < m-1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                    System.out.println();

                    edge = true;
                } else {
                    System.out.print("#");
                    for(int j = 0; j < m-1; j++) {
                        System.out.print(".");
                    }
                    System.out.println();

                    edge = false;
                }

            }
            
        }

        s.close();

    }
}