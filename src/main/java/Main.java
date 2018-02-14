import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
//
//Write a guessing game which prompts a user to guess a mystery number within some range.
//        After every guess the program should display some variation of "too large", "too small", "correct guess", respectively.
//        Upon termination, the program should display the number of guesses before successfully guessing correctly.
//        A number that is input consecutively, should register as a single guess.
public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Random num = new Random();
        int actualNum;
        int guess;

        // count the number of guess
        int count = 0;
        do { //promt user to guess a number.
            System.out.println("enter a number between 1 and 10");

            actualNum = num.nextInt(10) + 1;
            guess = scan.nextInt();



        if( guess == actualNum){
            System.out.println("correct guess");
        count++;
        }

        if (guess < actualNum){
            System.out.println("too small");
        count++;

        }

        if (guess > actualNum){
            System.out.println("too large");
            count++;
        }

          //
          //  count++;
        } while (guess != actualNum);
        System.out.println("Count is: " + count);
    }
}
