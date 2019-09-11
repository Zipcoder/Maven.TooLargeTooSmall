

import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey! Guess a mystery number: ");
        int guess = scan.nextInt();

        //Random random = new Random();
        //int guess = random.nextInt();
        //Need to create an int arr
        int correctGuess = 4;
        int counter = 0;
        int[] hold = new int[guess];


            if (correctGuess < guess) {
                System.out.println("too small");
                counter++;
            } else if (correctGuess >= guess) {
                System.out.println("too large");
                counter++;
            } else if (guess < correctGuess) {
                System.out.println("correct guess");
            }
            System.out.println(counter);

    }
}

