// 208A - Dubstep

import java.util.Scanner;

public class Dubstep {

    static String dubstep(String song) {

        String cleanSong = song.replace("WUB", " ");
        String modernSong = cleanSong.trim().replaceAll("\\s+", " ");

        return modernSong;

    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String song = s.nextLine();

        System.out.println(dubstep(song));

        s.close();  

    }
}
