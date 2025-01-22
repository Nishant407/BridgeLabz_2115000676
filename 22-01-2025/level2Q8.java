import java.util.Scanner;
public class level2Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the departure city: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter the destination city: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = scanner.nextDouble();
        System.out.print("Enter the total time taken for the journey (in hours): ");
        double timeTaken = scanner.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;
        System.out.println("\nJourney Details:");
        System.out.println("Traveler's Name: " + name);
        System.out.println("From: " + fromCity + " to " + viaCity + " to " + toCity);
        System.out.println("Total distance: " + totalDistance + " miles");
        System.out.println("Total time taken: " + timeTaken + " hours");
        System.out.println("Average speed: " + averageSpeed + " miles per hour");
    }
}
