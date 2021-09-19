package edu;

import java.util.Scanner;

public class Exception_prg1 {

	public static void main(String[] args) {
		
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the A value :");
		int a=s.nextInt();
		System.out.println("Enter the B value:");
		int b=s.nextInt();
		//add 
			System.out.println("Add :" +(a+b));
		try {
			System.out.println("Div:" +(a/b));
		}
catch(ArithmeticException w) {
	System.out.println("sorry for the trouble...have a greate day");
}
		//null
		System.out.println("Mul:" +(a*b));
	}

}
