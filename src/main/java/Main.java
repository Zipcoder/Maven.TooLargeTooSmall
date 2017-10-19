import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        double num = Math.floor(Math.random() * 20 + 1);
        Scanner scanner = new Scanner(System.in);
        int numOfGuess = 1;
        int prevGuess = 0;
       // System.out.println(num);

        //Random rand = new Random();
        //int ans = rand.nextInt( 20);

        System.out.println("This is the number guessing game. Please enter a number between 1 & 20.");
        int nextGuess = scanner.nextInt();

        while (nextGuess != num) {
            if (nextGuess < 1 || nextGuess > 20){
                System.out.println("Your number is outside of the given numbers.\nPlease try again.");
                nextGuess = scanner.nextInt();
                continue;
            }
            if (nextGuess < num) {
                System.out.println("\nYour number is too small.");
            }

            if (nextGuess > num) {
                System.out.println("\nYour number is too large.");
            }
            if (prevGuess == nextGuess){
                numOfGuess--;
                System.out.println("You just tried " + nextGuess + ".");
            }

            prevGuess = nextGuess;

            System.out.println("Please try again.\n");
            nextGuess = scanner.nextInt();

            numOfGuess++;
        }
        System.out.println("You guess the right number " + nextGuess + ".\nYou guessed " + numOfGuess + " number of times.");
    }
}
