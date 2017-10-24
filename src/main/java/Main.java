import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int guess=-1;
        int pGuess=-1;
        int count=0;
        int answer= (int)(Math.random()*10+1);

        System.out.println("Choose a Number between 1 and 10 (Inclusive)");

        while(guess!=answer){

         System.out.print("What is your guess? ");

            guess=in.nextInt();

            if(guess==pGuess){
                System.out.println("Enter a different number!");
                continue;
            }
            else{
                pGuess=guess;
                count++;
            }

            if (guess<answer){
                System.out.println("Too Small");
            }
            else if(guess>answer){
                System.out.println("Too Large");
            }

        }

        System.out.println("You win! It only took you "+count+" try(s).");
    }
}
