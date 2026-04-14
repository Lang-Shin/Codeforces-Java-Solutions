// 580A - Kefa and First Steps

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class KeFirstStep {

    static int subsegment(int[] a) {

        if(a.length <= 1) return 1;

        int contiguous = 1;
        ArrayList<Integer> lists = new ArrayList<>();

        for(int i = 0; i < a.length-1; i++) {
            if(a[i] <= a[i+1]) {
                 contiguous++;
            } else{
                lists.add(contiguous);
                contiguous = 1;
            }
            lists.add(contiguous);
        }

        int max = Collections.max(lists);

        return max;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        System.out.println(subsegment(a));

        s.close();

    }
}
