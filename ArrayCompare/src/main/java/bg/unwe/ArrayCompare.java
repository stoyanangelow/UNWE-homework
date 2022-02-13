package bg.unwe;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Stoyan Angelov
 */
public class ArrayCompare {

    public static void main(String[] args) {
        int first, second;
        Scanner s = new Scanner(System.in);
        System.out.print("How many in the first array? ");
        first = s.nextInt();
        System.out.print("How many in the second array? ");
        second = s.nextInt();

        int arr1[] = new int[first];
        int arr2[] = new int[second];

        for (int i = 0; i < first; i++) {
            System.out.print("1st array number: ");
            arr1[i] = s.nextInt();
        }

        for (int i = 0; i < second; i++) {
            System.out.print("2nd array number: ");
            arr2[i] = s.nextInt();
        }

//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
        int arr3[] = new int[first + second];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3[i] = arr1[i];
                    System.out.println("Match: " + arr3[i]);
                }
                
            }
        }

    }
}
