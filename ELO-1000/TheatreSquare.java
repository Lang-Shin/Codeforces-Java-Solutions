// 1A - Theatre Square

import java.util.Scanner;

public class TheatreSquare{

    static long numOfFlagStones(double n, double m, double a) {
        
        double width = Math.ceil(n/a);
        double height = Math.ceil(m/a);

        return (long) (width*height);

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double n = s.nextDouble();
        double m = s.nextDouble();
        double a = s.nextDouble();

        System.out.println(numOfFlagStones(n, m, a));

        s.close();

    }
}