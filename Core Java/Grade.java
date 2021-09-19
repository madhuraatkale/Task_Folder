package edu;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		
		System.out.println("Grades of students");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks");
		int marks = sc.nextInt();
	
		if(marks<25)
		{
			System.out.println("Grade is J");
		}
		else if(marks>=25 && marks <=45)
		{
			System.out.println("Grade is Z");
		}
		else if(marks>=45 && marks <=50)
		{
			System.out.println("Grade is D");
		}
		else if(marks>=50 && marks <=60)
		{
			System.out.println("Grade is C");
		}
		else if(marks>=60 && marks <=80)
		{
			System.out.println("Grade is B");
		}
		else if(marks<=80)
		{
			System.out.println("Grade is A");
		}
		else
		{
			System.out.println("Invalid Grade ");
		}
	}
	

}
