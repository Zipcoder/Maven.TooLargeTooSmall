import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        int randomNumber = (int) (Math.random() * 51);//Generate random number
       // was for reference System.out.println("the number to stop the loop is " + randomNumber);
        Scanner scanner = new Scanner(System.in);
        int currentGuess = 0;
        int numberOfGuesses = 0;
        int lastGuess;

        do {
            System.out.println("Guess a number between 0-50");
            lastGuess = currentGuess;
            currentGuess = scanner.nextInt();
            numberOfGuesses++;

            if(currentGuess == lastGuess){
                numberOfGuesses--;
            }

            if(currentGuess < randomNumber) {
                System.out.println("\nToo small, guess again.\t" + "You have guessed " + numberOfGuesses + " time(s)\n");
            }
            else if(currentGuess > randomNumber) {
                System.out.println("\nToo large, guess again.\t" + "You have guessed " + numberOfGuesses + " time(s)\n");
            }
        } while(currentGuess != randomNumber);
        System.out.println("\nCorrect! With " + numberOfGuesses + " total guesses");



        } // end method main

    } // end class main
