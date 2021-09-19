package edu;

import java.util.Scanner;

public class Sumofodd {

	public static void main(String[] args) {
		int i,sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any num");
		int n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			if(i%2!=0)
				sum = sum + i;
		
		}
			System.out.println("Sum of odd"+ " number is:"+sum);
			
		

	}

}
