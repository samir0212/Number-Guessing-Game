import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1; // generates a number between 1 and 100
        int numberOfGuesses = 0;
        int maxGuesses = 10;

        Scanner scanner = new Scanner(System.in);

        while (numberOfGuesses < maxGuesses) {
            System.out.print("Guess the number (1-100): ");
            int guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses.");
                break;
            } else if (guess < secretNumber) {
                System.out.println("The secret number is higher.");
            } else {
                System.out.println("The secret number is lower.");
            }
        }

        if (numberOfGuesses == maxGuesses) {
            System.out.println("Sorry, you ran out of guesses. The secret number was " + secretNumber + ".");
        }

        scanner.close();
    }
}
