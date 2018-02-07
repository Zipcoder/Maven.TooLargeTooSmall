
import java.util.Scanner;


/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int number;
        int randomNumber = (int)(Math.random() * 10 + 1);
        int attempts = 0;
        boolean correct = false;


        while (correct == false) {


            System.out.println("Guess a number between 1 and 10.");
            number = scanner.nextInt();
            attempts++;

            if (number == randomNumber){
                correct = true;


            }else if (number < randomNumber) {
            System.out.println("To Small!");

            } else if (number > randomNumber) {
            System.out.println("To Large!");
            }

        }

        System.out.println("You guessed " + randomNumber + " correctly!");
        System.out.println("You attempted "+ attempts + " times");


    }
}
