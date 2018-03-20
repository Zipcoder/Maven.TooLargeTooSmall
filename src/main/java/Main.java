/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        RandomNumber rand = new RandomNumber(100);
        int guessNum = 0;

        testGuess(input, true, rand, guessNum);
    }

    public static void testGuess(Scanner input, boolean firstPrompt, RandomNumber rand, int guessNum) {
        int guess;

        guess = getGuess(input, firstPrompt, rand);
        guessNum++;

        if(!isCorrect(guess, rand, guessNum))
        {
            testGuess(input, true, rand, guessNum);
        }
    }

    public static int getGuess(Scanner input, boolean firstPrompt, RandomNumber rand) {
        int n = 0;
        if (firstPrompt)
        {
            System.out.println("Guess an integer between " + rand.low + " and " + rand.high);
        }
        else {
            System.out.println("Please enter an integer between " + rand.low + " and " + rand.high);
        }

        String s = input.nextLine();

        if (isInteger(s))
        {
            n = Integer.parseInt(s);
            return n;
        }
        else
        {
            return getGuess(input, false, rand);
        }
    }

    public static boolean isCorrect(int guess, RandomNumber rand, int guessNum) {
        if (rand.n > guess)
        {
            System.out.println("Too low");
            return false;
        }
        else if (rand.n < guess)
        {
            System.out.println("Too high");
            return false;
        }
        else {
            if(guessNum == 1)
            {
                System.out.println("You got it! It took " + guessNum + " guess.");
            }
            else
            {
                System.out.println("You got it! It took " + guessNum + " guesses.");
            }

            return true;
        }
    }

    public static boolean isInteger(String s) {
        try
        {
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException ex)
        {
            return false;
        }
    }
}

class RandomNumber
{
    public int low;
    public int high;
    public int n;

    public RandomNumber(int bound) {
        Random rand = new Random();

        int a = rand.nextInt(bound);
        int b = rand.nextInt(bound);

        if(a > b)
        {
            high = a;
            low = b;
        }
        else
        {
            low = a;
            high = b;
        }

        n = rand.nextInt(high - low) + low;
    }
}