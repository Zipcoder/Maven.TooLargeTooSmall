import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String guess;
        int numGuesses = 0;
        int range = 100;
        int ranNum = (int) (Math.round(Math.random() * range));
        int input;
        int prevInput = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Please guess a number between 0 and " + range);
            input = sc.nextInt();

            //guess = guessCorrect(input, ranNum);
            guess = guessCorrect(input, ranNum);
            System.out.println(guess);
            System.out.println();
            if (prevInput == 0) {
                numGuesses++;
            }
            else if (prevInput != 0 && !(prevInput == input)) {
                numGuesses++;
            }

            prevInput = input;

        } while (input != ranNum);

        System.out.println("Number of guesses before being correct: " + numGuesses);
    }


    static String guessCorrect(int input, int ranNum) {
        String answer;

        if (input > ranNum) {
            answer = "Nope, too large. Try again!";
        } else if (input < ranNum) {
            answer = "Awh sorry, too small. Try again!";
        } else {
            answer = "Perfect guess! Good job!";
        }

        return answer;
    }
}
