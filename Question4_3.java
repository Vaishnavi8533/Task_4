package GuviMaintask4;

import java.util.Scanner;

public class Question4_3 {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position of the weekday: ");
        int position = scanner.nextInt();

        try {
            System.out.println("The weekday at position " + position + " is " + weekdays[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid position. Please enter a position between 0 and 6.");
        }

        scanner.close();
    }
}
