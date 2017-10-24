package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //stores users guess
        int userGuess;
        //stores previous guess
        int prevGuess = 0;
        //stores amount of guesses
        int guessCount = 0;

        //Generate random number
        int randomNumber = (int) (Math.random() * 10 + 1);

        //Prompt user for guess
        System.out.println("Guess a number between 1 and 10: ");

        do {
            Scanner scGuess = new Scanner(System.in);
            userGuess = scGuess.nextInt();

            if(userGuess < randomNumber){
                System.out.println("Guess too small");
            }

            else if(userGuess > randomNumber){
                System.out.println("Guess too large");
            }

            //check for consecutive guesses
            if(prevGuess != userGuess){
                guessCount++;
            }

            prevGuess = userGuess;

        }while(userGuess != randomNumber);


        System.out.println(userGuess + " is correct!");
        System.out.println("Correct guess achieved in " + guessCount + " guesses.");

    }
}
