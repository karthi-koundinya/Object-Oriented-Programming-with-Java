import java.util.*;

public class ShapeMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Circle\nSquare\nEnter the shape");
        String shapeName = sc.nextLine();

        if (shapeName.equals("Circle")){
            System.out.println("Enter the radius");
            int radius = sc.nextInt();
            Circle circle = new Circle();
            circle.setValue(radius);
            System.out.println("Area of Circle is: "+circle.calculateArea(radius));
        } else if(shapeName.equals("Square")){
            System.out.println("Enter the side");
            int edge = sc.nextInt();
            Square square = new Square();
            square.setValue(edge);
            System.out.println("Area of Square is: "+square.calculateArea(edge));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
