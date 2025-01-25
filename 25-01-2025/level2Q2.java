import java.util.Scanner;
public class level2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();

            System.out.print("Enter height for " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        int youngestAge = ages[0];
        double tallestHeight = heights[0];
        String youngestFriend = names[0];
        String tallestFriend = names[0];

        for (int i = 1; i < 3; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                youngestFriend = names[i];
            }

            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                tallestFriend = names[i];
            }
        }

        System.out.println("\nThe youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight);

        scanner.close();
    }
}
