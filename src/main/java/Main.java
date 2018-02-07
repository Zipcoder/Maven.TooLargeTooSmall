import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Random number = new Random();
        int rando = number.nextInt(100) + 1;
        Scanner input = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("Guess what it is:");
        int guess = input.nextInt();
        do{
            if (guess > rando){
                System.out.println("You're guessing too high");
                System.out.println("Guess again:");
                guess = input.nextInt();
            }
            else if (guess < rando){
                System.out.println("You're guessing too low");
                System.out.println("Guess again:");
                guess = input.nextInt();
            }
        }
        while (guess != rando);
        System.out.println("You got it! I was thinking of " + rando + "!");
        System.out.println("Winner Winner Chicken Dinner!");

    }
}