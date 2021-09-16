import java.util.*;

public class CustomerMain {

    public static void main(String[] args) {

        Customer c = new Customer();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details:");
        String s = sc.nextLine();
        String[] a = s.split(",");

        c.setName(a[0]);
        c.setAddress(a[1]);
        c.setMobile(a[2]);

        System.out.println("Name: "+c.getName());
        System.out.println("Address: "+c.getAddress());
        System.out.println("Mobile: "+c.getMobile());
    }
}
