/**
 * Created by dewayneallen on 5/17/17.
 */
public class MethodsExercises {

    int a = 0;
    int b = 0;

    public static int addNumbers(int a, int b) {
        return (a + b);
    }

    public static int subtractNumbers(int a, int b) {
        return (a - b);
    }

    public static int multiplyNumbers(int a, int b) {
        return (a * b);
    }

    public static void main(String[] args) {
        System.out.println("Addition 5 + 5 using addNumbers method = " + addNumbers(5,5));
        System.out.println("Subtraction 10 - 5 using subtractNumbers method = " + subtractNumbers(10, 5));
        System.out.println("Multiply 4 * 4 using the mutliplyNumber method = " + multiplyNumbers(4, 4));
    }
}
