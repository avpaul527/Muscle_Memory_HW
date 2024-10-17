package Chapter7;

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {

        String[] daysOfTheWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 1-7 for the day of the week (1 = Monday): ");

        int dayNum = scanner.nextInt();

        if (dayNum >= 1 && dayNum <= 7) {
            System.out.println("The day is: " + daysOfTheWeek[dayNum - 1]);
        } else {
            System.out.println("Input not valid!");

        }

        scanner.close();
    }
}
