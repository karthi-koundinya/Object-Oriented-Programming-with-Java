public class T20Match extends Match{

    @Override
    float calculateRunRate() {
        return ((super.getTarget()-super.getCurrentScore())/(20 - super.getCurrentOver()));
    }

    @Override
    int calculateBalls() {
        return ((20 - super.getCurrentOver())*6);
    }

    @Override
    void display(double reqRunRate, int balls) {
        System.out.println("Need "+(super.getTarget()-super.getCurrentScore())+" runs in "+balls+" balls\nRequired Run rate : "+reqRunRate);
    }
}
