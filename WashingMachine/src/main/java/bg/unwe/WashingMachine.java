/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Stoyan Angelov
 */
public class WashingMachine {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        byte programme;
        int customTemp, customDur;
        System.out.print("Pick a programme: ");
        programme = s.nextByte();
        switch (programme) {
            case 1:
                System.out.println("Temperature: 60 degrees, Time: 125 minutes");
                break;
            case 2:
                System.out.println("Temperature: 90 degrees, Time: 106 minutes");
                break;
            case 3:
                System.out.println("Temperature: 40 degrees, Time: 98 minutes");
                break;
            case 4:
                System.out.println("Temperature: 50 degrees, Time: 65 minutes");
                break;
            case 5:
                System.out.print("Desired temperature: ");
                customTemp = s.nextInt();
                System.out.print("Desired time: ");
                customDur = s.nextInt();
                System.out.printf("Temperature: %d degrees, Time: %d minutes", customTemp, customDur);
            default:
                System.out.println("No such programme");
                break;
        }
    }
}
