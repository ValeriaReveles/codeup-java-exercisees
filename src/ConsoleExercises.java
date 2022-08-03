import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        //Exercise 1 Pi:
        double pi = 3.14159;
//        String output = "The value of pi is approximately";
//        System.out.printf("%s %s.", output, (float)pi);

//        //Exercise 2, prompt for integer:
        Scanner scanner = new Scanner(System.in);
//        System.out.print("\nEnter an integer: ");
//        int userInput = scanner.nextInt();
//        System.out.printf("You entered %s \n", userInput);
        //If not an integer, error code is given.

        //Exercise 2, prompt for 3 words:
//        scanner.nextLine();
        System.out.println("Please enter 3 words: ");
        String userWord = scanner.nextLine();
        System.out.printf("You entered %s", userWord);

        //Exercise 2, calculate perimeter:
        scanner.nextLine();
        System.out.println("Please enter the length and width: ");
        String width = scanner.nextLine();
        System.out.println(width);
//        int number1 = parseInt(width);
        String height = scanner.nextLine();
        System.out.println(height);
//        int number2 = parseInt(height);
        int total = parseInt(width)* parseInt(height);

        System.out.printf("The perimeter: %d \n", total);


    }
}
