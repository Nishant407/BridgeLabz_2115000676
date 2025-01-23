import java.util.Scanner;
public class level3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.println("The number of digits in 0 is: 1");
        } else {
            int count = 0;
            number = Math.abs(number);
            while (number != 0) {
                number /= 10; 
                count++;  
            }
            System.out.println("The number of digits is: " + count);
        }
    }
}
