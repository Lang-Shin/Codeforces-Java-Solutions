import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class SandD {

    static int[] getPoints(int n, ArrayList<Integer> cards) {

        int serejaPoint = 0;
        int dimaPoint = 0;

        for(int i = 0; i < n; i++) {

            int num1 = cards.get(0);
            int num2 = cards.get(cards.size()-1);
            int largest = 0;

            if(num1 > num2) {
                largest = num1;
                cards.remove(0);
            } else {
                largest = num2;
                cards.remove(cards.size()-1);
            }

            if(i%2 == 0) serejaPoint += largest;
            else dimaPoint += largest;

        }

        return new int[] {serejaPoint, dimaPoint};

    } 

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> cards = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) cards.add(Integer.parseInt(st.nextToken()));

        int[] points = getPoints(n, cards);

        System.out.println(points[0] + " " + points[1]);

    }
}
