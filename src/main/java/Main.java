import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Choose a whole number between the number 0 and 9.");

        int randomInt = (int) Math.floor(Math.random() * 10);


        Scanner scanner = new Scanner(System.in);

        int guessCount = 0;
        int currentGuess;
        int lastGuess=-1;


        do {

            currentGuess = scanner.nextInt();

            if (currentGuess > randomInt) {
                System.out.println("Too large!");

            } else if (currentGuess < randomInt) {
                System.out.println("Too small! ");

            }

            if (currentGuess != lastGuess) {
                guessCount++;
            }
            System.out.println("Guess again.");

            lastGuess = currentGuess;




        }
        while (currentGuess != randomInt);


        System.out.println("Correct! Well done.");
        System.out.println("You made " + guessCount + " guesses...lol");

    }


}

