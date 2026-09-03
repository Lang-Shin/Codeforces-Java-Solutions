import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LoveStory {

    static int[] differCF(int t, String[] cfLoveStory) {
        char[] codeforces = {'c', 'o', 'd', 'e', 'f', 'o', 'r', 'c', 'e', 's'};
        int[] differT = new int[t];

        for(int i = 0; i < t; i++) {
            char[] testCase = cfLoveStory[i].toCharArray();
            int totalDiffer = 0;

            for(int j = 0; j < 10; j++) if(testCase[j] != codeforces[j]) totalDiffer++;
            differT[i] = totalDiffer;
        }

        return differT;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        String[] cfLoveStory = new String[t];
        for(int i = 0; i < t; i++) cfLoveStory[i] = br.readLine();

        int[] totalDiffer = differCF(t, cfLoveStory);
        for(int i = 0; i < t; i++) System.out.println(totalDiffer[i]);
    }
}
