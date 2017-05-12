import java.util.Scanner;

/**
 * Created by dewayneallen on 5/11/17.
 */
public class ConsoleExercises {

    public static void main(String[] args) {
        String input1;
        String input2;
        String input3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three words");

        input1 = sc.nextLine();
        input2 = sc.nextLine();
        input3 = sc.nextLine();

        System.out.println("First word " + input1);
        System.out.println("Second word " + input2);
        System.out.println("Third word " + input3);

    }

}
