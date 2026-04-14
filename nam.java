import java.util.Scanner;
import java.util.ArrayList;

public class nam {
     public static void main(String[] args) {

        String name = "WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB";
        String song = name.replace("WUB", " ");

        System.out.println(song.trim().replaceAll("\\s+", " "));

    }
}
