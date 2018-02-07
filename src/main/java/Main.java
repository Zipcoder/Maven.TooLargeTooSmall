import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int number = (int) Math.floor(Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number I am thinking of. The number is between 1 - 100");
        int inputNumber = input.nextInt();
        int duplicateNumber = inputNumber;
        int count = 0;
        while (inputNumber != number) {
            if (inputNumber < number) { // check in guess was lower
                System.out.println("Your guess was too low! Try again!");
                inputNumber = input.nextInt();
                if (inputNumber != duplicateNumber) {   // check if number is the same as the last number entered
                    count++;
                }
                duplicateNumber = inputNumber;
            }
            if (inputNumber > number) { // check if guess was higher
                System.out.println("Your guess was too high! Try again!");
                inputNumber = input.nextInt();
                if (inputNumber != duplicateNumber) {   // check if number is the same as the last number entered
                    count++;
                }
                duplicateNumber = inputNumber;
            }
        }
        System.out.println("You guessed the number! It took you " + count + " tries.");

    }
}
