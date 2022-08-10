package shapes;
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        //All the prompting and heavy-duty work will go under main. circle class is purely to create circle area and circumference.

        Input input = new Input();
        System.out.println("Enter radius of circle: ");
        double radius = input.getDouble();

        //this creates a new circle variable, creates a new circle every time called:
        Circle circle = new Circle(radius);

        //this is to print getArea with circle and radius passed:
        System.out.println(circle.getArea());

        //this is to print circumference with circle and radius passed:
        System.out.println(circle.getCircumference());

        //Bonus: prompt user to continue creating circle with yesNo() until they say no. Before exiting, program should output the number of circles created. To do this, refactor code into loop:

//        while(true) {
//            double radius = input.getDouble("Enter radius of circle: ");
//            Circle circle = new Circle(radius);
//            System.out.println(circle.getArea());
//            System.out.println(circle.getCircumference());
//
//            // ask user if they want to keep making circles
//            boolean keepMakingCircles = input.yesNo("Do you want to keep making circles? yes/no ");
//            if(keepMakingCircles == false) {
//                break;
//            }
//        }

    }

}

