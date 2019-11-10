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
public class AirConditioner {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double external, internal, desired;
        System.out.print("External temp: ");
        external = s.nextDouble();
        System.out.print("Internal temp: ");
        internal = s.nextDouble();
        System.out.print("Desired temp: ");
        desired = s.nextDouble();

        if (desired < internal && external > internal) {
            System.out.println("MAX COLD MODE");
            return;
        } else if (desired < internal && external <= internal) {
            System.out.println("ENERGY SAVING COLD MODE");
            return;
        } else if (desired > internal && external < internal) {
            System.out.println("MAX WARM MODE");
            return;
        } else if (desired > internal && external >= internal) {
            System.out.println("ENERGY SAVING WARM MODE");
            return;
        } else if (desired == internal) {
            System.out.println("PAUSE");
            return;
        }

    }

}
