/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1 - 25: ");

        Random randNum = new Random();
        int answer = randNum.nextInt(25) + 1;
        int count = 0;
        while (true) {
            int userInput = input.nextInt();
            count ++;
            if (userInput > answer) {
                System.out.println("Too large, try again: ");
            } else if (userInput < answer) {
                System.out.println("Too Small, try again: ");
            } else {
                System.out.println("That is the correct number!!");
                System.out.println("You guessed: " + count + " times before guessing right");
                break;
            }
        }
    }
}

