// 1154A - Restoring Three Numbers

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RestoreNum {

    static int[] restoreNum(int[] inputs) {

        int[] realNum = new int[inputs.length-1];

        int largest = Integer.MIN_VALUE;
        int index = 0;
        int j = 0;

        for(int i = 0; i < inputs.length; i++) {
            if(inputs[i] > largest) {
                largest = inputs[i];
                index = i;
            }
        }

        System.err.println("\n\n");
        for(int i = 0; i < inputs.length; i++) {
            if(i == index) continue;
            
            realNum[j] = largest - inputs[i];
            j++;
        

        }

        return realNum;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] inputs = new int[4];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 4; i++) inputs[i] = Integer.parseInt(st.nextToken());

        int[] realNum = restoreNum(inputs);

        for(int i = 0; i < realNum.length; i++) System.out.print(realNum[i] + " ");


    }
}