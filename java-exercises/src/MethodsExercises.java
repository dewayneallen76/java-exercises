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

    public static int divideNumbers(int a, int b) {
        if (a == 0 || b == 0) {
            System.out.println("You cannot divide by zero");
        }
        return (a/b);
    }

    public static int modulusNumbers(int a, int b) {
        return (a % b);
    }

    public static void main(String[] args) {
        System.out.println("Addition 5 + 5 using addNumbers method = " + addNumbers(5,5));
        System.out.println("Subtraction 10 - 5 using subtractNumbers method = " + subtractNumbers(10, 5));
        System.out.println("Multiply 4 * 4 using the multiplyNumber method = " + multiplyNumbers(4, 4));
        System.out.println("Divide 10 by 5 using the divideNumber method = " + divideNumbers(10, 5));
        System.out.println("The modulus of 5 and 15 = " + modulusNumbers(5, 15));
    }
}
