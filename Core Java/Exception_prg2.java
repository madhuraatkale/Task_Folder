package edu;

import java.util.Scanner;
public class Exception_prg2 {

	public static void main(String[] args) {
		Thursday t=new Thursday();

	}

}

	class Thursday{
		public void Division() throws ArithmeticException{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter A value:");
			int a=s.nextInt();
			System.out.println("Enter B value:");
			int b=s.nextInt();
			System.out.println("Division Answer is :"+ (a/b));
		}
	}