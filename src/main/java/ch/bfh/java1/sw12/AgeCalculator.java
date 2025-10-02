package ch.bfh.java1.sw12;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * A simple age calculator that calculates the age in days based on the user's birthdate.
 * It prompts the user for their birth year, month, and day, then calculates and displays their age in days.
 *
 * @author Janick Spielmann
 * @version 1.0
 * @since 2025-09-17
 */
public class AgeCalculator {
    private static final LocalDate today = LocalDate.now();
    private static final Scanner scanner = new Scanner(System.in);
    private static LocalDate birthDate;

    /**
     * The main method that runs the age calculator.
     * It prompts the user for their birthdate, calculates their age in days, and prints the result.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        birthDate = LocalDate.of(askForYearOfBirth(), askForMonthOfBirth(), askForDayOfBirth());
        System.out.println("You were born on " + birthDate);
        System.out.println("Today is " + today);
        System.out.print("You are " + calculateAge() + " days old.");
        scanner.close();
    }

    /**
     * Calculates the age in days based on the birthdate and today's date.
     *
     * @return the age in days
     */
    private static int calculateAge() {
        return (int) (today.toEpochDay() - birthDate.toEpochDay()); // toEpochDay returns the number of days since 1970-01-01, the day that Java's time system starts
    }

    /**
     * Prompts the user for their year of birth and returns it as an integer.
     *
     * @return the year of birth entered by the user
     */
    private static int askForYearOfBirth() {
        System.out.println("In which year were you born? (e.g., 1950)");
        return scanner.nextInt();
    }

    /**
     * Prompts the user for their month of birth and returns it as an integer.
     *
     * @return the month of birth entered by the user
     */
    private static int askForMonthOfBirth() {
        System.out.println("In which month were you born? (e.g., 2 for February)");
        return scanner.nextInt();
    }

    /**
     * Prompts the user for their day of birth and returns it as an integer.
     *
     * @return the day of birth entered by the user
     */
    private static int askForDayOfBirth() {
        System.out.println("On which day of the month were you born? (1-31)");
        return scanner.nextInt();
    }

}
