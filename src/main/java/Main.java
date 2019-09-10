import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int myNum = (int)(Math.random() * 100);
        int currentNum = 0;
        int count = 0;
        int num = in.nextInt();

    while (myNum != num){
        if (num > myNum && num != currentNum){
            currentNum = num;
            System.out.println("Too high. Go Smaller");
            count = count + 1;
            num = in.nextInt();

        } else if (num < myNum && num != currentNum){
            currentNum = num;
            System.out.println("Too small. Bigger");
            count = count + 1;
            num = in.nextInt();
        } else if (num == currentNum){
            System.out.println("You put the same number again");
            num = in.nextInt();
        }
    }
    if (num == myNum){
        System.out.println("You got it. Took you " + count + " tries");
    }


    }

}