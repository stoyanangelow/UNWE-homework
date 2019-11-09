/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author stoyan
 */
public class Temperatures {

    public static void main(String[] args) {
        double C, F, K, T;
        int choice;
        Scanner s = new Scanner(System.in);
        System.out.print("Temperature: ");
        T = s.nextDouble();
        System.out.print("Unit: ");
        choice = s.nextInt();
        switch (choice) {
            case 1:
                F = ((9 * T) / 5 + 32);
                K = T + 273.15;
                System.out.printf("Fahrenheit: %.2f \n", F);
                System.out.printf("Kelvin: %.2f \n", K);
                break;
            case 2:
                C = (5 * (T - 32) / 9);
                K = (5 * (T - 32)) / 9 + 273.15;
                System.out.printf("Celsius: %.2f \n", C);
                System.out.printf("Kelvin: %.2f \n", K);
                break;
            case 3:
                C = T - 273.15;
                F = (9 * (T - 273.15)) / 5 + 32;
                System.out.printf("Celsius: %.2f \n", C);
                System.out.printf("Fahrenheit: %.2f \n", F);
                break;
            default:
                System.out.println("Unsupported unit");
                break;

        }
    }
}
