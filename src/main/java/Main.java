import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int target = r.nextInt(49) + 1; // expect int between 1 & 50 inclusive
        int lastGuess = -1;
        int currentGuess = -1;
        int guessCount = 0;

        Scanner in = new Scanner(System.in);
        while(lastGuess != target) {
            System.out.println("Guess the integer between 1 and 50 (inclusive)");
            currentGuess = in.nextInt();

            if (currentGuess < 1 || currentGuess > 50) {
                System.out.println("Please direct your attention to DA RULES...");
                continue;
            }

            if (currentGuess != lastGuess) {
                guessCount++;
                lastGuess = currentGuess;

                if (currentGuess == target) //win
                    break;
                else if (currentGuess > target) {
                    System.out.println("Too High..");
                } else {
                    System.out.println("Go Higher!");
                }
            } else { //repeat guess (only if consecutively)
                System.out.println("You just tried that one, silly.");
            }
        }
        System.out.println("You got it!!");
        System.out.println("\t...in this many guesses: " + guessCount);
    }
}
