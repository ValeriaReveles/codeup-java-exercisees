import java.util.Scanner;
import static java.lang.Integer.parseInt;
import java.text.DecimalFormat;

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

        //4. Table
        DecimalFormat df = new DecimalFormat("0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        String input = scanner.next();
        System.out.print("Here is your table! \n");
        System.out.print("number squared cubed\n");
        int num = parseInt(input);
//        int x=1;
//        System.out.println("X^1\tX^2\tX^3\tX^4\tX^5\t");
        for (int i=1;  i <= num; i++) {
            System.out.println(df.format(Math.pow(i, 1)) + "\t" + "\t" + df.format(Math.pow(i, 2)) + "\t" + "\t" + df.format(Math.pow(i, 3))  + "\t");
        }
    }
}
