package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author stoyanangelow
 */
public class Filter {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int check = 0;
        System.out.print("How many numbers? ");
        int numbers;
        numbers = s.nextInt();

        double arr[] = new double[numbers];
        System.out.printf("Please enter %d numbers: \n", numbers);
        for (int i = 0; i < numbers; i++) {
            arr[i] = s.nextInt();
        }
        System.out.print("Operation (>, < or =): ");
        String operation = s.next();
        if (operation.equals(">")) {
            System.out.print("Than: ");
            double compNumber = s.nextDouble();
            for (int i = 0; i < numbers; i++) {
                if(arr[i]>compNumber){
                    System.out.println(arr[i]);}
            }
        } else if (operation.equals("<")) {
            System.out.print("Than: ");
            double compNumber = s.nextDouble();
            for (int i = 0; i < numbers; i++) {
                if(arr[i]<compNumber){
                    System.out.println(arr[i]);}
            }
        } else if (operation.equals("=")) {
            System.out.print("Than: ");
            double compNumber = s.nextDouble();
            for (int i = 0; i < numbers; i++) {
                if(arr[i]==compNumber){
                    System.out.println(arr[i]);}
            }
        }
    }
}
