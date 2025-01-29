import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        boolean guessedCorrectly = false;
        
        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");
        
        while (!guessedCorrectly) {
            int guess = generateGuess(lowerBound, upperBound, random);
            System.out.println("Is your number " + guess + "? (Enter 'h' for high, 'l' for low, 'c' for correct)");
            
            char feedback = scanner.next().charAt(0);
            
            switch (feedback) {
                case 'h':
                    upperBound = guess - 1;
                    break;
                case 'l':
                    lowerBound = guess + 1;
                    break;
                case 'c':
                    System.out.println("Great! I guessed your number correctly!");
                    guessedCorrectly = true;
                    break;
                default:
                    System.out.println("Invalid input. Please enter 'h', 'l', or 'c'.");
            }
        }
        
        scanner.close();
    }
    
    public static int generateGuess(int lowerBound, int upperBound, Random random) {
        return lowerBound + random.nextInt(upperBound - lowerBound + 1);
    }
}
