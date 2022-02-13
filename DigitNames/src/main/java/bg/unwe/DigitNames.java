package bg.unwe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Stoyan Angelow
 */
public class DigitNames {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] names = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        System.out.print("Number: ");
        int num = s.nextInt();
        String number = String.valueOf(num);

        char[] digits = number.toCharArray();

        Map<Integer, String> m = new HashMap<Integer, String>();

        m.put(0, "zero");
        m.put(1, "one");
        m.put(2, "two");
        m.put(3, "three");
        m.put(4, "four");
        m.put(5, "five");
        m.put(6, "six");
        m.put(7, "seven");
        m.put(8, "eight");
        m.put(9, "nine");
        
        for (int i = 0; i < digits.length; i++) {
            int a = Character.getNumericValue(digits[i]);
            System.out.println(m.get(a));

        }
    }
}
