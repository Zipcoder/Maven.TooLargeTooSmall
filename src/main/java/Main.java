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
        if (firstPrompt)
        {
            System.out.println("Guess an integer between " + rand.getLow() + " and " + rand.getHigh());
        }
        else {
            System.out.println("Please enter an integer between " + rand.getLow() + " and " + rand.getHigh());
        }

        String s = input.nextLine();

        if (isInteger(s))
        {
            return Integer.parseInt(s);
        }
        else
        {
            return getGuess(input, false, rand);
        }
    }

    public static boolean isCorrect(int guess, RandomNumber rand, int guessNum) {
        if (rand.getN() > guess)
        {
            System.out.println("Too low");
            return false;
        }
        else if (rand.getN() < guess)
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
    private int low;
    private int high;
    private int n;

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    public int getN() {
        return n;
    }

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