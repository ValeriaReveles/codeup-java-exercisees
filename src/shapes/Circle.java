package shapes;
import java.lang.Math;

public class Circle {
//class should have a private radius field set through constructor;
//should have methods for getting info about circle below:

//    The formulas for circumference and area:
//    circumference = 2 x pi x radius
//    area = pi x (radius ^ 2)
//    For the value of pi, use the PI constant of the Math class.


    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    public double getArea(){
        double area = Math.PI * this.radius * this.radius;
        return area;
    }

    public double getCircumference(){
        double circumference = Math.PI * 2 * this.radius;
        return circumference;
    }

}
