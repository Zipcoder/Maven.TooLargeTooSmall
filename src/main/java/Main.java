import java.util.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {

        int userNumber;
        RandomNumber randNumObj = new RandomNumber(0, 50);
        int randomNumber = randNumObj.getRandomNumber();

        Scanner userInput = new Scanner(System.in);

        GuessComparer guessComp = new GuessComparer(randomNumber);

        int numberOfGuesses = 0;

        do {
            System.out.printf("Guess a number from %d to %d\n",
                    randNumObj.getLowRange(), randNumObj.getHighRange());
            userNumber = userInput.nextInt();

            switch (guessComp.tryGuess(userNumber)){
                case same:
                    System.out.println("Same number as last time! Are you even trying?");
                    break;
                case low:
                    System.out.println("Wrong! Too low, try again!");
                    break;
                case high:
                    System.out.println("Wrong! Too high, try again!");
                    break;
                case correct:
                    numberOfGuesses++;
                    System.out.printf("You guessed correctly! Correct number was %d. It took you %d guesses.",
                            randomNumber, numberOfGuesses);
                    break;
            }

            numberOfGuesses++;

        } while (userNumber != randomNumber);
    }
}
