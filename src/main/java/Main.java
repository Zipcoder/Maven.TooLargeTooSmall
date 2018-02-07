import java.util.Random;
import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Random rand = new Random();
        int correctNum = rand.nextInt(10) +1;

        int giveNum = Integer.MIN_VALUE;
        int tries = 1;

        Scanner num = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10");
        while (giveNum != correctNum) {
            String answer = num.nextLine();
            giveNum = Integer.parseInt(answer);
            System.out.println("Your input was " + answer);

            if (giveNum == correctNum) {
                System.out.println("Correct guess");
            }
            else if(giveNum > correctNum){
                System.out.println("Too big \n Try again");
                tries++;
            }
            else if(giveNum < correctNum){
                System.out.println("Too low \n Try again");
                tries++;
            }
        }
        System.out.println("The correct number was " + correctNum);
        System.out.println("You guessed " + tries +" time(s)");


        }
    }
