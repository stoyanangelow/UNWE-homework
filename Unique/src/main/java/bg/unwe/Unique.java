package bg.unwe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Stoyan Angelov
 */
public class Unique {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numbers;

        System.out.print("How many numbers? ");

        numbers = s.nextInt();
        int arr[] = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate found!");
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = 0;
                }
            }
        }
        System.out.println("Final result: ");
//        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            }
        }
    }

