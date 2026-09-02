import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CreateWords {

    static String[] swapAB(String a, String b) {
        if(a.equals(b)) return new String[] {a, b};

        char[] swapA = new char[3];
        char[] swapB = new char[3];

        for(int i = 0; i < 3; i++) {
            if(i==0) {
                swapA[i] = b.toCharArray()[i];
                swapB[i] = a.toCharArray()[i];
                continue;
            }

            swapA[i] = a.toCharArray()[i];
            swapB[i] = b.toCharArray()[i];
        }

        String swappedA = String.valueOf(swapA);
        String swappedB = String.valueOf(swapB);

        return new String[] {swappedA, swappedB};
    }

    public static void main(String[] args) throws Exception {

        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            String[] swapped = swapAB(a, b);
            for(int j = 0; j < 2; j++) sb.append(swapped[j] + " ");
            sb.append("\n");
        }

        System.out.println();
        System.out.println(sb);

    }
}
