import java.util.ArrayList;

public class GuessingGame {

    private double answer;
    private boolean correct;
    private ArrayList numbers = new ArrayList();

    public GuessingGame(){
        answer = (int)(Math.random() * 10);
        correct = false;
    }

    public boolean isAlreadyUsed(int newValue) {
        return numbers.contains(newValue);
    }

    public boolean isCorrect() {
        return correct;
    }

    public void addAttempt(int i) {
        numbers.add(i);
    }

    public void checkAnswer(int guess, int count) {
        if(guess > answer) {
            System.out.println("Too big");
        }
        else if(guess < answer) {
            System.out.println("Too small");
        }
        else {
            correct = true;
            System.out.println("Correct!");
            System.out.println("It took you " + count + " attempts.");
        }
    }

}
