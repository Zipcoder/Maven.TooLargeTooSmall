import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){


        System.out.println("I'm thinking of a number between 0 and 100 (inclusive)");

        int myNum = (int)(Math.random()*101);
        //System.out.println(myNum);

        Scanner scan = new Scanner(System.in);
        System.out.println("Get guessing.");

        int guess = 0;
        int guess_check =0;
        int count = 0;

        do{
            guess = scan.nextInt();

            if (guess > myNum){
                System.out.println("too high");
            }else if (guess < myNum){
                System.out.println("too low");
            }

            if (guess_check != guess){count++;}
            guess_check = guess;


        }
        while ( guess!= myNum );

        System.out.println("Boom. " + count + " guesses.");


        //int guess;




        
    }
}
