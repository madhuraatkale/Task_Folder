package edu;

public class Fibonaci {

	public static void main(String[] args) {
		int k=0, a=0, b=1;
		
		while(k<=50)
		{
			k=a+b;
			System.out.print(k +" ");
			a = b;
			b = k;
		}
		

	}

}
