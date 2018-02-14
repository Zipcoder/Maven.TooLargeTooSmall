/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int bottomParameter = 1;
        int upperParameter = 10;
        int attempts = 1;
        int numberGuessed = 0;
        int previous = 0;
        Random randomNumber = new Random();
        int mysteryNumber = randomNumber.nextInt(10);

        System.out.println("Please guess a number between " + bottomParameter + " and " + upperParameter + " inclusive: ");
        numberGuessed = in.nextInt();

        while (numberGuessed != mysteryNumber) {
            if (numberGuessed > upperParameter || numberGuessed < bottomParameter) {
                System.out.println("Invalid input");
            } else if (numberGuessed == previous) {
                System.out.println("Number already guessed. Try again...");
            } else if (numberGuessed > mysteryNumber) {
                System.out.println("Too large. Try again...");
                attempts++;
            } else if (numberGuessed < mysteryNumber) {
                System.out.println("Too small. Try again...");
                attempts++;
            }
            previous = numberGuessed;
            System.out.println("Please guess a number between " + bottomParameter + " and " + upperParameter + " inclusive: ");
            numberGuessed = in.nextInt();
        }
        System.out.println("Correct! After " + attempts + " guesses");
    }

    }
