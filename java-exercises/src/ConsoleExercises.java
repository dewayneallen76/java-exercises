import java.util.Scanner;

/**
 * Created by dewayneallen on 5/11/17.
 */
public class ConsoleExercises {

    public static void main(String[] args) {
        String userSentence;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence:");
        userSentence = sc.nextLine();

        System.out.print("The sentence you entered was: " + userSentence);

    }

}
