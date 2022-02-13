package bg.unwe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Stoyan Angelov
 */
public class BubbleSort2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Word: ");
        String word = s.next();
        char[] wordAsArrayOfChars = word.toCharArray();
        Arrays.sort(wordAsArrayOfChars);
        System.out.println(wordAsArrayOfChars);
    }
}
