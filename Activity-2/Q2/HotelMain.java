import java.util.Scanner;

public class HotelMain {

    public static void main(String[] args) {

        System.out.println("Hotel Tariff Calculator\n1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\nSelect Room Type");
        Scanner sc = new Scanner(System.in);
        HotelRoom hotelRoom;

        int n = sc.nextInt();
        if (n==1){
            System.out.println("Hotel Name:");
            sc = new Scanner(System.in);
            String hotelName = sc.nextLine();
            System.out.println("Room Square Feet Area:");
            Integer area = sc.nextInt();
            System.out.println("Room has TV (true/false):");
            boolean status = sc.nextBoolean();
            System.out.println("Room has Wifi (true/false):");
            boolean status2 = sc.nextBoolean();
            hotelRoom = new DeluxeRoom(hotelName,area,status,status2);
            System.out.println("Room Tariff per day is: "+hotelRoom.calculateTariff());
        } else if (n==2){
            System.out.println("Hotel Name:");
            sc = new Scanner(System.in);
            String hotelName = sc.nextLine();
            System.out.println("Room Square Feet Area:");
            Integer area = sc.nextInt();
            System.out.println("Room has TV (true/false):");
            boolean status = sc.nextBoolean();
            System.out.println("Room has Wifi (true/false):");
            boolean status2 = sc.nextBoolean();
            hotelRoom = new DeluxeACRoom(hotelName,area,status,status2);
            System.out.println("Room Tariff per day is: "+hotelRoom.calculateTariff());
        } else if (n==3){
            System.out.println("Hotel Name:");
            sc = new Scanner(System.in);
            String hotelName = sc.nextLine();
            System.out.println("Room Square Feet Area:");
            Integer area = sc.nextInt();
            System.out.println("Room has TV (true/false):");
            boolean status = sc.nextBoolean();
            System.out.println("Room has Wifi (true/false):");
            boolean status2 = sc.nextBoolean();
            hotelRoom = new SuiteACRoom(hotelName,area,status,status2);
            System.out.println("Room Tariff per day is: "+hotelRoom.calculateTariff());
        }

    }
}
