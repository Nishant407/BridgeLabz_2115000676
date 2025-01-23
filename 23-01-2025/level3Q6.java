import java.util.Scanner;

public class level3Q6 {
    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Declare two double variables for operands and a string for the operator
        double first, second, result;
        String op;

        // Take input for first number, second number, and operator
        System.out.print("Enter first number: ");
        first = scanner.nextDouble();
        
        System.out.print("Enter second number: ");
        second = scanner.nextDouble();
        
        System.out.print("Enter operator (+, -, *, /): ");
        op = scanner.next();

        // Use switch...case to perform calculation based on the operator
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}

