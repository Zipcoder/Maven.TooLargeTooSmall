/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args){

        int round = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the guessing game!  Pick the upper range:");
        int maximum = input.nextInt();
        System.out.println("Now enter the lower range:");
        int minimum = input.nextInt();
        int randomNum = ThreadLocalRandom.current().nextInt(minimum, maximum + 1);
        System.out.println("Now start guessing!");
        do {
            round++;
            int playerGuess = input.nextInt();
            if (playerGuess > maximum) {
                System.out.println("What? That's higher than the maximum, dingus. Try again");
            } else if (playerGuess < minimum) {
                System.out.println("What? That's lower than the minimum. What are you thinking you dingus? Try again");
            } else if ((maximum >= playerGuess) && (playerGuess > randomNum)) {
                System.out.println("A little lower my dude");
            } else if ((minimum <= playerGuess) && (playerGuess < randomNum)) {
                System.out.println("A little higher my guy");
            } else {
                System.out.println("NAILED IT");
                break;
            }
        } while (round > -1);
        // Shut up
        System.out.println("Game over! It took you " + round +" tries to get the right number");

    }
}
