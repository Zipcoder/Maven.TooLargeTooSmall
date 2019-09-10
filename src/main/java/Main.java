import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();
        int mysteryNum = random.nextInt(10)+1;
        int count = 0;
        int previous = 0;
        System.out.println("Please guess the mystery number, between 1-10!");
        int userNum = userInput.nextInt();
        while ( userNum != mysteryNum ) {

            if (userNum > mysteryNum) {
                System.out.println("Sorry, this guess is too large.");
            } else if (userNum < mysteryNum) {
                System.out.println("Sorry, this guess is too small.");
            } else if (userNum == mysteryNum) {
                System.out.println("Correct guess! Way to go!!");
                System.out.println("It took you " + count + " guesses.");
            } else if (previous==userNum) {
                count--;
            }
            count++;
            previous = userNum;
            userNum = userInput.nextInt();
        }
            System.out.println("Correct guess! Way to go!!");
            System.out.println("It took you " + count + " guesses.");
    }
}
