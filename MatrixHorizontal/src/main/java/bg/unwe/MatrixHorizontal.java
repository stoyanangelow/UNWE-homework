package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author stoyanangelow
 */
public class MatrixHorizontal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows, columns;
        System.out.print("How many rows? ");
        rows = s.nextInt();
        System.out.print("How many columns? ");
        columns = s.nextInt();

        int Number[][] = new int[rows][columns];
        int i, j, q;
        q = 1;

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                Number[i][j] = q;
                q++;
            }
        }

        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.print(Number[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
