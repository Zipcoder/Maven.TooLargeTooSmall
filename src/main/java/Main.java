import java.util.Scanner;
import java.util.Random;

/**
 * Created by iyasuwatts on 10/17/17.
 */



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10.");

        Random generator = new Random();
        int min = 1;
        int max = 10;
        int randomlyGeneratedNumber = min + generator.nextInt(max);

        boolean didTheyGuessCorrectly = false;
        int count = 0;

        while (!didTheyGuessCorrectly) {
            int usersGuess = input.nextInt();
            count++;
            if (usersGuess > randomlyGeneratedNumber) {
                System.out.println("Sorry. Your guess was too big. Please try again.");
            } else if (usersGuess < randomlyGeneratedNumber) {
                System.out.println("Sorry. Your guess was too small. Please try again.");
            } else if (usersGuess == randomlyGeneratedNumber){
                System.out.println("Congratulations! You are correct. It took you exactly " + count + " tries." +
                        "\nHave a nice day.");
                didTheyGuessCorrectly = true;
            }
        }
    }
}
