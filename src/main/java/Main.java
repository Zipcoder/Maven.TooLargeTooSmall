/**
 * Created by iyasuwatts on 10/17/17. Linda
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        //input a number
        int myNumber;
        // generate a random number4
        int computerGuess = (int) Math.floor(Math.random()*10);
        // number of tries variable
        int numberOfTries = 1;

        // opening statement - guess a number between 1 - 10
        System.out.println("Guess a number between 0 to 10");
        myNumber = in.nextInt();

do {
    if(myNumber > computerGuess) {
        System.out.println("Your number is too large! Guess again.");
        myNumber = in.nextInt();
        numberOfTries++;
    }

    else if (myNumber < computerGuess) {
        System.out.println("Your number is too small. Guess again.");
        myNumber = in.nextInt();
        numberOfTries++;

    }


}   while (myNumber != computerGuess);
        System.out.println("Yay, that's the correct guess!");
        System.out.println("It took you " + numberOfTries + " tries to get the correct number.");

    }
}
