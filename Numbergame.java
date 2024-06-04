import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int lowerBound=1;
        int upperBound=100;
        int numberToGuess = random.nextInt(upperBound-lowerBound +1);
        int attempts = 0;
        int maxAttempt=10;
        System.out.println("Welcome to new number guessing game!");
        System.out.println("I have selected a number between" + lowerBound + "And" + upperBound + " Can you guess it?");

        while (attempts < maxAttempt){
            System.out.println("Enter your guess number: ");
            int userGuess = sc.nextInt();
            attempts++;

            if(userGuess == numberToGuess){
                System.out.println("Congratulations! you've guessed the correct number in" + attempts + "attempts");
                break;
            }

            else if(userGuess < numberToGuess){
                System.out.println("Try a higher number.");
            }

            else{
                System.out.println("Try a lower number.");
            }
        }

        if(attempts == maxAttempt){
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + numberToGuess);

        }

        System.out.println("Thanks for playing!");
    }
}
