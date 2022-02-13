package bg.unwe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author Stoyan Angelow
 */
public class BubbleSort3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Sentence: ");
        String sentence = s.nextLine();

        String words[] = sentence.split(" ");
        ArrayList<String> words1 = new ArrayList<String>();
        for (String w : words) {
            words1.add(w);
        }

        Arrays.sort(words);
        Collections.sort(words1, String.CASE_INSENSITIVE_ORDER);

        for (String w : words1) {
            System.out.print(w + " ");
        }
    }
}
