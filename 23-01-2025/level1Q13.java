import java.util.Scanner;

public class level1Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            for (int i = 1; i <= n; i++) {
                loopSum += i; 
            }
            System.out.println("Sum calculated using the formula: " + formulaSum);
            System.out.println("Sum calculated using the for loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations match! The results are correct.");
            } else {
                System.out.println("The results do not match. Something went wrong.");
            }
        }
    }
}
