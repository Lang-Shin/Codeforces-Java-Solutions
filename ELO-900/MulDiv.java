import java.util.Scanner;
import java.util.Arrays;

public class MulDiv {

    public static void main(String[] args) {

        int[] sale = {10, 323, -13, -4, 0, 3};

        System.out.println("\n\nBefore");
        for(int i = 0; i < sale.length; i++) System.out.println(sale[i]);

        Arrays.sort(sale);

        System.out.println("\n\nfter");
        for(int i = 0; i < sale.length; i++) System.out.println(sale[i]);

    }
}
