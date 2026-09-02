// 1560A - Dislike of Threes

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DislikeThrees {

    static int[] likeNum() {
        int[] likesInt = new int[1000];

        int val = 0;
        for(int i = 0; i < 1000; i++) {
            val++;
            while(true) {
                if(val%3 == 0 || val%10 == 3) val++;
                else break;
            }
            likesInt[i] = val;
        }

        return likesInt;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int[] likesInt = likeNum();
        for(int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());

            System.out.println(likesInt[k-1]);
        }


    }
}
