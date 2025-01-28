public class level3Q3 {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static int[] storeDigits(int number) {
        int numDigits = countDigits(number);
        int[] digits = new int[numDigits];
        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number = number / 10;
        }
        return digits;
    }

    public static int sumOfDigits(int number) {
        int[] digits = storeDigits(number);
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double sumOfSquaresOfDigits(int number) {
        int[] digits = storeDigits(number);
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number) {
        int sum = sumOfDigits(number);
        return sum != 0 && number % sum == 0;
    }

    public static int[][] findFrequencyOfDigits(int number) {
        int[] digits = storeDigits(number);
        int[][] frequency = new int[10][2];
        
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
            frequency[i][1] = 0;
        }
        
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        
        return frequency;
    }

    public static void main(String[] args) {
        int number = 21;
        
        System.out.println("Count of digits: " + countDigits(number));

        int[] digits = storeDigits(number);
        System.out.print("Digits of the number: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));

        System.out.println("Is Harshad Number: " + isHarshadNumber(number));

        int[][] frequency = findFrequencyOfDigits(number);
        System.out.println("Frequency of digits:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}
