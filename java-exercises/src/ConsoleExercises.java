import java.util.Scanner;

/**
 * Created by dewayneallen on 5/11/17.
 */
public class ConsoleExercises {

    public static void main(String[] args) {
        String userInput;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something");
        userInput = sc.nextLine();

        System.out.println("You entered: ---> \"" + userInput + "\" <--");
    }
}
