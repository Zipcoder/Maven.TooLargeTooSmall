public class RandomNumber {

    private int lowRange;
    private int highRange;
    private int randomNumber;

    RandomNumber (int lowRange, int highRange){
        if (highRange > lowRange) {
            this.lowRange = lowRange;
            this.highRange = highRange;
        } else {
            this.lowRange = highRange;
            this.highRange = lowRange;
        }
        int difference = this.highRange - this.lowRange;
        randomNumber = (int)((Math.random() * difference) + lowRange);
    }

    public int getRandomNumber(){
        return this.randomNumber;
    }

    public int getLowRange(){
        return this.lowRange;
    }

    public int getHighRange(){
        return this.highRange;
    }

}
