import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args){
        Scanner userIn = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 10");
        int userNumber = userIn.nextInt();
        int random = (int)(Math.random() * 10);
        int count = 1;
            do {
                if (userNumber > random) {
                    System.out.println("too large");
                } else if (userNumber < random) {
                    System.out.println("too small");
                } else {
                    System.out.println("invalid entry");
                }
                Scanner retry = new Scanner(System.in);
                System.out.println("Enter a new number");
                userNumber = retry.nextInt();
                count++;
            } while (userNumber != random);
            if(userNumber == random) {
                System.out.println("correct guess");
            }

        System.out.println("You guessed " + count + " times");

        
    }
}
