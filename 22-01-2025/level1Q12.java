import java.util.Scanner;
public class level1Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height: ");
        double height = sc.nextDouble();
        double Area= 0.5*base*height;
        double Areaininches= Area*2.54*2.54;
        System.out.println("the area of traingle in cm square is" + Area+ " and in square inches is"+Areaininches );
    }
}
