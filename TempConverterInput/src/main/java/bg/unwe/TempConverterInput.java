/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author stoyanangelow
 */
public class TempConverterInput {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double tempFahrenheit;
        System.out.print("What's the temperature in Fahrenheit? ");
        tempFahrenheit = s.nextDouble();
        double tempCelsius = 5 * ((tempFahrenheit - 32) / 9);
        System.out.println("Temperature in Fahrenheit is: " + tempFahrenheit);
        System.out.printf("Temperature in Celsius is: %.2f", tempCelsius);
    }
}
