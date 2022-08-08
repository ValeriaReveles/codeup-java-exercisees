import java.util.Scanner;

public class MethodsExercises {
    //EVERYTHING (Methods and main) have to be inside the MethodsExercises class:
    public static void main(String[] args) {
        //needs void when no "return" value, otherwise will not compile:
        //Can output all system prints under main and have methods separate:
        System.out.println("4 + 2 = " + additionMethod(4, 2));
        System.out.println("4 - 2 = " + subtractionMethod(4, 2));
        System.out.println("4 * 2 = " + multiplicationMethod(4, 2));
        System.out.println("4 / 2 = " + divisionMethod(4, 2));
        System.out.println("modulus of 4 / 2 = " + modulusMethod(4, 2));
        System.out.println("Factorial of input passed is: " + Factorial(4));

        //Calls method and passes parameters/values of min and max;
        getInteger(1, 10);
        //Calls roll dice method:
        rollDice(5);
    }

    //Individual methods can be outside the main methods, but need to be inside the class:

    //Most basic method syntax in java:
//    public static returnType methodName([param1[, param2[, ...]]) {
//        // the statements of the method
//        // a return statement, if a return type is declared
//    }

    public static int additionMethod(int x, int y) {
        return x + y;
    }

    public static int subtractionMethod(int x, int y) {
        return x - y;
    }

    public static int multiplicationMethod(int x, int y) {
        return x * y;
    }

    public static int divisionMethod(int x, int y) {
        return x / y;
    }

    public static int modulusMethod(int x, int y) {
        return x % y;
    }

    public static int getInteger(int min, int max) {
        //min and max values passed when method called under main:
        System.out.println("Enter a number between " + min + " and " + max);

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("That's not in-between 1 and 10...");
            return getInteger(min, max);
        } else {
            System.out.println("Your number is: " + userInput);
            return userInput;
        }
    }

    public static int Factorial(int x) {
        int y = 1;
        for (int i = 1; i <= x; i++){
            y = y * i;
        }
        return y;
    }

    public static int rollDice (int sides){
        int die1 = (int)((Math.random() * sides) + 1);
        int die2 = (int)((Math.random() * sides) + 1);
        int total = die1 + die2;
        System.out.printf("First is %s and Second is %s. The total is %s.", die1, die2, total);
//        System.out.println();
        return total;
    }

}
