package InternDEV;

import java.util.Scanner;
import java.util.Random;

public class Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("Higher! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Lower! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
        } while (true);

        System.out.println("The secret number was: " + secretNumber);
        sc.close();
    }
}

