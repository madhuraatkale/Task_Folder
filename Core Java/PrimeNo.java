package edu;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		int count =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any num");
		int num = sc.nextInt();
		
		for(int i=2; i<num; i++)
		{
			boolean flag=false;
					for(int j=2; j<i; j++)
					{
						if(i%j==0)
							flag=true;
					}
			if(flag==false)
			{
				System.out.print(i+ "\t");
				count++;
			}
		
		}
		System.out.println(" \n Total prime numbers=" +count);
	}
}
	

		
		    
		     
			    
		     
			
	 
	 
			

