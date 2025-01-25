import java.util.Scanner;
public class level2Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[] weights = new double[numberOfPersons];
        double[] heights = new double[numberOfPersons];
        double[] bmis = new double[numberOfPersons];
        String[] weightStatuses = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            System.out.print("Enter weight (in kg): ");
            weights[i] = scanner.nextDouble();

            System.out.print("Enter height (in meters): ");
            heights[i] = scanner.nextDouble();

            bmis[i] = weights[i] / (heights[i] * heights[i]);

            if (bmis[i] < 18.5) {
                weightStatuses[i] = "Underweight";
            } else if (bmis[i] >= 18.5 && bmis[i] < 24.9) {
                weightStatuses[i] = "Normal weight";
            } else if (bmis[i] >= 25 && bmis[i] < 29.9) {
                weightStatuses[i] = "Overweight";
            } else {
                weightStatuses[i] = "Obesity";
            }
        }

        System.out.println("\nBMI and Weight Status for each person:");
        System.out.println("----------------------------------------------------");
        System.out.println("Person | Weight (kg) | Height (m) | BMI    | Status");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-7d| %-12.2f| %-11.2f| %-7.2f| %s%n", 
                              (i + 1), weights[i], heights[i], bmis[i], weightStatuses[i]);
        }

        scanner.close();
    }
}
