
import java.util.Random;
import java.util.Scanner;


/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {


    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        Random rng = new Random();
        int numberToGuess = rng.nextInt(100);
        int numberOfTries =0;
        System.out.println(numberOfTries);
        System.out.print("pick a number 1-5");
        Integer pickAnumber = stdin.nextInt();

        Integer answer = 3;
        int guessPick = 0;


        if (pickAnumber == answer) {

            System.out.print("Correct guess");
        } else if (pickAnumber > answer) {

            System.out.print("Too large");

            } else if (pickAnumber < answer) {
                    System.out.println("Too small");

                }

                }


            }

