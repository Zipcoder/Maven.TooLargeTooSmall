import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner reader = new Scanner(System.in);
        int solution = generator.nextInt(100);
        int tryCounter = 0;
        System.out.print("What number am I thinking of?...\n ");
        int input = reader.nextInt();
    while (input != solution){
         if (input > solution) {
                System.out.print("Thats too high try again\n> ");
                input = reader.nextInt();
            }
            else if (input < solution) {

                System.out.println("Thats too low try again\n> ");
                input = reader.nextInt();
            }
        }
            System.out.print("Damn you're pretty good!");
    }
         // System.out.println(tryCounter);
}