import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Borze {

    static String interpret(String ternaryNumNot) {

        char[] tnnArr = ternaryNumNot.toCharArray();
        String interpreted = "";
        int result = 0;

        if(ternaryNumNot.startsWith(".")) interpreted += "0";

        for(int i = 0; i < tnnArr.length; i++) {
            if(tnnArr[i] == '-') result++;
            else result*=10;
        }

        interpreted = String.valueOf(interpreted + result);

        return interpreted;
        
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ternaryNumNot = br.readLine();

        System.out.println(interpret(ternaryNumNot));

    }
}
