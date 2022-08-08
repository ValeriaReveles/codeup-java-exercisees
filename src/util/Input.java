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
        String userChoice = scanner.next().toLowerCase();
        return userChoice.equals("y");
    }



}

