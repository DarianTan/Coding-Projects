/***
 * Project: StringManipulation
 * Programmer: Darian Tan
 * Date: 10/19/2022
 * Description: Takes user input as a String of numbers and ONLY numbers. Next, 
 * it asks you if you want to continue, if so, take the last 5 digits of user
 * inputted string and converts it to an Equivalent Decimal Number then, it will
 * convert the Decimal Number to its respective Binary Number. If user does NOT 
 * want to continue, Program will terminate/end.
 ****/
package stringmanipulation;

import java.lang.*;
import java.util.Scanner;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userChoice = ""; // user input if they want to continue or not.
        String numbers = ""; // user input for numbers in the String.
        int decimalNumber = 0; // last 5 digits conversion to decimal number.
        String lastFiveDigits = ""; // variable for the last 5 digits of String.

        // Asking the user to input numbers in String.
        System.out.println("Please enter in a sequence of "
                + "numbers: ");
        numbers = input.nextLine();

        // if statement to check if string only has numbers in it.
        if (numbers.matches("^[0-9]*$")) {
            System.out.println("Valid Input.");
        } else {
            System.out.println("Invalid Input.");
            System.out.println("The input string has non-digit character(s).");
            System.out.println("\nContinuation --- false.\n");
            System.out.println("Thank you for using the String Manipulation "
                    + "Application.");
            System.exit(0);
        }
        // Asks the user if they would like to continue.
        System.out.println("\nWould you like to continue?");
        userChoice = input.nextLine();

        // conversion to get the last 5 numbers in the String.
        if (numbers.length() > 5) {
            lastFiveDigits = numbers.substring(numbers.length() - 5);
        } else {
            lastFiveDigits = numbers;
        }
        // conversion of Last 5 Digits to Decimal Number.
        decimalNumber = Integer.valueOf(lastFiveDigits) % 100000;

        // if statement to see if the user said "yes" or "no".
        if (userChoice.equalsIgnoreCase("yes")) {
            System.out.println("\nInput string: " + numbers);
            System.out.println("5 Right-most digits: " + lastFiveDigits);
            System.out.println("Equivalent\nDecimal number: " + decimalNumber);
            System.out.println("Binary "
                    + "number: " + Integer.toBinaryString(decimalNumber));
            System.out.println("Continuation --- true.");
            System.out.println("\nThank you for using String Manipulation "
                    + "Application.");
        } else if (userChoice.equalsIgnoreCase("no")) {
            System.out.println("Continuation --- false.");
            System.out.println("\nThank you for using String Manipulation "
                    + "Application.");
            System.exit(0);
        }
    }
}
