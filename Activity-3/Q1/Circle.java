import java.math.*;

public class Circle extends Shape{

    @Override
    double calculateArea(double value) {
        return Math.PI*value*value;
    }
}
