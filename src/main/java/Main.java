import java.util.Scanner;

/**
 * Created by Frankie!!!
 */
public class Main {

    public static void main(String[] args){

        System.out.println("Welcome to.....");
        System.out.println("...............");
        System.out.println("*Drum Roll*....");
        System.out.println("...............");
        System.out.println("Guess the number!");
        System.out.println();
        System.out.println();
        // generating a random number between 1 and 10
        int randNum = (int)(Math.random()*(10-1)+1);

        //main guessing process
        //init scanner input
        Scanner input = new Scanner(System.in);

        //loop until correct answer(i = 1)
        int i = 0;
        int counter = 0;
        int guess;
        while (i <= 0){
            System.out.println("Enter a whole number between 1 and 10: ");
            guess = input.nextInt();
            counter++;
            if (guess == randNum) {
                System.out.println("Congrats! You guessed the right number!");
                i++;
            }
            else if(guess > randNum){
                System.out.println("The number you guessed is too large");
            }
            else if (guess < randNum){
                System.out.println("The number you guessed is too small");
            }
            else{
                System.out.println("ERROR!");
            }
           
            System.out.println();
            System.out.println();
        }
        System.out.println("You guessed " + counter + " times.");
    }
}
