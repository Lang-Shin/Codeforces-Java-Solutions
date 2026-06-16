// 723A - The New Year : Meeting Friends

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class MeetFriend {

    static int meetingArea(int[] x) {

        Arrays.sort(x);

        return (x[2] - x[1]) + (x[1] - x[0]);

    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] x = new int[3];

        for(int i = 0; i < 3; i++) {
            x[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(meetingArea(x));

    }
}
