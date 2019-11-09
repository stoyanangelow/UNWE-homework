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
 *
 */
public class DiceRoll2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Desired sum of two rolls: ");
        int rolls = s.nextInt();
        if (rolls < 2) {
            System.out.println("The sum of two rolls cannot be less than 2.");
            return;
        } else if (rolls > 12) {
            System.out.println("The sum of two rolls cannot be greater than 12.");
            return;
        } else {
            int randomNumber;
            randomNumber = (int) (Math.random() * 6 + 1);
            int randomNumber1;
            randomNumber1 = (int) (Math.random() * 6 + 1);
            int sum = randomNumber + randomNumber1;
            System.out.printf("First roll was %d, second roll was %d, the sum is %d\n", randomNumber, randomNumber1, sum);
            boolean hasGuess = randomNumber + randomNumber1 == sum;
            System.out.println("Win: " + hasGuess);
        }
    }

}
