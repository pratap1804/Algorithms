import java.util.Random;
import java.util.Scanner;

public class FindYourNumber {

    public static void main(String[] args)
    {
        int actualNumber;
        int guessedNumber;

        // maximum value for guessing is 100
        final int max = 100;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        boolean correct = false;

        // Actual number is calculated by random function
        // Not displaying the actual number to the user
        actualNumber = rand.nextInt(max) + 1;

        // looping until the guessed number matches the actual number
        while (!correct)
        {

            System.out.println("Guess a number between 1 and 100: ");
            guessedNumber = in.nextInt();

            if (guessedNumber > actualNumber)
            {
                System.out.println("You have guessed a larger number, enter a smaller number than this: ");
            }

            else if (guessedNumber< actualNumber)
            {
                System.out.println("You have guessed a smaller number, enter a larger number than this: ");
            }

            else
            {
                System.out.println("Congratulations you have guessed the number!!!");
                correct = true;
            }
        }
        System.exit(0);
    }
}
