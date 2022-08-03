import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Say something to Bob!");
        String input = scan.nextLine().trim();

        if(input.endsWith("?")){
            System.out.println("Sure.");
        } else if (input.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if (input.equals("") || input.isBlank()){
            System.out.println("Fine. Be that way!");
        }else{
            System.out.println("Whatever");
        }
    }
}
