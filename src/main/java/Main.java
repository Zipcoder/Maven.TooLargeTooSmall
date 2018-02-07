/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Random rand = new Random();
        int numberToGuess = rand.nextInt(500);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while (!win) {

            System.out.println("Guess a number between 1 and 500: ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            } else if (guess < numberToGuess) {
                System.out.println("Too small!");
            } else if (guess > numberToGuess) {
                System.out.println("Too large!");
            }
        }
        System.out.println("You win!");
        System.out.println("The number was " + numberToGuess);
        System.out.println("It took you " + numberOfTries + " tries");
    }
}