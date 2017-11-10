import java.util.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {
    public static void main(String[] args) {
        int guesses = 1;
        Random random = new Random();
        int answer = random.nextInt(10) + 1;
        boolean correct = false;
        System.out.println("take a guess");
        while (correct == false){
            Scanner scan = new Scanner(System.in);
            int guess = scan.nextInt();
            if (guess>answer){
                System.out.println("too big");
                guesses++;
            }
            else if (guess<answer){
                System.out.println("too small");
                guesses++;
            }
            else {
                System.out.println("good job " + guesses + " guesses is all that it took you");
            }
        }
    }
}





