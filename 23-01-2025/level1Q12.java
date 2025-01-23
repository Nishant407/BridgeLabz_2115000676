import java.util.Scanner;
public class level1Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            int counter = 1;
            while (counter <= n) {
                loopSum += counter;
                counter++;
            }
            System.out.println("Sum calculated using the formula: " + formulaSum);
            System.out.println("Sum calculated using the while loop: " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both computations match! The results are correct.");
            } else {
                System.out.println("The results do not match. Something went wrong.");
            }
        }
    }
}
