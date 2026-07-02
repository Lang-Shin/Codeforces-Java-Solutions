// 474A - Keyboard

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Keyboard {

    static String decrypted(char direction, String msg) {

        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        char[] keyLet = keyboard.toCharArray();

        String decryptMsg = "";
        for(int i = 0; i < msg.length(); i++) {
            int index = keyboard.indexOf(msg.charAt(i));

            if(direction == 'R') decryptMsg += keyLet[index-1];
            else decryptMsg += keyLet[index+1];
        }

        return decryptMsg;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char direction = br.readLine().charAt(0);
        String msg = br.readLine();

        System.out.println(decrypted(direction, msg));
    }
}
