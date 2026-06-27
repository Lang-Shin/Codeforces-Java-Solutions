// 1669A - Division?

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Division {

    static String[] getDivision(int[] rating) {

        String[] div = new String[rating.length];

        for(int i = 0; i < rating.length; i++) {
            if(rating[i] >= 1900) div[i] = "Division 1";
            else if((rating[i] >= 1600) && (rating[i] <= 1899)) div[i] = "Division 2";
            else if((rating[i] >= 1400) && (rating[i] <= 1599)) div[i] = "Division 3";
            else div[i] = "Division 4";
        }

        return div;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] rating = new int[n];
        for(int i = 0; i < n; i++) rating[i] = Integer.parseInt(br.readLine());

        String[] div = getDivision(rating);

        for(int i = 0; i < div.length; i++) System.out.println(div[i]);

    }
}
