import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class SandD {

    static int[] getPoints(int n, ArrayList<Integer> cards) {

        int serejaPoint = 0;
        int dimaPoint = 0;
        int vertex = 0;

        for(int i = 0; i < n; i++) {

            int largest = Integer.MIN_VALUE;

            for(int j = 0; j < cards.size(); j++) {

                if(cards.get(j) > largest) {

                    largest = cards.get(j);
                    vertex = j;

                }

            }

            if(i%2==0) {
                serejaPoint += largest;
                cards.remove(vertex);
                
            }
            else {
                dimaPoint += largest;
                cards.remove(vertex);
            }

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
