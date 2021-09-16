import java.util.Scanner;

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

        System.out.println("Verify and Update the details:");
        System.out.println("Menu\n1. Update Employee name\n2. Update Employee Address\n3. Update Employee mobile\n4. All information correct/Exit");

        int number = sc.nextInt();
        while(number != 4) {
            if (number == 1) {
                System.out.println("Current Name is :" + e1.getName());
                System.out.println("Enter the Name: ");
                Scanner sc2 = new Scanner(System.in);
                e1.setName(sc2.nextLine());
            } else if (number == 2) {
                System.out.println("Current Address is :" + e1.getAddress());
                System.out.println("Enter the Address: ");
                Scanner sc2 = new Scanner(System.in);
                e1.setAddress(sc2.nextLine());
            } else if (number == 3) {
                System.out.println("Current Mobile is :" + e1.getAddress());
                System.out.println("Enter the Mobile: ");
                Scanner sc2 = new Scanner(System.in);
                e1.setAddress(sc2.nextLine());
            }

            System.out.println("Verify and Update the details:");
            System.out.println("Menu\n1.Update Employee name\n2.Update Employee Address\n3.Update Employee mobile\n4.All information correct/Exit");
            number = sc.nextInt();
        }

        System.out.println("The details are");
        System.out.println("Name: "+ e1.getName());
        System.out.println("Address: " + e1.getAddress());
        System.out.println("Mobile: " + e1.getMobile());
    }
}
