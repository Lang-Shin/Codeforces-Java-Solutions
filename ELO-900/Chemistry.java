import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chemistry{

    static StringBuilder isPalindrome(int t, int n, int k, String s) {

        StringBuilder sb = new StringBuilder();
        int[] freq = new int[26];

        for(char c : s.toCharArray()) freq[c - 'a']++;

        int odd = 0;
        for(int f : freq) if(f%2 != 0) odd++;

        if(odd <= 1) sb.append("YES");
        else sb.append(k >= odd - 1? "YES" : "NO");

        return sb;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            String s = br.readLine().trim();

            System.out.println(isPalindrome(t, n, k, s));
        }

    }
}