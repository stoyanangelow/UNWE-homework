package bg.unwe;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Stoyan Angelov
 */
public class Excel3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = new int[5];
        int i = 1;
        int input = s.nextInt();
        double sum, avg, count, min, max;
        arr[0] = input;
        while (input > 0) {
            arr[i] = s.nextInt();
            if (i > 4) {
                arr = Arrays.copyOf(arr, arr.length + 1);
            }
            i++;
        }
    }
}
