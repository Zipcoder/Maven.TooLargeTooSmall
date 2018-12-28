import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Random number = new Random();
        int rando = number.nextInt(100) + 1;
        int counter = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("Guess what it is:");
        int guess = input.nextInt();
        int lastGuess=-1;
        while (guess != rando){
            if (guess > rando){
                lastGuess=guess;
                System.out.println("You're guessing too high");
                System.out.println("Guess again:");
                guess = input.nextInt();
                if(lastGuess != guess) {
                    counter++;
                }

            }
            else if (guess < rando){
                lastGuess=guess;
                System.out.println("You're guessing too low");
                System.out.println("Guess again:");
                guess = input.nextInt();
                if(lastGuess != guess) {
                    counter++;
                }


            }
        }

        System.out.println("You got it! I was thinking of " + rando + "!");
        System.out.println("Winner Winner Chicken Dinner!");
        System.out.println("It only took you " + counter + " guesses!");

    }
}
