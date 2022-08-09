package util;

import java.util.Scanner;


//Everything goes inside class input
public class Input {

    //create private field named "scanner". When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.
    private Scanner scanner;

    //Input method initializes the scanner, without it the scanner won't run, java will not compile.
    public Input() {
        this.scanner = new Scanner(System.in);
        }

    public String getString(){
        System.out.println("Enter something: ");
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        System.out.println("Y/N? ");
        String userChoice = this.scanner.next().toLowerCase();
        return userChoice.equals("y") || userChoice.equals("yes");
    }


    public int getInt(){
        System.out.println("your int is: ");
        return this.scanner.nextInt();
    }

    public int getInt(int min, int max) {

        System.out.println("Enter a number between " + min + " and " + max);

        int userInput = this.scanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("That's not in-between 1 and 10...");
            return getInt(min, max);
        } else {
            System.out.println("Your number is: " + userInput);
            return userInput;
        }
    }

    //double get int:
    public double getDouble(){
        System.out.println("your int is: ");
        return this.scanner.nextDouble();
    }


    public double getDouble(int min, int max) {

        System.out.println("Enter a double between " + min + " and " + max);

        double userDouble = this.scanner.nextDouble();

        if (userDouble < min || userDouble > max) {
            System.out.println("That's not in-between 1 and 10...");
            return getInt(min, max);
        } else {
            System.out.println("Your number is: " + userDouble);
            return userDouble;
        }
    }



}

