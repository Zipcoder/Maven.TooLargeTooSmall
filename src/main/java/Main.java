/**
 * Created by iyasuwatts on 10/17/17.
 */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner guess = new Scanner(System.in);
        int userGuess = 0;
        int count = 0;
        int previousGuess;

        int mysteryNum = (int) (Math.random()*10+1);

        boolean condition = true;

        while (condition) {

            System.out.println("Please guess number from 1-10!");
            previousGuess = userGuess;
            userGuess = guess.nextInt();

            if (userGuess != previousGuess) {
                count++;
            }

            if (userGuess > mysteryNum) {
                System.out.println(userGuess + " is too large! Try again! Count: " + count);
            }
            else if (userGuess < mysteryNum) {
                System.out.println(userGuess + " is too small! Try again! Count: " + count);
            }
            else if (userGuess == mysteryNum) {
                System.out.println(userGuess + " is correct! Good job! Final Count: " + count);
                condition = false;
            }
        }
    }
}
