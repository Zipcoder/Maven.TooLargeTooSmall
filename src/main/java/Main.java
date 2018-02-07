/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int randomInt = rand.nextInt(100) + 1;

        System.out.print("Guess a number between 1 - 100: ");

        int userNumber = 0;
        int counter = 0;

        while (userNumber != randomInt) {
            userNumber = scan.nextInt();
            counter += 1;
            if (userNumber > randomInt) {
                System.out.print("Your guess is too high, guess again: ");
            } else if (userNumber < randomInt) {
                System.out.print("Your guess is too low, guess again: ");
            }
        }

        System.out.println("Your number " + userNumber + " was the correct guess! You had " + counter + " attempts!");




        //System.out.println(userNumber);

    }
}
