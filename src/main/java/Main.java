import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */

public class Main {

    public static void main(String[] args){

        boolean correct = false;
        int count = 0;
        int lastValue = 0;

        GuessingGame g1 = new GuessingGame();
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.print("Please input a number: ");
            int guess = keyboard.nextInt();
            if (guess != lastValue && !g1.isAlreadyUsed(guess)) {
                g1.checkAnswer(guess, count);
                g1.addAttempt(guess);
                lastValue = guess;
                count++;
            }

        }
        while(!g1.isCorrect());

    }
}
