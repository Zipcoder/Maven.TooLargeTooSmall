import java.util.Scanner;
import java.util.Random;

public class Main {

    static boolean rightGuess = false;
    static int counter = 0;
    static int secondUserInput =0;

    public static void main(String[] args) {

        while (rightGuess == false) {

            numberToGuess();
        }
    }

    public static void numberToGuess() {

        double randomNumber = Math.random();

            System.out.println("This is a Guess winner game, please write a number \nEnter a number ... ");

            Scanner scanner = new Scanner(System.in);

            int inputFromUser = scanner.nextInt();


            if (inputFromUser > randomNumber) {
                System.out.println("Sorry you did not win the number is too Large!!! ");

            } else if (inputFromUser < randomNumber) {

                System.out.println("Sorry you did not win, the number is too Small!!!");
            } else {

                System.out.println("You got it, You win the 50 000 000 premium!!!!");
                rightGuess = true;
            }

        System.out.println("This is a Guess winner game, please write a number \nEnter a number ... ");

        int secondInput = scanner.nextInt();

        if(inputFromUser != secondInput){
            counter++;
        }

        System.out.println("Guess "+ counter);

        }

    }


