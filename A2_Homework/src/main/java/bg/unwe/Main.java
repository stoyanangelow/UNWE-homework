package bg.unwe;

/**
 *
 * @author stoyanangelow
 */
public class Main {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5};
        String cond;

        if ("a".equals(args[0])) {

            int add = calculateAddition(array);
            for (int i = 0; i < 5; i++) {
                int g = i + 1;
                System.out.println("Number " + g + " = " + array[i]);

            }

            System.out.println("Result = " + add);

        } else {
            int mult = calculateMultiplication(array);
            for (int i = 0; i < 5; i++) {
                int g = i + 1;
                System.out.println("Number " + g + " = " + array[i]);

            }

            System.out.println("Result = " + mult);

        }

    }

    public static int calculateAddition(int[] array) {
        int add = 0;
        for (int i = 0; i < array.length; i++) {
            add += array[i];
        }
        return add;
    }

    public static int calculateMultiplication(int[] array) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult *= array[i];
        }
        return mult;
    }
}
