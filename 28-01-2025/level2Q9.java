import java.util.Scanner;

public class level2Q9 {

    public static String isPositive(int number) {
        if (number >= 0) {
            return "Positive";
        } else {
            return "Negative";
        }
    }

    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();

            String positivity = isPositive(numbers[i]);
            if (positivity.equals("Positive")) {
                System.out.println(numbers[i] + " is Positive and " + isEven(numbers[i]) + ".");
            } else {
                System.out.println(numbers[i] + " is Negative.");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult > 0) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
