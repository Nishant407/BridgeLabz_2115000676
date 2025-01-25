import java.util.Scanner;
public class level1Q1{
	public static void main(String[] args){
	int ages[]=new int[10];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the age of 10 students: ");
	for(int i=0;i<ages.length;i++){
		System.out.print("Ente the age for student " + (i+1) + ": ");
		ages[i]=sc.nextInt();
	}
	System.out.println("voting eligibility results:");
	for(int i=0;i<ages.length;i++){
		if(ages[i]<0){
			System.out.println("Invalid age for student " + (i+1));
		}else if(ages[i]>=18){
			System.out.println("The student with the age" + ages[i] + "can vote.");
		}else{
			System.out.println("The student with the age " + ages[i] + " cannnot vote.");
		}
	}
	}
}
