/**
 * Project: CompAssistedInstructions
 * Programmer: Darian Tan
 * Date: 11/14/2022
 * Description: An application that can help an elementary school student learn 
 * division of two decimal 2-digit numbers.
 */
package compassistedinstructions;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class CompAssistedInstructions {

    public static void main(String[] args) {
        // create a new Scanner object for user input
        Scanner input = new Scanner(System.in);
        // create a new Random object for generating random numbers
        Random rand = new Random();

        // initialize variables
        String firstName = "";
        String lastName = "";
        String choice = "";
        double answer = 0.0;
        double[] numbersArray = new double[100];
        // generate two random decimal numbers between 0 and 99
        double num1 = rand.nextDouble(numbersArray.length - 1);
        double num2 = rand.nextDouble(numbersArray.length - 1);
        // calculate the quotient of num1 and num2
        double quotient = num1 / num2;
        int points = 0;
        // initialize score to points + 5
        int score = points += 5;

        // greet the user and prompt them to enter their name
        System.out.println("Hello, Welcome to the Division Learner "
                + "Application.\nPlease enter in your first and last name "
                + "down below.");
        firstName = input.nextLine();
        lastName = input.nextLine();

        // explain the concept of division to the user
        System.out.println("\nToday I will be explaining the concept of "
                + "division.\nThe concept is when a two decimal digit number "
                + "\nis dividing into another two digit number digit number"
                + "\nbut, with this case you're taking the decimal point\nand "
                + "moving it to the right one spot so, the number\nlooks as "
                + "following: 12.34. Another example of this concept is shown "
                + "down below\nExample: 98.76 / 54.32 = 1.82\n");

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // prompt the user to start the lesson
        System.out.println("Hello " + firstName + " " + lastName + " are you ready "
                + "for the lesson?");
        choice = input.nextLine();

        // if the user is ready to start the lesson
        if (choice.equalsIgnoreCase("yes")) {
            // prompt the user to enter the quotient of num1 and num2
            System.out.println("What will be the quotient be when " + num1 + "is "
                    + "divided by " + num2 + "?");
            answer = input.nextDouble();

            // if the user's answer is correct
            if (true) {
                // congratulate the user and add 5 points to their score
                System.out.println("\nThat is Correct! Good Job! You earned 5 "
                        + "Points!");
                System.out.println(score);
            } else {
                // if the user's answer is incorrect, show them the correct
                System.out.println("\nWhat will be the quotient be "
                        + "when " + num1 + "is divided by " + num2 + "?");
                System.out.println(quotient);
            }
            // if the user is not ready to start the lesson, exit the program
        } else if (choice.equalsIgnoreCase("no")) {
            System.exit(0);
        }

    }

}
