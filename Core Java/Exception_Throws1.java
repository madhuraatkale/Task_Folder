package edu;

public class Exception_Throws1 {
	public static void validate(int age) {
		if (age<18)
		{
			throw new ArithmeticException("Sorry you are under age to vote");
			
		}
		else
		{ 
			System.out.println("Welcome to vote");
		}
	}
	
	public static void main(String args[])
	{
	
	validate(17);
	System.out.println("procced to fill form");
	}
}
