package edu;
import java.util.Scanner;

public class Sumevenodd {

	public static void main(String[] args) {
		int even=0,odd=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any integer no");
		int value = sc.nextInt();
		
		for(int i=1; i<=value; i++)
		{
			if(i%2==0)
				even = even+i;
			else
				odd = odd +i;
		}
		System.out.println("sum of all odd nuumber upto" +value + "= " + odd);
		System.out.println("sum of all odd nuumber upto" +value + "= " + even);
		
		

	}

}
