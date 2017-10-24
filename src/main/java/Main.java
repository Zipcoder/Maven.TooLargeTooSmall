import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 * Edits by katherine on 10/18/17
 */
public class Main {

    public static void main(String[] args){
        System.out.println("***************************************************************************");
        System.out.println("*         Hello, and welcome to the Mystery Number Guessing Game!         *");
        System.out.println("*             For now, only I know the mystery number, hahaha!            *");
        System.out.println("*         You will have an infinite number of guesses to determine        *");
        System.out.println("*   MY number, which will be an integer between 1 and 1000 (inclusive).   *");
        System.out.println("*  If you guess the number in less than 10 guesses, then congratulations, *");
        System.out.println("*                          you are good at this.                          *");
        System.out.println("*                                                                         *");
        System.out.println("*  Please note, consecutive identical guesses will not count toward your  *");
        System.out.println("*       guess total, but if you repeat yourself later, then it will!      *");
        System.out.println("***************************************************************************");
        System.out.println();


        int numGuesses = 0;
        boolean isCorrect = false;
        int lastGuess = 0;


        Random rand = new Random();
        int mysteryNum = rand.nextInt(1000) + 1;

        while (!isCorrect) {
            int currentGuess = promptGuess();
            isCorrect = checkGuess(mysteryNum, currentGuess);
            if (lastGuess != currentGuess) {
                numGuesses++;
                lastGuess = currentGuess;
            }
        }

        System.out.println("Congratulations, you guessed the mystery number in " + numGuesses + " guesses.");
    }

    public static int promptGuess() {
        boolean validGuess = false;
        Scanner scan = new Scanner(System.in);
        int guess = 1;

        while (!validGuess) {
            System.out.print("Please guess a number from 1 to 1000: ");
            try {
                guess = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("I'm sorry, that is not a valid guess. Try again.");
                scan.next();
                continue;
            }
            System.out.println();
            if (guess >= 1 && guess <= 1000) {
                validGuess = true;
            } else {
                System.out.println("I'm sorry, that is not a valid guess. Try again.");
            }
        }

        return guess;
    }

    public static boolean checkGuess(int target, int guess) {
        if (guess < target) {
            System.out.println("Sorry, your guess was too small.");
            return false;
        }
        else if (guess > target) {
            System.out.println("Sorry, your guess was too large.");
            return false;
        }
        else {
            System.out.println("Hooray that was the correct guess!");
            return true;
        }
    }
}
