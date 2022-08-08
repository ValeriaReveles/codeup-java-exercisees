package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("You entered: " + input.getString());
        System.out.println("yesNo: " + input.yesNo());
    }
}
