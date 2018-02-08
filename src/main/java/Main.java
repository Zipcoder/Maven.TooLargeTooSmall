import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int mysteryN = 7;
        int counter = 1;


        Scanner gameTime = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 10, what is it?");
        int guessMe = gameTime.nextInt();

        String answerBack = (guessMe > mysteryN) ? "Too large " + counter + "guess" : "Too small, " + counter + " guess";
        System.out.println(answerBack);

        do () {
            counter++;
//Enter ternary operator in loop and finish this thing!
        }
        System.out.println("Try again");


        }
    }

