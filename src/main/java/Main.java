import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        boolean keepGuessing = true;
        int min = getIntegerInput("Give an integer for the desired minimum value of a range:");
        int max = getIntegerInput("Give an integer for the desired maximum value of a range:");


        if (min >= max) {

            max = getIntegerInput("Give a higher number than your previous value: ");

        } else {
            int guessedNumber = getIntegerInput("Guess a number between: " + min + " & " + max);

            Random rand = new Random();
            int randomNumber = rand.nextInt(max) + min;

            int guessCount = 0;
            int prevGuessedNumber= 0;


            while (keepGuessing) {

                if(guessedNumber == randomNumber) {
                    guessCount++;
                    keepGuessing = false;

                }else if (guessedNumber < randomNumber && guessedNumber != prevGuessedNumber) {
                    guessCount++;
                    prevGuessedNumber = guessedNumber;
                    System.out.println("Your guess is too low!!!");
                    guessedNumber = getIntegerInput("Guess a number between: " + min + " & " + max);

                }else if (guessedNumber > randomNumber && guessedNumber != prevGuessedNumber) {
                    guessCount++;
                    prevGuessedNumber = guessedNumber;
                    System.out.print("Your guess is too high!!!");
                    guessedNumber = getIntegerInput("Guess a number between: " + min + " & " + max);
                }else if (guessedNumber == prevGuessedNumber){
                    System.out.print("You have just guessed this value, please choose another value for your guess.");
                    guessedNumber = getIntegerInput("\n" + "Guess a number between: " + min + " & " + max);
                }

            }

            System.out.println
                    ("You guessed the random number : " + randomNumber + ".  It took you: " + guessCount + " tries");
        }
    }

    public static Integer getIntegerInput(String prompt) {
        Scanner scanner =  new Scanner(System.in);
            System.out.println(prompt);
            String userInput = scanner.nextLine();
            int intUserInput = Integer.parseInt(userInput);
            return intUserInput;
        }
}