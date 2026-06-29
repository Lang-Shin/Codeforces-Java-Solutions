// 1475B - New Year's Number

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NYNumber {

    static String[] wonderfulMoment(int[] years) {

        String[] str = new String[years.length];

       for(int i = 0; i < years.length; i++) {

            int numOf2021 = years[i] % 2020;
            int remainder = years[i] - 2021*numOf2021;

            str[i] = (remainder>=0 && remainder%2020==0) ? "Yes" : "No";

       }

       return str;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        int[] years = new int[t];
        for(int i = 0; i < t; i++) years[i] = Integer.parseInt(br.readLine());

        String[] outputs = wonderfulMoment(years);

        for(int i = 0; i < outputs.length; i++) System.out.println(outputs[i]);


    }
}
