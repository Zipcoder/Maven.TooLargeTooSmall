import java.util.Scanner;
import java.util.Random;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int input = 1;
        int ans = rand.nextInt(10);
        int[] check= new int [10] ;
        int count =0;
        int num =1;
       for (int i = 0; i<11; i++) {
            System.out.println("Please insert a number between 1 and 10? ");
            input = scanner.nextInt();
           check[i] = input;

            if (input > ans)
                System.out.println("Your guess is greater than the answer");

            else if (input < ans)
                System.out.println("You guess is less than the answer");

            else if (input == ans)
                System.out.println("You got it!");


            if (check[i]!= check[num] )


           // System.out.println("Please insert a number between 1 and 10? ");
           // int ans2 = scanner.nextInt();

            //System.out.println("Thank you for playing, you total guess was " + count);


                count++;
                num++;

            System.out.println("Guess " + count);
        }

    }

}
