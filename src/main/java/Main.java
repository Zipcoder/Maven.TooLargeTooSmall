import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        // Generate & assign random number
        Random rand = new Random();
        int n = rand.nextInt(10) + 1;
        int userNum = 0;

        // Collect user input number
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number between 1 and 10:  ");
            userNum = sc.nextInt();

            // Compare user input to random number and print statements accordingly
            if (userNum < n) {
                System.out.println("Too small. Guess again.");
            } else if (userNum > n) {
                System.out.println("Too large. Guess again.");
            }

            }
            while (userNum != n);

        System.out.println("Correct guess.");

    }
}
