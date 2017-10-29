/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
//    Write a guessing game which prompts a user to guess a mystery number within some range.
//    After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
//    Upon termination, the program should display the number of guesses before successfully guessing correctly.
//    A number that is input consecutively, should register as a single guess.

    public static void main(String[] args) {
        int computerNumber;
        computerNumber = (int) (Math.random() * 9 + 1);
//        System.out.println(computerNumber);
        Scanner scanner = new Scanner(System.in);
        int userGuess;

        do{
            System.out.println("Play my guessing game! Pick a number from 1 to 10.");
            userGuess = scanner.nextInt();
            System.out.println("Your guess is: " + userGuess + ".");
            if (userGuess == computerNumber){
                System.out.println("Correct guess! You win!");
                break;
            }else if(userGuess > computerNumber){
                System.out.println("Sorry, your number is too large. Guess again.");
            }else if(userGuess < computerNumber){
                System.out.println("Sorry, your number is too small. Guess again.");
            }
        } while (userGuess != computerNumber);
    }
}
