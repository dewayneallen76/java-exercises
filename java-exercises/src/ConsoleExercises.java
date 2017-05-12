import java.util.Scanner;

/**
 * Created by dewayneallen on 5/11/17.
 */
public class ConsoleExercises {

    public static void main(String[] args) {
        int length;
        int width;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length: ");
        System.out.println("Enter width: ");
        length = sc.nextInt();
        width = sc.nextInt();

        System.out.println("The perimeter is: " + (length + width));
        System.out.println("The area is " + (length * 2 + width * 2));
    }
}
