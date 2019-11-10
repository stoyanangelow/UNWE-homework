package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Stoyan Angelov
 */
public class Hypotenuse3 {

    public static void main(String[] args) {
        int a, b;
        double c;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = s.nextInt();
        if (a <= 0) {
            System.out.println("The side A cannot be less than or equal to zero");
            return;
        } else {
            System.out.print("Enter b: ");
            b = s.nextInt();
            if (b <= 0) {
                System.out.println("The side B cannot be less than or equal to zero");
                return;
            } else {
                if (a == b) {
                    c = Math.sqrt(a * a + b * b);
                    System.out.println("This is an isosceles triangle.");

                    System.out.printf("The length is: %.2f\n", c);
                } else {
                    c = Math.sqrt(a * a + b * b);
                    System.out.printf("The length is: %.2f\n", c);

                }
            }
        }
    }
}
