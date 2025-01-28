import java.util.Scanner;

public class level3Q9 {

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];
        
        double slope = (y2 - y1) / (x2 - x1);
        double yIntercept = y1 - slope * x1;
        
        equation[0] = slope;   // Slope (m)
        equation[1] = yIntercept;  // Y-intercept (b)
        
        return equation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();
        
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);
        
        double[] equation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
        
        scanner.close();
    }
}
