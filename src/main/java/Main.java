/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args){
        Random rand=new Random();
        int computerChoice=rand.nextInt(100);
        int tries=1;
        //System.out.println(computerChoice);
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your guess from 0 to 100!");
        int guess=scanner.nextInt();
    while(guess!=computerChoice){
        int guess2=guess;
        if (guess==computerChoice){
            System.out.println("About time you got it!");
        }
        else if(guess<computerChoice){
            System.out.println("Too small. Try again!");
        }
        else if(guess>computerChoice){
            System.out.println("Too large. Try again!");
        }
        /*else if(guess>100){
            System.out.println("What's wrong with you? I said from 0 to 100!");
        }*/
        System.out.println("Enter your guess from 0 to 100!");
        guess=scanner.nextInt();
        if (guess!=guess2){
        tries++;}
    }
    System.out.println("The number was "+computerChoice);
    System.out.println("Good God! It took you "+tries+" tries");
    }
}
