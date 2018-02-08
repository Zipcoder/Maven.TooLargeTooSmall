/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;




public class Main {

    public static void main(String[] args) {
        Random rng = new Random();
        int numberToGuess = rng.nextInt (100);
        int numberOfTries = 0;
        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;

        while(win == false) {

            System.out.println("Guess a Number between 1 - 100");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess){
                win = true;
            }
            else if (guess < numberToGuess){

                System.out.println("Too Small");
            }
            else if (guess > numberToGuess){
                System.out.println("Too Big");
            }
        }
        System.out.println("You Win");
        System.out.println("Number was + numberToGuess");
        System.out.println("It took" + numberOfTries + "tries");




    }}