import java.util.Scanner;
import java.util.Random;

/**
 * Created by iyasuwatts on 10/17/17.
 * This code checks if a user input number is equal to randomly generated number
 */
public class Main {


    public static void main(String[] args) {

        Random rand = new Random();
        int ans = rand.nextInt(10);   // generate random number between 0 -10
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number between 1 and 10? ");
        int input = scanner.nextInt();  // save user input into input variable
        int guess = 11;       // variable created to update the input variabe  inside the while looping
        int count = 0;      // counts the number of guess

        while (input != ans) {

            if (input > ans)
                System.out.println("Your guess is greater than the answer");

            else if (input < ans)
                System.out.println("You guess is less than the answer");

            else if (input == ans)
                System.out.println("You got it!");

            else

                System.out.println("Please insert a number between 1 and 10? ");
                guess = scanner.nextInt();


                if (input != guess) {
                    count++;
                    input = guess;
                }

            }
            System.out.println("You got it!. The number is " + ans + ". The number of guess is " + count);

        }

    }
