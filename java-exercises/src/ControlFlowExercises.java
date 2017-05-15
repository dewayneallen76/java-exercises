/**
 * Created by dewayneallen on 5/13/17.
 */
public class ControlFlowExercises {

    public static void main(String[] args) {
        int i;

        for(i = 0; i <= 100; i++) {
            if((i % 3) == 0) {
                System.out.println("Fizz");
            }
            if((i % 5) == 0) {
                System.out.println("Buzz");
            }
            if((i % 3) == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(String.valueOf(i));
            }

        }

    }
}
