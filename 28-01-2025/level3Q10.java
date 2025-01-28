import java.util.Scanner;

public class level3Q10 {

    public static boolean checkCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC && slopeBC == slopeAC);
    }

    public static boolean checkCollinearUsingArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates for point A:");
        System.out.print("x1: ");
        int x1 = scanner.nextInt();
        System.out.print("y1: ");
        int y1 = scanner.nextInt();

        System.out.println("Enter coordinates for point B:");
        System.out.print("x2: ");
        int x2 = scanner.nextInt();
        System.out.print("y2: ");
        int y2 = scanner.nextInt();

        System.out.println("Enter coordinates for point C:");
        System.out.print("x3: ");
        int x3 = scanner.nextInt();
        System.out.print("y3: ");
        int y3 = scanner.nextInt();

        boolean areCollinearUsingSlope = checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        boolean areCollinearUsingArea = checkCollinearUsingArea(x1, y1, x2, y2, x3, y3);

        if (areCollinearUsingSlope && areCollinearUsingArea) {
            System.out.println("The points A, B, and C are collinear.");
        } else {
            System.out.println("The points A, B, and C are NOT collinear.");
        }

        scanner.close();
    }
}
