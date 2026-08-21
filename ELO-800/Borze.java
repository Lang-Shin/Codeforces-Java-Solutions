import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Borze {

    static String interpret(String ternaryNumNot) {

        char[] tnnArr = ternaryNumNot.toCharArray();
        String interpreted = "";

        for(int i = 0; i < tnnArr.length; i++) {
            if(tnnArr[i] == '.') interpreted += "0";
            else if(tnnArr[i+1] == '.') {
                interpreted += "1";
                i++;
            }
            else {
                interpreted += "2";
                i++;
            }
        }

        return interpreted;
        
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ternaryNumNot = br.readLine();

        System.out.println(interpret(ternaryNumNot));

    }
}