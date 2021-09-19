package edu;
import java.util.Scanner;

public class FactrorialNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any num");
		int n = sc.nextInt();
		
		int i;
		int fact = 1;
		
		for(i=1 ;i<=n ;i++)
		{
			fact = fact*i;
			System.out.println("Factorial of" +n+ "is:" +fact);
			
		}
	}

}
