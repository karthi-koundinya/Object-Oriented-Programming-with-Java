import java.util.Scanner;

public class Main {
    private static String make;
    private static String vehicleNumber;
    private static String fuelType;
    private static Integer fuelCapacity;
    private static Integer cc;
    private static String audioSystem;
    private static Integer numberOfDoors;
    private static Boolean kickStartAvailable;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FourWheeler fourWheeler;
        TwoWheeler twoWheeler;
        System.out.println("1. Four Wheeler\n2. Two Wheeler\nEnter Vehicle Type:");
        int n = sc.nextInt();
        if (n==1){
            sc = new Scanner(System.in);
            System.out.println("Vehicle Make: ");
            make = sc.nextLine();
            System.out.println("Vehicle Number: ");
            vehicleNumber = sc.nextLine();
            System.out.println("Fuel Type: \n1. Petrol\n2. Diesel");
            fuelType = sc.nextLine();
            System.out.println("Fuel Capacity: ");
            fuelCapacity = sc.nextInt();
            System.out.println("Engine CC: ");
            cc = sc.nextInt();
            sc = new Scanner(System.in);
            System.out.println("Audio System: ");
            audioSystem = sc.nextLine();
            System.out.println("Number of Doors: ");
            sc = new Scanner(System.in);
            numberOfDoors = sc.nextInt();
            fourWheeler = new FourWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc,audioSystem,numberOfDoors);
            fourWheeler.displayMake();
 	    System.out.println("---Basic Information---");
            fourWheeler.displayBasicInfo();
            System.out.println("---Detail Information---");
            fourWheeler.displayDetailInfo();
        } else if (n==2){
            sc = new Scanner(System.in);
            System.out.println("Vehicle Make: ");
            make = sc.nextLine();
            System.out.println("Vehicle Number: ");
            vehicleNumber = sc.nextLine();
            System.out.println("Fuel Type: \n1. Petrol\n2. Diesel");
            fuelType = sc.nextLine();
            System.out.println("Fuel Capacity: ");
            sc = new Scanner(System.in);
            fuelCapacity = sc.nextInt();
            System.out.println("Engine CC: ");
            sc = new Scanner(System.in);
            cc = sc.nextInt();
            System.out.println("Kick Start Available (Yes/No): ");
            sc = new Scanner(System.in);
            String status = sc.nextLine();
            if (status.equals("Yes")){
                kickStartAvailable = true;
            } else {
                kickStartAvailable = false;
            }
            twoWheeler = new TwoWheeler(make,vehicleNumber,fuelType,fuelCapacity,cc,kickStartAvailable);
            twoWheeler.displayMake();
	    System.out.println("---Basic Information---");
            twoWheeler.displayBasicInfo();
	    System.out.println("---Detail Information---");
            twoWheeler.displayDetailInfo();
        } else {
            System.out.println("No Output");
        }
    }
}
