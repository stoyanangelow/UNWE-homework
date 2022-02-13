package bg.unwe;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Stoyan Angelov
 */
public class Capital {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int check = 0;
        double prices, checkPrice, average;

        System.out.print("How many days? ");
        int days;
        days = s.nextInt();

        double price[] = new double[days];

        for (int i = 0; i < days; i++) {
            check++;
            System.out.printf("Day %d: ", check);
            price[i] = s.nextDouble();
        }
        System.out.println("Price movements: ");

        int j = 0;
        int k = 1;
        while (k < days) {
            checkPrice = price[k] - price[j];
            if (checkPrice > 0) {
                System.out.printf("UP with %.4f\n", Math.abs(checkPrice));
            } else if (checkPrice < 0) {
                System.out.printf("DOWN with %.4f\n", Math.abs(checkPrice));
            } else {
                System.out.println("Not changed");
            }
            j++;
            k++;
        }
        average = Arrays.stream(price).sum() / days;
        System.out.printf("Average price for the period: %.4f\n", average);
    }
}
