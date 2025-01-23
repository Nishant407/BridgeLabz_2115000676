import java.util.Scanner;
public class level3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's an Abundant Number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (number % i == 0) { 
                    sum += i;     
                }
            }
            if (sum > number) {
                System.out.println(number + " is an Abundant Number.");
            } else {
                System.out.println(number + " is Not an Abundant Number.");
            }
        }
    }
}


