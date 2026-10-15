import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DesignTutorial {

    static String composite(int n) {
        return (n%2 == 0) ? 4 + " " + (n-4) : 9 + " " + (n-9);
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        System.out.println(composite(n));

    }
}
