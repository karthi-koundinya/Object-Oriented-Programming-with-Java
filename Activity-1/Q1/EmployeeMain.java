import java.util.*;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name: ");
        e1.setName(sc.nextLine());

        System.out.println("Enter Address: ");
        e1.setAddress(sc.nextLine());

        System.out.println("Enter Mobile: ");
        e1.setMobile(sc.nextLine());

        System.out.println("Employee Details");
        System.out.println("Name: "+ e1.getName());
        System.out.println("Address: " + e1.getAddress());
        System.out.println("Mobile: " + e1.getMobile());

    }
}
