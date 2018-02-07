import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Random randomNumber = new Random();
        Scanner jcScan = new Scanner(System.in);
        int computerValue = randomNumber.nextInt(30);
        int numberOfTries = 0;
        int success = 0;
        int guess = 0;

        while (success == 0) {
            System.out.println("Please enter an integer between 1 and 30 inclusive: ");
            guess = jcScan.nextInt();
            numberOfTries++;

            if (guess < 1 || guess > 100){
                System.out.println("Invalid input");
            }

            else if (guess == computerValue){
                success++;
                System.out.println("YOU DID IT! You da bomb!\n");
                System.out.println("The number of tries was: " + numberOfTries);
            }
            else if (guess < computerValue){
                System.out.println("Too Low, Joe");
            }
            else if (guess > computerValue){
                System.out.println("Too High, guy");
            }
        }
        
    }
}
