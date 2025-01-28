import java.util.Random;
import java.util.Scanner;

public class level3Q12 {

    public static int[][] generateStudentScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100) + 1;
            }
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4];

        for (int i = 0; i < numStudents; i++) {
            double total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3;
            double percentage = (total / 300) * 100;

            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    public static void displayScoreCard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("Student Score Card");
        System.out.println("------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.print("S" + (i + 1) + "\t");
            System.out.print(scores[i][0] + "\t\t");
            System.out.print(scores[i][1] + "\t\t");
            System.out.print(scores[i][2] + "\t\t");
            System.out.print(results[i][0] + "\t");
            System.out.print(results[i][1] + "\t\t");
            System.out.println(results[i][2] + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateStudentScores(numStudents);

        double[][] results = calculateResults(scores, numStudents);

        displayScoreCard(scores, results, numStudents);
    }
}
