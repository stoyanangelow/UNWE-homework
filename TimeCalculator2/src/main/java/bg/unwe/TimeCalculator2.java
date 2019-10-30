package bg.unwe;

import java.util.Scanner;

/**
 *
 * @author Stoyan Angelov
 */
public class TimeCalculator2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("How many seconds? ");
        int seconds = s.nextInt();
        double minutes = seconds / 60.0;
        double hours = minutes / 60.0;
        double days = hours / 24.0;
        double weeks = days / 7.0;
        double years = days / 365.0;
        System.out.println("Minutes: " + minutes);
        System.out.println("Hours: " + hours);
        System.out.println("Days: " + days);
        System.out.println("Weeks: " + weeks);
        System.out.println("Years: " + years);
    }
}
