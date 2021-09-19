package edu;
import java.util.Scanner;

public class Allprimeno {

	public static void main(String[] args) {
		int count=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		for(int j=2; j<=num; j++)
		{
			boolean flag= false;
			        for(int i =2; i<j; i++)
			        {
			        		if(j%i==0)
			        		break;
			        }
			        count++;
		}
		System.out.println(count);
	}

}
