package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //generate random number b/t 1-50 and ask user to guess
        int randomNumber = (int)(Math.random() * 50);

        System.out.println("Hello, guess a number between 1 and 50.");

        //initialize int variables to be used later
        int numberGuess;
        int previousGuess = 0;
        int totalGuesses = 0;

        //setup do-while loop since do-whiles run statements before checking conditions, unlike reg. while loop

        do {
            //scan user input and add to numberGuess, then check for equal, less, or greater than to print reply

            Scanner userGuess = new Scanner(System.in);
            numberGuess = userGuess.nextInt();


            if (numberGuess < randomNumber) {
                System.out.println("Your number is too small, try again!");
            }

            else if (numberGuess > randomNumber) {
                System.out.println("Your number is too big, try again!");
            }

            //compare previous guesses to current then continue to iterate if not equal

            if (previousGuess != numberGuess) {
                totalGuesses++;
            }

            previousGuess = numberGuess;
        }

        /* conclude do-while such that if the guess = the number print a confirmation and number of attempts
        excluding consecutive same number guesses */

        while (numberGuess != randomNumber);

            System.out.println("Great job, you guessed correctly!");
            System.out.println("You got it right in " + totalGuesses + " attempts");

        }

    }

