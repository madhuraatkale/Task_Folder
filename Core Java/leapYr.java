package edu;

import java.util.Scanner;
public class leapYr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any year");
		int year = sc.nextInt();
		
		{
			if((year%4==0) && (year%100!=0) || (year%400==0))
				System.out.println("Is Leap year");
			else 
				System.out.println("Is not Leap Year");
		}

	}

}
