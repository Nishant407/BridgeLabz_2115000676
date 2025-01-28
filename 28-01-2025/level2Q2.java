import java.util.Scanner;

public class level2Q2{

    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a natural number (greater than 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Input is not a natural number. Exiting the program.");
        } else {
            int recursiveSum = sumUsingRecursion(n);
            int formulaSum = sumUsingFormula(n);

            System.out.println("Sum using recursion: " + recursiveSum);
            System.out.println("Sum using formula: " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("Both computations match. The results are correct.");
            } else {
                System.out.println("There is a discrepancy in the results.");
            }
        }

        scanner.close();
    }
}
