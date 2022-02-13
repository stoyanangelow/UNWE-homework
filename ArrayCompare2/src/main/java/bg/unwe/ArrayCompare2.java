package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Stoyan Angelow
 */
public class ArrayCompare2 {

    public static void main(String[] args) {
        int first, second;
        Scanner s = new Scanner(System.in);
        System.out.print("How many in the first array? ");
        first = s.nextInt();
        System.out.print("How many in the second array? ");
        second = s.nextInt();

        double arr1[] = new double[first];
        String arr2[] = new String[second];

        for (int i = 0; i < first; i++) {
            System.out.print("1st array number: ");
            arr1[i] = s.nextDouble();
        }

        for (int i = 0; i < second; i++) {
            System.out.print("2nd array number: ");
            arr2[i] = s.next();
        }

        int arr3[] = new int[first + second];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int x = (int) arr1[i];
                int y = Integer.parseInt(arr2[j]);
                if (x == y) {
                    arr3[i] = x;
                    System.out.println("Match: " + arr3[i]);
                }

            }
        }
    }
}
