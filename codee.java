import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    private int targetNumber;
    private int attempts;
    private Scanner scanner;

    public NumberGuessGame() {
        Random random = new Random();
        targetNumber = random.nextInt(100) + 1; // 1 to 100
        attempts = 0;
        scanner = new Scanner(System.in);
    }

    // Method to play one round
    public void play() {
        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        int guess = 0;
        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number!");
                scanner.next(); // discard invalid input
                continue;
            }
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! The number was " + targetNumber);
                System.out.println("You guessed it in " + attempts + " attempts.");
            }
        }
    }

    // Method to close scanner
    public void close() {
        scanner.close();
    }

    public static void main(String[] args) {
        NumberGuessGame game = new NumberGuessGame();
        game.play();
        game.close();
        System.out.println("Thanks for playing! Goodbye 👋");
    }
}
