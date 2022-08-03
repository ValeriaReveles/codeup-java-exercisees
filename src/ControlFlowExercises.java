import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;
import java.util.*;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //1. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
        //2. Do while
//        int i = 2;
//        do {
//            System.out.println(i);
//            i = (int) Math.pow(i, 2);
//        } while (i <= 10000);

        //3.FizzBuzz
//        for (int i = 1; i <= 100; i++){
//            System.out.print("\n" + i + ".");
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.print("fizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.print("Fizz");
//            }else if ( i % 5 == 0){
//                System.out.print("Buzz");
//            }
//        }

        //3. Table
//        DecimalFormat df = new DecimalFormat("0");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What number would you like to go up to?");
//        String input = scanner.next();
//        System.out.print("Here is your table! \n");
//        System.out.print("number squared cubed\n");
//        int num = parseInt(input);
//        for (int i=1;  i <= num; i++) {
//            System.out.println(df.format(Math.pow(i, 1)) + "\t" + "\t" + df.format(Math.pow(i, 2)) + "\t" + "\t" + df.format(Math.pow(i, 3))  + "\t");
//        }

        //4. Display grade
        Scanner grades = new Scanner(System.in);
        int input = 0;
        System.out.print("Enter grade received: ");
        input = grades.nextInt();
        System.out.println("Here is your grade!");
        if (input > 100 || input < 0) {
            System.out.println("Please put in a percent from 0 - 100!\n");
        }

        while (input > 100 || input < 0) {

            System.out.print("What is the percentage of the student: ");
            input = grades.nextInt();
            if (input > 100 || input < 0) {
                System.out.println("Please put in a percent from 0 - 100!\n");
            }
        }
        if (input <= 100 && input >= 88) {
            System.out.print("A");
        }
        if (input <= 87 && input >= 80) {
            System.out.print("B");
        }
        if (input <= 79 && input >= 90) {
            System.out.print("A-");
        }
        if (input <= 89 && input >= 50) {
            System.out.print("F+");
        }
        if (input <= 49 && input >= 0) {
            System.out.print("F");
        }
        // so on and so forth down the grading scale
    }
}
