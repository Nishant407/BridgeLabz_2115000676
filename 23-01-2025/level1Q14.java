import java.util.Scanner;
public class level1Q14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive integer to find its factorial.");
		int number=sc.nextInt();
		if(number<0){
			System.out.println("please enter a positive integer.");
		}else{
			long factorial=1;
			int counter=1;
			while(counter<= number){
				factorial *=counter;
				counter++;
			}
			 System.out.println("The factorial of " + number + " is: " + factorial);
		}
	}
}


