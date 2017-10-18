/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 10");
        System.out.println(randomNumber);
        int userNumber;

        do {
            userNumber = scanner.nextInt();
            if (randomNumber > userNumber) {
                System.out.println("too small");
            } else if (randomNumber < userNumber) {
                System.out.println("too large");
            } else {
                System.out.println("correct guess");
            }

        } while (userNumber != randomNumber);
    }
}
