/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.*;
public class Main {

    public static void main(String[] args){
        //Creating a Scanner object
        Scanner input = new Scanner(System.in);
        //generating a random number between 1 and 10, and assigning it to the variable num.
        int num = (int)Math.ceil(Math.random()*10);
        int guess =0;
        int count =0;
        do{
            //request the user to input a number between 1 and 10
            System.out.println("please input any integer 1-10 to guess the random generated number!");
            //assign the user input in the variable guess
            guess = input.nextInt();
            //If the user input is greater than the random generated number display a respective message and increment count by 1.
            if(guess>num){
                System.out.println("The number you guessed is too large.");
                count++;
                //else if the user input is smaller display a respective message and increment count by 1.
            }else if(guess<num){
                System.out.println("The number you guessed is too small.");
                count++;
                // else display a message that the user guessed a correct number, and increment count.
            }else{
                System.out.println("Congratulations! That is a correct guess.");
                count++;
                System.out.println("You have guessed "+count+" times before getting the correct guess");
                break;
            }
        }while(guess!=num);

        
    }
}