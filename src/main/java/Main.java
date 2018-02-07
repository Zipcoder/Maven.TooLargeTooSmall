import java.util.Scanner;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args){
        Scanner nin = new Scanner(System.in);
        System.out.println("Please enter an integer between 0 and 10");
        int usein = nin.nextInt();
        int random = (int)(Math.random() * 10);
        int count = 1;
            do {
                if (usein > random) {
                    System.out.println("too large");
                } else if (usein < random) {
                    System.out.println("too small");
                } else {
                    System.out.println("invalid entry");
                }
                Scanner retry = new Scanner(System.in);
                System.out.println("Enter a new number");
                usein = retry.nextInt();
                count++;
            } while (usein != random);
            if(usein == random) {
                System.out.println("correct guess");
            }

        System.out.println("You guessed " + count + " times");

        
    }
}
