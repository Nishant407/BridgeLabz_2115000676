import java.util.Scanner;
public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        long result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is: " + result);
        
        scanner.close();
    }
    
    public static long calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }
}
