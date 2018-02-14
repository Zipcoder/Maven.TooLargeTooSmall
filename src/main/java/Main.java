import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int randNum = (int) Math.ceil(Math.random() * 15);

        int stop = 0;
        int counter = 0;


         while( stop == 0) {

             System.out.println("Hello! Please enter in a number between 1 and 15");
             int guess = scan.nextInt();
             counter++;

             if (guess == randNum) {

                 System.out.println("Correct Guess!");
                 stop++;

             } else if (guess < randNum) {

                 System.out.println("Too low!");

             } else if (guess > randNum) {

                 System.out.println("Too High!");

             }

         }

        System.out.println("You guessed " + counter + " times!");

    }
}
