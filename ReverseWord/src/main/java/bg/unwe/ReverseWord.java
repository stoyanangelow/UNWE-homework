package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Stoyan Angelow
 */
public class ReverseWord {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Word: ");
        String word = s.next();
        char[] wordAsArrayOfChars = word.toCharArray();
        int length = wordAsArrayOfChars.length - 1;
        for (int i = 0; i < wordAsArrayOfChars.length; i++) {
            System.out.print(wordAsArrayOfChars[length]);
            length--;
        }
    }
}
