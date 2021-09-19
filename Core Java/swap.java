package edu;

public class swap {

	public static void main(String[] args) {
		int a=57,b=82,c;
		a=a+b;//57+82=139
		b=a-b;//139-82=57
		a=a-b;//139-57=82
		System.out.println("value of a:" +a);
		System.out.println("Value of b:" +b);
		
		c = a;// 57
		a = b;//82
		a = c;//57
		System.out.println("a is :" +a);
		System.out.println("b is :" +b);
		

			

	}

}
