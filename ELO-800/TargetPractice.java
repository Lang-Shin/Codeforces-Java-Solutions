import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TargetPractice {
    public static void main(String[] args) throws Exception {

        int[][] boardMatrix = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
            {1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
            {1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
        };

        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int totalScore = 0;

        for(int i = 0; i < t; i++) {
            char[][] scoreMatrix = new char[10][10];
            for(int j = 0; j < 10; j++) {
                String line = br.readLine();
                for(int k = 0; k < 10; k++) scoreMatrix[j][k] = line.charAt(k);
            }

            for(int r = 0; r < 10; r++) {
                for(int c = 0; c < 10; c++) {
                    if(scoreMatrix[r][c] == 'X') totalScore += boardMatrix[r][c];
                }
            }

            sb.append(totalScore + "\n");
            totalScore = 0;
        }

        System.out.println(sb);

    }
}
