import java.util.Scanner;
import java.util.Random;

/**
 * Created by iyasuwatts on 10/17/17.
 */



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10.");

        Random generator = new Random();
        int min = 1;
        int max = 10;
        int randomlyGeneratedNumber = min + generator.nextInt(max);

        boolean didTheyGuessCorrectly = false;
        int count = 0;

        while (!didTheyGuessCorrectly) {
            int usersGuess = input.nextInt();
            count++;
            if (usersGuess > randomlyGeneratedNumber) {
                System.out.println("Sorry. Your guess was too big. Please try again.");
            } else if (usersGuess < randomlyGeneratedNumber) {
                System.out.println("Sorry. Your guess was too small. Please try again.");
            } else if (usersGuess == randomlyGeneratedNumber){
                System.out.println("Congratulations! You are correct. It took you exactly " + count + " tries." +
                        "\nHave a nice day.");
                didTheyGuessCorrectly = true;
            }
        }
    }
}















/*
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10.");

        Random randomNum = new Random();

        int desiredInt = randomNum.nextInt(10) + 1;
        int count = 0;

        boolean flag = false;

        while (!flag) {
            int userResponse = input.nextInt();
            count++;
            if (userResponse > desiredInt) {
                System.out.println("Sorry. Your guess is too great.");
            } else if (userResponse < desiredInt) {
                System.out.println("Sorry. Your guess is not large enough.");
            } else if (userResponse == desiredInt) {
                System.out.println("Congratulations! You just did something an untrained monkey could do.... " +
                        "But don't feel too badly. The monkey totally got it right on the first try and it" +
                        " only took you " + count + " tries.");
                flag = true;
            }

        }

        /*
        for (int i = 0; i < response; i++){

            if (response > desiredInt) {
                System.out.println("Sorry. Your answer is too great.");
            } else if (response < desiredInt){
                System.out.println("Sorry. Your answer is not large enough.");
            } else if (response == desiredInt){
                System.out.println("Congratulations! You just did something a monkey could do....");
            }
            count += i;
        }



        System.out.println(count);
*/

