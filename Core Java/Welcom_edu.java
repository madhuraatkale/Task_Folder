package edu;

import java.util.Scanner;

public class Welcom_edu {

	public static void main(String[] args) {
		
		System.out.println("Hi!!!Welcome to Edubridge");
		System.out.println("Enter the choice for calculations");
		System.out.println("\n1.Add \n2.Sub\n3.Mul\n4.Div");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
	

		switch(choice)
		{
		case 1:
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int a=sc1.nextInt();
			int b=sc1.nextInt();
			int c=a+b;
			System.out.println("Addition is "+c);
			break;
			
		case 2:
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int m=sc2.nextInt();
			int n=sc2.nextInt();
			int l=m-n;
			System.out.println("Subtraction is "+l);
			break;
			
		case 3:
			Scanner sc3 = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int p=sc3.nextInt();
			int q=sc3.nextInt();
			int r=p*q;
			System.out.println("Multiplication is "+r);
			break;
			
		case 4:
			Scanner sc4 = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int x=sc4.nextInt();
			int y=sc4.nextInt();
			int z=x/y;
			System.out.println("Division is "+z);
			break;
			
		default:
			System.out.println("enter valid choice");
	}
		System.out.println("if you want to continue enter Yes or No");
	}
			
	}


