import java.util.*;

public class CompanyMain {

    public static void main(String[] args) {

        Company c = new Company();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the company name: ");
        c.setName(sc.nextLine());
        System.out.println("Enter the employees: ");
        c.setEmployees(sc.nextLine());
        System.out.println("Enter the Team Lead");
        c.setTeamLead(sc.nextLine());

        String s = c.getEmployees();
        String[] a = s.split(",");
        int flag = 0;
        for (int i=0; i<a.length;i++){
            if (a[i].equals(c.getTeamLead())){
                flag = 1;
                break;
            }
        }
        if (flag == 0){
            System.out.println("Invalid input");
            return;
        } 
	else {
            System.out.println("Name: " + c.getName());
            System.out.println("Employees: " + c.getEmployees());
            System.out.println("Team Lead: " + c.getTeamLead());
        }
    }
}
