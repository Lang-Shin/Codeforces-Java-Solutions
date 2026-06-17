    import java.io.BufferedReader;
    import java.io.InputStreamReader;

    public class PartyMonster{

        static boolean[] bracketSequence(int t, int[] n, String[] s) {

            boolean[] results = new boolean[t];

            for(int i = 0; i < n.length; i++) {
                int open = 0;
                int close = 0;
                String brack = s[i];

                for(int j = 0; j < brack.length(); j++) {

                    if(brack.charAt(j) == '(' ) open++;
                    else if(brack.charAt(j) == ')' ) close ++;

                }

                if(open == close) results[i] = true;
                else results[i] = false;

            }

            return results;

        }

        public static void main(String[] args) throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int t = Integer.parseInt(br.readLine().trim());

            int[] n = new int[t];
            String[] s = new String[t];

            for(int i = 0; i < t; i++) {
                n[i] = Integer.parseInt(br.readLine().trim());

                s[i] = br.readLine().trim();
            }

            boolean[] results = bracketSequence(t, n, s);

            System.out.println("\n");
            for(int i = 0; i < results.length; i++) {
                System.out.println(results[i] ? "YES" : "NO");
            }

        }
    }
