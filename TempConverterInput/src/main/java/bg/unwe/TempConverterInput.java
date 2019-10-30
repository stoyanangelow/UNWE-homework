package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Stoyan Angelov
 */
public class TempConverterInput {

    public static void main(String[] args) {
        double tempC, tempF;
        Scanner s = new Scanner(System.in);
        System.out.print("What's the temperature in Fahrenheit? ");
        tempF = s.nextDouble();
        tempC = 5 * ((tempF - 32) / 9);
        System.out.printf("Temperature in Fahrenheit is: %.2f\n",tempF);
        System.out.printf("Temperature in Celsius is: %.2f\n", tempC);
    }
}
