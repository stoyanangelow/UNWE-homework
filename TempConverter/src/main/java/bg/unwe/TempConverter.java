/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

/**
 *
 * @author stoyanangelow
 */
public class TempConverter {
    public static void main(String[] args) {

        double tempFahrenheit = 98;
        double tempCelsius = 5 * ((tempFahrenheit - 32) / 9);

        System.out.println("Temperature in Fahrenheit is: " + tempFahrenheit);
        System.out.println("Temperature in Celsius is: " + tempCelsius);
    }
}
