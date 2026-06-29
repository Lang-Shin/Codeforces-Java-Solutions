import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Lucky {

    static String isEqual(String input) {

        char[] inputs = input.toCharArray();

        int firstHalf = 0;
        int secondHalf = 0;       

        for(int i = 0; i < inputs.length/2; i++) firstHalf = firstHalf + (inputs[i] - '0');
        for(int i = inputs.length/2; i < inputs.length; i++) secondHalf = secondHalf + (inputs[i] - '0');

        if(firstHalf != secondHalf) return "No";

        return "Yes";

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String input = br.readLine();
            System.out.println(isEqual(input));
        }

    }
}