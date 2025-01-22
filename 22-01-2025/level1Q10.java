import java.util.Scanner;

public class level1Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        double cmToInches = 2.54;
        double inchesToFeet = 12;
        double totalInches = heightCm / cmToInches;
        int feet = (int) (totalInches / inchesToFeet);
        double inches = totalInches % inchesToFeet;
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + String.format("%.2f", inches));
        input.close();
    }
}
