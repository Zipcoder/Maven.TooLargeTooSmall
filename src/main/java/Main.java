import java.util.Random;
import java.util.Scanner;

/**
 * Created by Timothy Rager on 10/18/17.
 */
public class Main {

    public static void main(String[] args){
        Random randomNumber = new Random();
        Scanner in = new Scanner(System.in);
        int maxInclusiveBound;

        System.out.println("It's a guessing game (for those that have " +
                "low expectations from the word \"game\").");
        System.out.print("Guess the number between 1 and... what integer? ");
        maxInclusiveBound=in.nextInt();


        int mysteryIntToGuess=randomNumber.nextInt(maxInclusiveBound)+1;
        int currentUserGuess;
        int lastUserGuess=0;
        int totalGuesses=0;

        System.out.println("\nOk! I know the number you need to guess.");

        do {
            System.out.print("\nPick a number between 1 and "+maxInclusiveBound+", inclusive: ");
            currentUserGuess=in.nextInt();

            if ( ! (currentUserGuess>=1 && currentUserGuess<=maxInclusiveBound))
            {
                System.out.println("You'll never guess right if you don't follow the rules. This"+
                    " won't count against your guesses, rule-breaker!");
                continue;
            }

            if (currentUserGuess==lastUserGuess)
            {
                System.out.println("Hey, you _just_ guessed that. Try another one. I won't"+
                        " count this guess.");
                continue;
            }
5
            if (currentUserGuess==mysteryIntToGuess)
            {
                totalGuesses++;
                System.out.println("Nicely done! You got it! The mystery number was "+mysteryIntToGuess+
                    " and it took you "+totalGuesses+" tries before you guessed correctly!");
            }
            else if (currentUserGuess>mysteryIntToGuess)
                 {
                     totalGuesses++;
                     System.out.println("Oh, sorry. Your guess is too big! Try again.");
                 }
                 else
                 {
                     totalGuesses++;
                     System.out.println("Oh, sorry. Your guess is too small! Try again.");
                 }

            lastUserGuess=currentUserGuess;

        }while (currentUserGuess!=mysteryIntToGuess);
        in.close();
    }
}
