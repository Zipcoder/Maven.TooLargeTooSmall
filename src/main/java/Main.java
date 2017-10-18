import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's play a game!");
        System.out.println(" ");

        int guess = -1;
        int sameGuess = -1;
        int count = 0;
        int answer = (int) (Math.random() * 20 + 1);

        System.out.println("Pick a number between 1 and 20!");

        while (guess != answer) {
            guess = scanner.nextInt();
            if (guess == sameGuess) {
                System.out.println("Don't pick the same number twice!");
                continue;
            } else {
                sameGuess = guess;
                count++;
            }
            if (guess < answer) {
                System.out.println("Too small! Try again!");
            } else if (guess > answer) {
                System.out.println("Too large! Try again!");
            }

        }
        System.out.println("Correct! It took you " + count + " times to win!");
    }
}

