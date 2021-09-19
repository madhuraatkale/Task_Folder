package edu;
import java.util.Scanner;

public class monthyr {

	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
        int year = sc.nextInt();
		
		
		if((year%4==0) && (year%100!=0) || (year%400==0))
		
			System.out.println("Is Leap year");
		else 
			System.out.println("Is not Leap Year");

		System.out.println("Enter any Month");
		int month = sc.nextInt();
		switch(month)
		{
			case 1:
				System.out.println("Itz Jan it has 31 days");
				break;
			case 2:
			     if ((year%4==0) && (year%100!=0) || (year%400==0))
			    	System.out.println("Itz Feb it has 29 days");
			     else
			    	 System.out.println("Itz Feb it has 28 days");	
			     break;
			case 3:
				System.out.println("Itz March it has 31 days");
					break;
			case 4:
				System.out.println("Itz April it has 30 days");
				break;
			case 5:
				System.out.println("Itz May it has 31 days");
				break;
			case 6:
				System.out.println("Itz June it has 30 days");
				break;
			case 7:
				System.out.println("Itz Jully it has 31 days");
				break;
			case 8:
				System.out.println("Itz August it has 31 days");
				break;
			case 9:
				System.out.println("Itz Sept it has 30 days");
				break;
			case 10:
				System.out.println("Itz Oct  it has 31 days");
				break;
			case 11:
				System.out.println("Itz Nov  it has 30 days");
				break;
			case 12:
				System.out.println("Itz Nov  it has 31 days");
				break;
			
			default:
				System.out.println("Invalid Input!!!");
				break;
			
		}
		

	}

}
