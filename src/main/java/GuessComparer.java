/**
 * Outputs the result of a guess for use in switch in main
 */

public class GuessComparer {

    private int currentGuess;
    private int lastGuess;
    private int correctAnswer;

    public GuessComparer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
        this.currentGuess = 0;
        this.lastGuess = 0;
    }

    void setLastGuess(int lastGuess){
        this.lastGuess = lastGuess;
    }

    int getCurrentGuess(){
        return this.currentGuess;
    }

    public GuessResult tryGuess(int currentGuessNumber){
        this.currentGuess = currentGuessNumber;
        if (currentGuess == lastGuess){
            return GuessResult.same;
        } else if (currentGuess < correctAnswer){
            this.setLastGuess(currentGuessNumber);
            return GuessResult.low;
        } else if (currentGuess > correctAnswer){
            this.setLastGuess(currentGuessNumber);
            return GuessResult.high;
        } else {
            return GuessResult.correct;
        }
    }
}
