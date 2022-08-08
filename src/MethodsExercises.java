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

        //Calls method and passes parameters/values:
        getInteger(1, 10);
    }

    //Individual methods can be outside the main methods, but need to be inside the class:

    //Most basic method syntax in java:
//    public static returnType methodName([param1[, param2[, ...]]) {
//        // the statements of the method
//        // a return statement, if a return type is declared
//    }

    public static int additionMethod (int x, int y){
        return x + y;
    }
    public  static int subtractionMethod (int x, int y){
        return x- y;
    }
    public static int multiplicationMethod (int x, int y){
        return x * y;
    }
    public static int divisionMethod (int x, int y){
        return x / y;
    }
    public static int modulusMethod (int x, int y){
        return x % y;
    }

    //    public static int getInteger(int min, int max){
//        System.out.print("Give me a number between 1 & 10");
//        int userInput = getInteger(1, 10);
//
//        if (userInput > 11 || userInput < 1) {
//             return 10;
//        } else {
//            return System.out.print("Give me a number between 1 & 10");
//            ;
//
//        }
//    }
    public static int getInteger(int min, int max) {
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

}