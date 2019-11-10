package bg.unwe;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Stoyan Angelov
 */
public class Excel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x, y, z, result;
        String function;

        System.out.print("x: ");
        x = s.nextDouble();
        System.out.print("y: ");
        y = s.nextDouble();
        System.out.print("z: ");
        z = s.nextDouble();
        System.out.print("Function: ");
        function = s.next();

        switch (function) {
            case "SUM":
                result = x + y + z;
                System.out.printf("Result: %.4f\n", result);
                break;
            case "AVERAGE":
                result = (x + y + z) / 3;
                System.out.printf("Result: %.4f\n", result);
                break;
            case "MIN":
                double[] min = {x, y, z};
                Arrays.sort(min);
                System.out.printf("Result: %.4f\n", min[0]);
                break;
            case "MAX":
                double[] max = {x, y, z};
                Arrays.sort(max);
                System.out.printf("Result: %.4f\n", max[max.length - 1]);
                break;
            default:
                System.out.println("Unsupported function\n");
                break;

        }
    }

}
