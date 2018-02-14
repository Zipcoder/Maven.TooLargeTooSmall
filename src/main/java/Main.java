import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int mysteryNumber = 7;
        int counter = 1;
        boolean userIsGuessing = true;

        System.out.println("I'm thinking of a number between 1 and 10, what is it?");

        while(userIsGuessing){

            int guessNumber = scanner.nextInt();

            if(mysteryNumber == guessNumber){
                System.out.println("Correct! after only " + counter + " guess(es)");
                break;
            }
            String answerBack = (guessNumber > mysteryNumber) ? "Too large " + counter + " guess" : "Too small, " + counter + " guess";
            System.out.println(answerBack);

            counter++;
            System.out.println("Try again");
            }







    }


    }

