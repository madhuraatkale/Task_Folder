package edu;
import java.util.Scanner;
public class SalaryCal {

	public static void main(String[] args) {
	 
		int S =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Salary");
		int salary=sc.nextInt();
		System.out.println("shift");
		int shift=sc.nextInt();
		
		if(salary>=1 && salary<=7999 && shift>=1)
		{
			S=((salary/2) + (salary/(shift*2)));
			System.out.println("output1 is:" +S);
		}
		else if(salary<=1)
		{
			System.out.println("Salary too small");
		}
		else if(salary>=8000)
		{
			System.out.println("Salary too large");
		}
		else if(salary<=1)
		{
			System.out.println("Salary too small");
		}
	}

}
