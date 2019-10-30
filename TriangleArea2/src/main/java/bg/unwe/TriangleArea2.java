package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Stoyan Angelov
 */
public class TriangleArea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter A: ");
        double a = s.nextDouble();
        System.out.println("Please enter C (hypotenuse): ");
        double c = s.nextDouble();
        double b = Math.pow(c, 2) - Math.pow(a, 2);
        double area = (a * Math.sqrt(b)) / 2;
        System.out.printf("The area of the triangle is %.3f\n", area);
    }
}
