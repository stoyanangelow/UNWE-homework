package bg.unwe;

/**
 *
 * @author Stoyan Angelov
 */
public class QuadraticEquations {

    public static void main(String[] args) {
        int a = 3;
        double b = 12.5;
        int c = 9;
        double d = b * b - 4 * a * c;
        double x1 = (-b - Math.sqrt(d)) / (2 * a);
        double x2 = (-b + Math.sqrt(d)) / (2 * a);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
