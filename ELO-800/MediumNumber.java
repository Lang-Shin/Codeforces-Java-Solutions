import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;


public class MediumNumber {

    static int medianNum(int[] nums) {

        Arrays.sort(nums);

        return nums[1];

    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < t; i++) {
            int[] nums = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++) nums[j] = Integer.parseInt(st.nextToken());

            sb.append(medianNum(nums) + "\n");
        }

        System.out.println(sb);

    }
}