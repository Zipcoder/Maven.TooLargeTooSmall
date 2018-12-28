import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        int count = 0;
        int mysteryNum = rand.nextInt(1000);
        System.out.println("Please guess to find the mystery number. The mystery number is between 0 and 1000.");
        while (true) {
            int userNum = userInput.nextInt();
            count++;
            if (userNum > mysteryNum) {
                System.out.println("Too large. Please guess again.");
            } else if (userNum < mysteryNum) {
                System.out.println("Too small. Please guess again.");
            } else if (userNum == mysteryNum) {
                System.out.println("Correct guess!");
                System.out.println("It took you " + count +" guesses.");
                break;
            }
        }
    }
}
