public class ControlFlowExercises {
    public static void main(String[] args) {
        //1. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }
        //2. Do while
        int i = 2;
        do {
            System.out.println(i);
            i = (int) Math.pow(i, 2);
        } while (i <= 10000);

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

    }
}
