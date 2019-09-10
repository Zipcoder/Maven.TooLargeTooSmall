import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Random rando = new Random();
        int randNum = rando.nextInt(10);

        System.out.println("Guess a number between 0 and 10: ");
        int guess = scan.nextInt();
        int count = 0;
        int current = 0;

        while(guess != randNum){
            if(guess > randNum && guess != current) {
                System.out.println("Too large");
                current = guess;
            } else if(guess < randNum && guess != current){
                System.out.println("Too small");
                current = guess;
            } else if(guess == current) {
                System.out.println("You just guessed this");
                count--;
            }
            System.out.println("Guess again");
            guess = scan.nextInt();
            count++;
        }
        count++;
        System.out.println("You got it! Only took you (" + count + ") tries.");
    }
}