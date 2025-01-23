import java.util.Scanner;
public class level1Q2{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the first number: ");
	int num1=sc.nextInt();
	System.out.print("Enter the second number: ");
	int num2=sc.nextInt();
	System.out.print("Enter the third number: ");
	int num3=sc.nextInt();
	boolean isFirstSmallest=(num1<num2)&&(num1<num3);
	if(isFirstSmallest){
		System.out.println("Is the first number the smallest? Yes");
	}else{
		System.out.println("Is the first number the smallest? No");
	}

}
}
