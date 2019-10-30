package bg.unwe;

/**
 *
 * @author Stoyan Angelov
 */
public class TriangleArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 7;
        double c = 18.4;
        double b = Math.sqrt(c * c - a * a);

        double area = (a * b) / 2;

        System.out.println("The area of the triangle is " + area);
    }
}
