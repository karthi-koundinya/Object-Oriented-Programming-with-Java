abstract class Match {

    private int currentScore;
    private int currentOver;
    private int target;

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public int getCurrentOver() {
        return currentOver;
    }

    public void setCurrentOver(int currentOver) {
        this.currentOver = currentOver;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    abstract float calculateRunRate();
    abstract int calculateBalls();
    abstract void display(double reqRunRate, int balls);
}
