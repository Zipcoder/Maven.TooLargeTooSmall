import java.util.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){


        int guess;
        int guessCount = 0;

        Random random = new Random();
        int randomNum = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Please enter a whole number between 1-10 (inclusive): ");
            String guessString = scanner.next();
            try {
                guess = Integer.parseInt(guessString);
                //System.out.println("Correct int");
                if (guess < 0 || guess > 100) continue;
                else {
                    guessCount++;
                    if (guess > randomNum) {
                        System.out.println("Too large");
                    } else if (guess < randomNum) {
                        System.out.println("Too small");
                    } else {
                        System.out.println("You're correct");
                        break;
                    }
                    System.out.println("Try again.");
                }
            } catch (NumberFormatException ne) {
                System.out.println("Input is not a whole number greater than zero.");
                System.out.println("Please try again.");
            }
        } while (true);

        System.out.println("Your number of guesses was: " + guessCount);

        
    }
}
