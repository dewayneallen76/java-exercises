import java.util.Scanner;

/**
 * Created by dewayneallen on 5/17/17.
 */
public class MethodsExercises {

    public static int min = 1;
    public static int max = 10;

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

    public static int getInteger() {
        int userInput;
        System.out.println("Enter a number between 1 and 10:");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("You entered " + userInput);
            return userInput;
        } else {
            System.out.println("You did not enter a number between 1 and 10");
            return getInteger();
        }
    }

    public static void main(String[] args) {
        System.out.println("Addition 5 + 5 using addNumbers method = " + addNumbers(5,5));
        System.out.println("Subtraction 10 - 5 using subtractNumbers method = " + subtractNumbers(10, 5));
        System.out.println("Multiply 4 * 4 using the multiplyNumber method = " + multiplyNumbers(4, 4));
        System.out.println("Divide 10 by 5 using the divideNumber method = " + divideNumbers(10, 5));
        System.out.println("The modulus of 5 and 15 = " + modulusNumbers(5, 15));

        System.out.println(getInteger());
    }
}
