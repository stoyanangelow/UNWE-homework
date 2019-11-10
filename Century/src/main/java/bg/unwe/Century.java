/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Stoyan
 */
public class Century {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        System.out.print("Year: ");
        if (year > 2000) {
            System.out.println("After 20th century");
        } else if (1901 < year && year < 2000) {
            System.out.print("During 20th century");
        }else if (year<1900){
            System.out.print("Before 20th century");}
    }
}
