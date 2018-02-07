/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Guess a number between 1 and 20 Clark:");
        int guess = in.nextInt();
        int theNum = (int) (Math.random() * 20 + 1);
        int count = 1;
        int previous = 0;

        while (guess != theNum) {
            if (guess > theNum) {
                System.out.println("too large");
            } else if (guess < theNum) {
                System.out.println("too small");
            } else if (guess == previous){
                count --;
            }
            previous = guess;
            count ++;
            System.out.println("Guess again Rusty");
            guess = in.nextInt();
        } System.out.println("correct guess it took you " + count + "guesses");
    }
}






