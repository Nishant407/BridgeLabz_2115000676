import java.util.Scanner;
public class level2Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = scanner.nextInt();

        double[][] personData = new double[numberOfPersons][3]; 
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for person " + (i + 1));

            double weight = -1;
            while (weight <= 0) {
                System.out.print("Enter weight (in kg, positive value): ");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a valid positive weight.");
                }
            }

            double height = -1;
            while (height <= 0) {
                System.out.print("Enter height (in meters, positive value): ");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a valid positive height.");
                }
            }

            personData[i][0] = weight; 
            personData[i][1] = height; 
            personData[i][2] = weight / (height * height); 

            double bmi = personData[i][2];
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        System.out.println("\nBMI and Weight Status for each person:");
        System.out.println("----------------------------------------------------");
        System.out.println("Person | Weight (kg) | Height (m) | BMI    | Status");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-7d| %-12.2f| %-11.2f| %-7.2f| %s%n", 
                              (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}
