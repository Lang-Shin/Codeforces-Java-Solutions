import java.util.Scanner;

public class TheatreSquare{

    static int numOfFlagStones(int n, int m, int a) {
        return a;
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int m = s.nextInt();
        int a = s.nextInt();

        System.out.println(numOfFlagStones(n, m, a));

        s.close();

    }
}