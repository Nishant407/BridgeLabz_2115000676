import java.util.Scanner;
public class level2Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] digits = new int[10];
        int[] frequency = new int[10];

        while (number > 0) {
            int digit = number % 10;
            digits[digit]++;
            number = number / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (digits[i] > 0) {
                frequency[i] = digits[i];
            }
        }

        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
    }
}
