import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int minVal = 0;
        int maxVal = 10;
        int userGuess;
        int numberOfGuesses = 1;
        int previousGuess = 0;


        //generate random number
        Random randomNumber = new Random();
        int randomValue = randomNumber.nextInt(maxVal);

        //scanner for input
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between " + minVal + " and " + maxVal);

        //user input
        userGuess = input.nextInt();

        while (userGuess != randomValue){
            if (userGuess < randomValue && userGuess != previousGuess) {
                System.out.println("too small");
            } else if (userGuess > randomValue && userGuess != previousGuess) {
                System.out.println("too large");
            } else if(previousGuess == userGuess){
                System.out.println("previous answer try again");
                numberOfGuesses--;
            }

            previousGuess=userGuess;
            userGuess = input.nextInt();
            numberOfGuesses++;

        }

        System.out.println("Correct!");
        System.out.println("Number of guesses " + numberOfGuesses);

        }



    }
