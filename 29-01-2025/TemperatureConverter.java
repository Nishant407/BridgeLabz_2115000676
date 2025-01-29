import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Convert to (F)ahrenheit or (C)elsius? Enter F or C: ");
        char choice = scanner.next().charAt(0);
        
        if (choice == 'F' || choice == 'f') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 'C' || choice == 'c') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice. Please enter F or C.");
        }
        
        scanner.close();
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
