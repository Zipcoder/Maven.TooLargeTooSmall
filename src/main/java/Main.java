

import java.util.Random;
import java.util.Scanner;


/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int input = 15;
        int priorTrial = 15;
        int ans = rand.nextInt(10);
        System.out.println("Answer " + ans);
        int count = 0; //add after each guess


        while (input != ans) {
            System.out.println("Please insert a number between 0 and 10: "); //make a guess
            priorTrial = input;
            input = scanner.nextInt();

            if (input > ans) {
                System.out.println("Too large");
            } else if (input < ans) {
                System.out.println("Too small");
            } else {
                count++;
                System.out.println("You got it after " + count + " trial(s)");
            }
            if (priorTrial != input) {
                count++;
            }
        }
    }

}




