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

        int Number[][] = new int[columns][rows];
        int i, j, q;
        q = 0;

        for (i = 0; i < columns; i++) {
            for (j = 0; j < rows; j++) {
                Number[i][j] = q;
                q++;
            }
        }

        for (i = 0; i < columns; i++) {
            for (j = 0; j < rows; j++) {
                System.out.print(Number[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
