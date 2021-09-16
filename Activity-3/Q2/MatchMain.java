import java.util.Scanner;

public class MatchMain {

    public static void main(String[] args) {

        System.out.println("Enter the match format: \n1. ODI\n2. T20\n3. Test");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1){
            sc = new Scanner(System.in);
            System.out.println("Enter the current score: ");
            int score = sc.nextInt();
            System.out.println("Enter the current over: ");
            int over = sc.nextInt();
            System.out.println("Enter the target score: ");
            int target = sc.nextInt();
            ODIMatch odiMatch = new ODIMatch();
            odiMatch.setCurrentScore(score);
            odiMatch.setCurrentOver(over);
            odiMatch.setTarget(target);
            odiMatch.display(odiMatch.calculateRunRate(),odiMatch.calculateBalls());
        }else if(n==2){
            sc = new Scanner(System.in);
            System.out.println("Enter the current score: ");
            int score = sc.nextInt();
            System.out.println("Enter the current over: ");
            int over = sc.nextInt();
            System.out.println("Enter the target score: ");
            int target = sc.nextInt();
            T20Match t20Match = new T20Match();
            t20Match.setCurrentScore(score);
            t20Match.setCurrentOver(over);
            t20Match.setTarget(target);
            t20Match.display(t20Match.calculateRunRate(),t20Match.calculateBalls());
        }else if(n==3){
            sc = new Scanner(System.in);
            System.out.println("Enter the current score: ");
            int score = sc.nextInt();
            System.out.println("Enter the current over: ");
            int over = sc.nextInt();
            System.out.println("Enter the target score: ");
            int target = sc.nextInt();
            TestMatch testMatch = new TestMatch();
            testMatch.setCurrentScore(score);
            testMatch.setCurrentOver(over);
            testMatch.setTarget(target);
            testMatch.display(testMatch.calculateRunRate(),testMatch.calculateBalls());
        }else{
            System.out.println("Invalid Input");
        }
    }

}
