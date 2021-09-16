
import java.util.Scanner;

class Innings{

	private String teamname;
	private String inningsname;
	private int runs;
	
	Scanner sc= new Scanner(System.in);
	
	public void getTeamname()
	{
		System.out.println("Enter the team name:");
		teamname = sc.nextLine();
	}
	public void getInningsname()
	{
		System.out.println("Enter Session:");
		inningsname=sc.nextLine();
	}
	public void getRuns()
	{
		System.out.println("Enter runs:");
		runs=sc.nextInt();
	}
	
	public String returnInnings()
	{
		return inningsname;
	}
	public void displayInningsDetailsFirst() {
		
			System.out.print("Name:"); 
			System.out.println(teamname);
			System.out.print("Scored:");
			System.out.println(runs);
			System.out.println("Needed " + (runs+1) + " to win");
		}
	public void displayInningsDetailsSecond() {
			
	{
			System.out.print("Name:"); 
			System.out.println(teamname);
			System.out.print("Scored:");
			System.out.println(runs);
			System.out.println("Match Ended.");
	}
		
	}
}
public class InningsMain {
	
	public static void main(String[] args) {

		Innings i1 = new Innings();
		Innings i2 = new Innings();
		i1.getTeamname();
		i1.getInningsname();
		i1.getRuns();
		String p = i1.returnInnings();
		
		if(p.equals("First")) {
			i1.displayInningsDetailsFirst();
			i2.getTeamname();
			i2.getInningsname();
			i2.getRuns();
			i2.displayInningsDetailsSecond();
		}
		if(p.equals("Second"))
			i1.displayInningsDetailsSecond();
		
	}

}
