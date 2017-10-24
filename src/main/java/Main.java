import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); //Create a Scanner object for user input.
        Random random = new Random(); //Create a random object, which will be used to randomly generate a mystery number.
        int mysteryNumber = random.nextInt(101); // Use the random object to randomly generate an int between 0 and 100.
        int numberGuessed = -1; // A variable used to store the number that the user has last guessed.
        int numberOfGuesses = 0; // A variable used to store the number of guesses.
        int lastGuess; //A variable used to store the last guess.

        do {
            System.out.println("Please guess a number between 0 and 100.");
            lastGuess = numberGuessed;
            numberGuessed = scanner.nextInt();
            numberOfGuesses++;
            //
            /* if (lastGuess != -1) {
                System.out.println("Your last guess was: " + lastGuess);
                System.out.println("Your current guess is: " + numberGuessed);
            }
            */
            if (lastGuess == numberGuessed)
                numberOfGuesses--;
            System.out.println("You have guessed: " + numberOfGuesses + " time(s) so far.");
            if (numberGuessed > mysteryNumber)
                System.out.println("Too large\n");
            else if (numberGuessed < mysteryNumber)
                System.out.println("Too small\n");
        } while (numberGuessed != mysteryNumber);

        System.out.println(numberGuessed + " was the correct guess!\n");
        System.out.println("It took you " + numberOfGuesses + " guesses!");

    }
}
