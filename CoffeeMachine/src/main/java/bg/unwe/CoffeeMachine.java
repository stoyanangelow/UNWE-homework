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
public class CoffeeMachine {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double amount, shortes, longes, cappuccino, coffeeMilk, decaf;
        byte choice;
        shortes = 0.5;
        longes = 0.6;
        cappuccino = 0.85;
        coffeeMilk = 0.9;
        decaf = 0.6;
        System.out.print("Amount: ");
        amount = s.nextDouble();
        String menu = "1. short espresso\t0.50\n2. long espresso\t0.60\n3.cappuccino\t\t0.85\n4.coffee with milk\t0.90\n5.caffeinefree\t0.60\n";
        System.out.println(menu);
        System.out.print("Your choice: ");
        choice = s.nextByte();
        if (choice > 5 || choice < 1) {
            System.out.println("Please select from the menu");
            return;
        } else {
            switch (choice) {
                case 1:
                    if (amount < shortes) {
                        System.out.println("Not enough money");
                        return;
                    } else if (amount == shortes) {
                        System.out.println("Preparing your drink...");
                        return;
                    } else {
                        System.out.println("Preparing your drink...");
                        double change = amount - shortes;
                        System.out.println("Change: " + change);
                        return;
                    }

                case 2:
                    if (amount < longes) {
                        System.out.println("Not enough money");
                        return;
                    } else if (amount == longes) {
                        System.out.println("Preparing your drink...");
                        return;
                    } else {
                        System.out.println("Preparing your drink...");
                        double change = amount - longes;
                        System.out.println("Change: " + change);
                        return;
                    }
                case 3:
                    if (amount < cappuccino) {
                        System.out.println("Not enough money");
                        return;
                    } else if (amount == cappuccino) {
                        System.out.println("Preparing your drink...");
                        return;
                    } else {
                        System.out.println("Preparing your drink...");
                        double change = amount - cappuccino;
                        System.out.println("Change: " + change);
                        return;
                    }
                case 4:
                    if (amount < coffeeMilk) {
                        System.out.println("Not enough money");
                        return;
                    } else if (amount == coffeeMilk) {
                        System.out.println("Preparing your drink...");
                        return;
                    } else {
                        System.out.println("Preparing your drink...");
                        double change = amount - coffeeMilk;
                        System.out.println("Change: " + change);
                        return;
                    }
                case 5:
                    if (amount < decaf) {
                        System.out.println("Not enough money");
                        return;
                    } else if (amount == decaf) {
                        System.out.println("Preparing your drink...");
                        return;
                    } else {
                        System.out.println("Preparing your drink...");
                        double change = amount - decaf;
                        System.out.println("Change: " + change);
                        return;
                    }
                

            }

        }
    }
}
