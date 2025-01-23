import java.util.Scanner;
public class level1Q11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double total=0;
		while(true){
			System.out.print("Enter a number (0 or negative to stop): ");
			double userInput=sc.nextDouble();
			if(userInput<=0){
				break;
			}
			total +=userInput;
		}
		System.out.println("The total sum is: " + total);
	}
}
