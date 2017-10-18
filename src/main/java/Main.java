import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        int upper = 100;
        int randomNum = (int)(Math.random()*upper) + 1;
        //System.out.println(randomNum);
        Scanner in = new Scanner(System.in);
        int guess = -1;
        int numOfGuess = 0;

        do{
            int temp = guess;
            System.out.println("Guess a number between 0 and "+upper +" >>");
            guess = in.nextInt();
            if(guess < randomNum){
                System.out.println("Too small");
            }else if(guess > randomNum){
                System.out.println("Too big");
            }
            if(temp != guess){
                numOfGuess ++;
            }
        } while(guess != randomNum);
        if(numOfGuess == 1){
            System.out.println("First try!");
        }else{
            System.out.println("Correct \nIt took " + numOfGuess +" guesses");
        }
        
    }
}
