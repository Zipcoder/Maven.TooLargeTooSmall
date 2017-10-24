import java.util.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {

    public static void main(String[] args){
        //write a guess game to prompt user to guess a number from 1 to 10
        int answer = (int) (Math.random()*10+1);
        Scanner in = new Scanner(System.in);
        int numGuess = 0;
        int guess;
        int lastGuess=0;

        do {

           System.out.println("Pick a number from 1-10: ");
           guess = in.nextInt();

            //as long as the guess does not equal to answer, keep guessing
            if (guess > answer){
                System.out.println("Too large");
            }
            else if(guess < answer){
                System.out.println("Too small");
            }
            else{
                System.out.println("Correct answer");
            }
            if (lastGuess != guess)
                numGuess++;

                lastGuess = guess;
        }
        while(guess != answer);
        System.out.println(numGuess);
//        //when it's done, program should display the number of guesses before the user finally gets it right
//        //if the guess number is consecutively, it should register as single guess
    }
}
