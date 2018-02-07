import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
import java.util.Random;
/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Random rand = new Random();
        int correctnum = rand.nextInt(10) + 1;

        int givennumber = Integer.MIN_VALUE;
        int attemps = 0;

        Scanner number = new Scanner(System.in);
        System.out.println("Pick a number between 1 and 10");
        while (givennumber != correctnum) {
            String answer = number.nextLine();
            givennumber = Integer.parseInt(answer);
            System.out.println("You guessed " + answer);



            if (givennumber == correctnum) {
                System.out.println("You win!");
            } else if (givennumber >= correctnum) {
                System.out.println("Too big, guess again");
                ++attemps;
            } else if (givennumber <= correctnum) {
                System.out.println("Too Small, guess again");
                ++attemps;
            }
        }
        System.out.println("The correct answer was " +  correctnum);
        System.out.println("You guessed " + attemps +" time(s)");
    }
}
