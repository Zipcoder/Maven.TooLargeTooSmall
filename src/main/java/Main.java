/**
 * Created by iyasuwatts on 10/17/17.
 */

    import java.util.Scanner;

public class Main {

    // my first comment
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 10");
        long answer = scan.nextInt();
        long randomNumber = Math.round(Math.random() * 10);
        System.out.println(randomNumber);

        if (answer == randomNumber) {
            System.out.println("Correct!");

        } else if (answer < randomNumber) {
                System.out.println("This is too small");

        } else if (answer > randomNumber) {
            System.out.println("This is too large");
        }
    }

}