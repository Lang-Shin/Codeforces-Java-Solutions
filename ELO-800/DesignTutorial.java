// 9A - Die Roll

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DesignTutorial {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Integer.parseInt(br.readLine());

        int a = (int)Math.floor(n/2);
        int b = (int)Math.ceil(n/2);

        System.out.println(a + " " + b);

    }
}
