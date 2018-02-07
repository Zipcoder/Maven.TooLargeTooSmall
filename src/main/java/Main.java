import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        int input = scan.nextInt();

        Random rando = new Random();
        int randNum = rando.nextInt(input + 1);

        System.out.println("Make your guess");
        int guess = scan.nextInt();
        int count = 0;
        while(guess != randNum){
            if(guess > randNum) {
                System.out.println("Too large");
            } else {
                System.out.println("Too small");
            }
            System.out.println("Guess again");
            guess = scan.nextInt();
            count++;
        }
        System.out.println("You got it! Only took you " + count + " tries.");
    }
}
