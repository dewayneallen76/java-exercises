/**
 * Created by dewayneallen on 5/17/17.
 */
public class MethodsExercises {

    int a = 0;
    int b = 0;

    public static int addNumbers(int a, int b) {
        return (a + b);
    }

    public int subtractNumbers(int a, int b) {
        return (a - b);
    }

    public int multiplyNumbers(int a, int b) {
        return (a * b);
    }

    public static void main(String[] args) {
        System.out.println("The sum of the numbers is " + addNumbers(5,5));
    }
}
