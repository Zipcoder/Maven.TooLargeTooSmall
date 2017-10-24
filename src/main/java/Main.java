import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0  &  10");
        int num = scan.nextInt();
        int count= 1;
        //System.out.println(num);
        double randNum = Math.random() * 10;
        int randNum1 = (int) Math.round(randNum);
        //System.out.println("Random no is "+randNum1);
        do{
            if(num>randNum1){
                System.out.println("your no is too big try again");
                num= scan.nextInt();
                count++;
            }else {
                System.out.println("your no is too small ,try again");
                num= scan.nextInt();
                count++;
            }
        }while(num!=randNum1);

          System.out.println("Correct guess !!! you did "+count+" guesses ");
    }
}
