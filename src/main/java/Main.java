/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            - Write a guessing game which prompts a user to guess a mystery number within some range
            - After every guess the program should display some variation of "too large", "too small", "correct"
            - Display the number of guesses before successfully guessing correctly
            - A number that is input consecutively should register as a single guess.
         */

        //Variables
        int counter = 0;
        Random randomInt = new Random();
        int number;
        int currentGuess;
        int previousGuess = 0;

        //How to get a random number
        number = randomInt.nextInt(10);
        //System.out.println(number);

        //Scanner
        Scanner scanner = new Scanner(System.in);

        do {


            System.out.println("Guess a number: ");
            currentGuess = scanner.nextInt();


            if(previousGuess != currentGuess){

                counter++;
            }



            if (currentGuess == number) {

                System.out.println("You guessed correct");


            } else if (currentGuess > number) {

                System.out.println("Too Large");

            } else if (currentGuess < number) {

                System.out.println("Too Small");

            }


            previousGuess = currentGuess;


        } while (currentGuess != number);







        System.out.println("You guessed " + counter + " of time(s).");


    }


}

