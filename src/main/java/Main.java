/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 20;
        Random rand = new Random();
        int answer = rand.nextInt(10);
       System.out.println("The answer is:" + answer);
        int guessed = 0;
        int pg = 11;

        while (input != answer) {
            System.out.print("Guess a number between 1 - 10: ");
            pg = input;
            input = scanner.nextInt();

            if (input > answer){
                System.out.println("You guessed too high" );

            } else if  (input < answer){
                System.out.println("You guessed too low");
            } else {
                System.out.println("You guessed correctly");
                guessed++;
                System.out.println("You made a total of " + guessed +  " guesses.");
            }

            if (pg != input){
                guessed++;
            }






            //System.out.println("current -- " + currentGuess + " " + input);



            //String guess = scanner.nextLine();

        }
    }
}